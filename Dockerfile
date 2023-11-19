FROM alpine:latest
RUN apk --update add openjdk17-jre
COPY ./docker-hello-world-example.jar app.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]
