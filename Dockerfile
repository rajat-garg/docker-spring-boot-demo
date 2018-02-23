FROM openjdk:8

# Add jar to docker container
ADD target/dock-1.0.jar dock-1.0.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","dock-1.0.jar"]