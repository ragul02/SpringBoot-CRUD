FROM openjdk:17-jdk-alpine AS builder
WORKDIR /app
COPY target/dbconnect-0.0.1-SNAPSHOT.jar app.jar
COPY src/main/resources/logback.xml /app/logback.xml
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
LABEL maintainer = "ragul angamuthu"