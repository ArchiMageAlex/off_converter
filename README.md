# OpenFoodFacts CSV to PostgreSQL converter

## Getting Started

### Reference Documentation
    Check database settings at application.properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
    spring.datasource.username=postgres
    spring.datasource.password=postgres
    # every tic print progress (lines of file processed)
    com.nfp.converters.csv2postgres.tic=100000

### Guides
Place OpenFoodFacts products csv file to path and point it at the program parameters

Get it from here: https://static.openfoodfacts.org/data/en.openfoodfacts.org.products.csv

Run: mvn spring-boot:run --filename en.openfoodfacts.org.products.txt
