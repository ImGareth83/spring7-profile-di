# spring-7-di

A small Spring Boot 4 / Spring Framework 7 project that demonstrates Dependency Injection with profile-based service selection (`dev`, `qa`, `uat`, `prod`).

## Requirements
- Java 21+
- Maven 3.9+

## Run
Default profile is `dev`:

```bash
mvn spring-boot:run
```

Run with a specific Maven profile:

```bash
mvn -Pdev spring-boot:run
mvn -Pqa spring-boot:run
mvn -Puat spring-boot:run
mvn -Pprod spring-boot:run
```

## API
- `GET /datasource` -> returns active datasource label (`dev`, `qa`, `uat`, or `prod`).

## Test
```bash
mvn test
```

Run full build:

```bash
mvn clean install
```

## Project Structure
- `src/main/java/.../services` - `DataSourceService` and profile-specific implementations
- `src/main/java/.../controllers` - `DataSourceController`
- `src/test/java/.../controllers` - controller web-slice tests
- `src/test/java/.../services` - profile integration tests
