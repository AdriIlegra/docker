ARG MAVEN_VERSION=3.6.3-openjdk-17

FROM maven:${MAVEN_VERSION} as maven

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn package -DskipTests


FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY --from=maven /app/target/*.jar ./app.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "app.jar"]



