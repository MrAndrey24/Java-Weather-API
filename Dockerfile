FROM amazoncorretto:21-alpine

WORKDIR /app

ARG JAR_FILE=build/libs/weather-app.1.0.0.jar

COPY ${JAR_FILE} app.jar


EXPOSE 8080


ENTRYPOINT ["java", "-jar", "app.jar"]