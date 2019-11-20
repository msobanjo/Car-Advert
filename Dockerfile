FROM java:8-jdk-alpine

COPY ./target/CarAdvert-0.0.1-SNAPSHOT.jar /usr/app/

ENTRYPOINT ["java","-jar","usr/app/CarAdvert-0.0.1-SNAPSHOT.jar"]
