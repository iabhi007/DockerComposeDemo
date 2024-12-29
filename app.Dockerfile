FROM amazoncorretto:17-alpine-jdk

COPY target/DockerComposeDemo-1.0-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]