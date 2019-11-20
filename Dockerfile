FROM java:8-jdk-alpine

COPY ./target/CarAdvert.jar /usr/app/

ENTRYPOINT ["java","-jar","usr/app/CarAdvert.jar"]
