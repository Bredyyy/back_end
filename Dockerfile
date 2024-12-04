FROM ubuntu:latast AS build

RUN apt-get update
RUN apt-get install opnejdk-17jdk -y
COPY . .

RUN apt-get install maven -y
RUN mvn clean install

FROM openjdk:17-jdk-slim

EXPOSE 8080

COPY --from=build /target\back_end-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT [ "java", "-jar", "app,jar" ]