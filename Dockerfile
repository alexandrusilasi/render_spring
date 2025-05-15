# Etapa de build: Maven + Java 21
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Etapa de rulare: imagine finală cu JDK 21
FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY --from=build /app/target/api-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]