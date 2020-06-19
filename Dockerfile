FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD ./target/users.jar users.jar
ENTRYPOINT ["java","-jar","/users.jar"]