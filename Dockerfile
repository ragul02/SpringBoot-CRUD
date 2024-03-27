FROM openjdk:17-jdk-alpine AS builder
WORKDIR /app
COPY target/*.jar app.jar
COPY src/main/resources/logback.xml /app/logback.xml
EXPOSE 8080
ENTRYPOINT ["java","-Dspring.profiles.active=qa","-jar","app.jar"]
LABEL maintainer = "ragul angamuthu"

# Set the working directory in the container
# WORKDIR /app

# Copy the pom.xml and source code into the container
# COPY pom.xml .
# COPY src src

# Build the application
# RUN mvn clean package

# The target directory is where Maven places the built jar
# CMD ["java", "-jar", "target/sepainst-poc.jar"]
