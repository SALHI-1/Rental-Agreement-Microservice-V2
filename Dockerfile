FROM eclipse-temurin:17-jre-alpine
LABEL maintainer="saaymo"

# 1. Sécurité : Ne pas exécuter en tant que root
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# 2. Clarté : Exposer le port configuré dans application.properties
EXPOSE 8083

ENV JAVA_OPTS="-Xms256m -Xmx512m"
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /app.jar"]
