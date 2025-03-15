FROM openjdk:17
COPY target/grocery-api.jar grocery-api.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "grocery-api.jar"]