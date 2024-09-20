FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/blog-service-0.0.1-SNAPSHOT.jar blog-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "blog-service.jar"]

