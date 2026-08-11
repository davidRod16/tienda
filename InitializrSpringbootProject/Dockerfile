# Etapa 1: Compilacion

FROM maven:3.9.11-eclipse-temurin-24 AS build

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline -B

COPY src ./src

RUN mvn clean package -DskipTests

# Etapa 2: Ejecucion

FROM eclipse-temurin:24-jre

WORKDIR /app

RUN groupadd -r spring && useradd -r -g spring spring && usermod -a -G 1000 spring

USER spring:spring

COPY --from=build /app/target/tienda-1.jar app.jar

EXPOSE 10000

ENTRYPOINT ["java", "-XX:+UseContainerSupport", "-XX:MaxRAMPercentage=60.0", "-jar", "app.jar"]
