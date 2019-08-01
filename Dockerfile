FROM openjdk:11-jdk-slim
VOLUME /tmp
ARG DEPENDENCY=targetgit
COPY ${DEPENDENCY} /app
ENTRYPOINT ["java","-jar","app/platform-1.0-SNAPSHOT.jar"]
