FROM openjdk:10
ADD target/tccserver-0.0.1-SNAPSHOT.jar tccserver-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "tccserver-0.0.1-SNAPSHOT.jar"]