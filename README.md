Build by gradle:
gradlew build && java -jar build/libs/demo-0.0.1-SNAPSHOT.jar
Build image by dockerfile:
docker build --build-arg JAR_FILE=build/libs/*.jar -t firstDemo/demo .
Build image by gradle docker plugin:
gradlew dockerBuildImage