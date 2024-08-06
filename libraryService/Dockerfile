FROM openjdk:17-jdk-alpine

WORKDIR /libraryService

COPY target/libraryService-0.0.1-SNAPSHOT.jar libraryService.jar

EXPOSE 8092

ENTRYPOINT ["java", "-jar", "libraryService.jar"]
