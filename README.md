# OpenFoodFacts CSV to PostgreSQL converter

### Original data of OpenFoodFacts
Download page: https://world.openfoodfacts.org/data

### Getting Started
Check database settings at application.properties

    spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
    spring.datasource.username=postgres
    spring.datasource.password=postgres
    # every tic print progress (lines of file processed)
    com.nfp.converters.csv2postgres.tic=100000

### Running guide
Place OpenFoodFacts products csv file to path and point it at the program parameters

Get it from here: https://static.openfoodfacts.org/data/en.openfoodfacts.org.products.csv

Run: java -jar csv2postgres-1.1.0-RELEASE.jar --filename en.openfoodfacts.org.products.csv

Wait approx 4 hours at hardware like:
    Intel Core i7 3770K, 32GB RAM, HDD 7200 RPM
    PostgreSQL 13 at default Docker Desktop host

Test mode much more faster, help to understand that CSV file doesn't contains errors in data
To swith test mode on add --test option to command line
