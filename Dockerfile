# core-t/Dockerfile
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/saga-pattern-spring-boot-0.0.1-SNAPSHOT.jar core-t.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "core-t.jar"]