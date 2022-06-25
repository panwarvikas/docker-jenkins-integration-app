FROM openjdk:8
Expose:9898
ADD target/docker-jenkins-integration-app-1.0-SNAPSHOT.jar docker-jenkins-integration-app.jar
EntryPOINT ["java","-jar","/docker-jenkins-integration-app.jar"]