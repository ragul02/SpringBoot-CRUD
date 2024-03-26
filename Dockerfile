FROM openjdk:17-jdk-alpine AS builder
WORKDIR /app
COPY /home/runner/work/SpringBoot-CRUD/SpringBoot-CRUD/target/dbconnect-0.0.1-SNAPSHOT.jar.original app.jar
COPY src/main/resources/logback.xml /app/logback.xml
EXPOSE 8080
ENTRYPOINT ["java","-Dspring.profiles.active=qa","-jar","app.jar"]
LABEL maintainer = "ragul angamuthu"
