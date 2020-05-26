FROM amazoncorretto:11
EXPOSE 8080
ARG JAR_FILE=build/libs/simplyCook-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]