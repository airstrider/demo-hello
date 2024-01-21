FROM openjdk:17
# FROM eclipse-temurin:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} demo-hello.jar
ENTRYPOINT ["java","-jar","demo-hello.jar"]
