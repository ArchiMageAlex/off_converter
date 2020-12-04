package com.nfp.converters;

import com.nfp.converters.model.OpenFoodFact;
import com.nfp.converters.repositories.OpenFoodFactRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.cli.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.DataIntegrityViolationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@SpringBootApplication
@Configuration
public class Csv2postgresApplication implements CommandLineRunner {
    private final Object lockObj = new Object();
    private OpenFoodFactRepository repo;
    @Value("${com.nfp.converters.csv2postgres.tic:10000}")
    private long tic = 10000; // every tic print status
    private long linesCount;
    private boolean test;

    public static void main(String[] args) {
        SpringApplication.run(Csv2postgresApplication.class, args);
    }

    @Autowired
    public void setRepo(OpenFoodFactRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) throws Exception {
        HelpFormatter formatter = new HelpFormatter();
        log.debug("Start app");
        CommandLineParser parser = new BasicParser();
        Options options = new Options();
        options.addOption(OptionBuilder
                .withLongOpt("filename")
                .withArgName("filename")
                .hasArg(true)
                .withDescription("File name").create());
        options.addOption(OptionBuilder.withLongOpt("test").withArgName("test").create());
        CommandLine cmd = parser.parse(options, args);
        test = cmd.hasOption("test");
        log.info("Testing mode (without import) = {}", test);
        String filename = cmd.getOptionValue("filename");

        if (null != filename && !filename.isEmpty()) {
            readFile(filename);
        } else {
            log.error("Filename parameter is empty");
            formatter.printHelp("Csv2postgresApplication", options);
        }

        log.debug("End app");
    }

    private void readFile(String filename) throws IOException {
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(filename))) {
            log.debug("Read header");
            List<String> headers = Arrays.asList(br.readLine().replace("-", "_").split("\t").clone());
            log.debug("Fields count: {}", headers.size());

            log.debug("Read data with tic every {} lines", tic);
            br.lines().parallel().forEach(l -> createFact(Arrays.asList(l.replace("-", "_").split("\t").clone())));
            log.info("{} lines processed", linesCount);
        }
    }

    private void createFact(List<String> l) {
        OpenFoodFact fact = new OpenFoodFact();
        int fieldCounter = 0;
        String methodName = "";

        for (Field field : OpenFoodFact.class.getDeclaredFields()) {
            Method m;

            try {
                String value = l.get(fieldCounter);
                methodName = "set" + field.getName().substring(0, 1).toUpperCase()
                        + field.getName().substring(1);
                try {
                    m = OpenFoodFact.class.getDeclaredMethod(methodName, String.class);
                    m.invoke(fact, value);
                } catch (NoSuchMethodException e) {
                    if (!value.isEmpty()) {
                        m = OpenFoodFact.class.getDeclaredMethod(methodName, Double.class);

                        if (value.contains("_")) {
                            log.error("Product code={}. Value of field {} contains underscore: {}"
                                    , field.getName()
                                    , fact.getCode()
                                    , value);
                            m.invoke(fact, Double.valueOf(value.replace("_", "")));
                        } else {
                            m.invoke(fact, Double.valueOf(value));
                        }
                    }
                } catch (IllegalAccessException e) {
                    log.error("", e);
                } catch (InvocationTargetException e) {
                    log.error("", e);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                // Do nothing, it's mostly expected behaviour
            } catch (Exception e) {
                log.debug("Value: {}, Method name: {}, Current object: {}", l.get(fieldCounter), methodName, fact.toString());
                log.error("Exception is: ", e);
            }

            fieldCounter++;
        }

        if (!test) {
            try {
                repo.save(fact);
            } catch (DataIntegrityViolationException e) {
                log.debug("Current object: {}", fact.toString());
                log.error("Exception is:", e);
            }
        }

        updateProcess(fact.toString());
    }

    private void updateProcess(String toPrint) {
        synchronized (lockObj) {
            linesCount++;
        }

        if (linesCount % tic == 0) {
            log.info("{} lines processed", linesCount);
        }
    }
}