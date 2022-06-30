FROM openjdk:8-jdk-alpine
MAINTAINER moviebokkingapp.in
COPY target/Booking-service.jar Booking-service.jar
EXPOSE 8084
ENTRYPOINT ["java","-jar","Booking-service.jar"]