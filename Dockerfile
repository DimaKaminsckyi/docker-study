FROM gradle:7.5-jdk17 AS build
WORKDIR /app
COPY build.gradle .
COPY settings.gradle .
COPY src ./src
RUN gradle build -x test

FROM tomcat:9.0.56-jdk17-openjdk-slim
WORKDIR /usr/local/tomcat/webapps
COPY --from=build /app/build/libs/docker-study-0.0.1-SNAPSHOT.war ./ROOT.war
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "./ROOT.war"]
