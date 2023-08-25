# syntax=docker/dockerfile:1
FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

# COPY .mvn/ .mvn
# COPY mvnw pom.xml ./
# RUN ./mvnw dependency:resolve

# COPY src ./src

# CMD ["./mvnw", "spring-boot:run"]

COPY ./target/PokeTypes-0.0.1-SNAPSHOT.jar /app
EXPOSE 8000
CMD ["java", "-jar", "PokeTypes-0.0.1-SNAPSHOT.jar"]
