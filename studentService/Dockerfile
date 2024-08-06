FROM openjdk:17-jdk-alpine

WORKDIR /studentService

COPY target/studentService-0.0.1-SNAPSHOT.jar studentService.jar

EXPOSE 8091

ENTRYPOINT ["java", "-jar", "studentService.jar"]
