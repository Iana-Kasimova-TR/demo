FROM amazoncorretto:11
EXPOSE 8080
ARG JAR_FILE=simplyCook*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]