FROM maven:3.8.4-openjdk-17-slim AS builder
WORKDIR /src
COPY . .
RUN mvn clean install

FROM openjdk:17-alpine3.14
COPY --from=builder /src/target/flight-manager-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]