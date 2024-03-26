FROM openjdk:17-jdk-alpine AS builder
WORKDIR /app
COPY target/*.jar app.jar
COPY src/main/resources/logback.xml /app/logback.xml
EXPOSE 8080
ENTRYPOINT ["java","-Dspring.profiles.active=qa","-jar","app.jar"]
LABEL maintainer = "ragul angamuthu"
