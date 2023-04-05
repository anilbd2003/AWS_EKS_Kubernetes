FROM eclipse-temurin:17-alpine

EXPOSE 8080

WORKDIR /app

ADD target/docker-demo.jar ./dockerdemo.jar

ENTRYPOINT ["java", "-jar", "dockerdemo.jar" ]