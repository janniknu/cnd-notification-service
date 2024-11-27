FROM maven:3.9.4-eclipse-temurin-21 AS build

WORKDIR /app

# Kopiere die pom.xml und lade die Abhängigkeiten herunter
COPY pom.xml .
RUN mvn dependency:go-offline

# Kopiere den Rest des Projekts und baue es
COPY src ./src
RUN mvn clean package

# Verwende ein OpenJDK-Basis-Image zum Ausführen des Services
FROM eclipse-temurin:21-jre

# Setze das Arbeitsverzeichnis
WORKDIR /app

# Kopiere das gebaute JAR-File vom vorherigen Build-Image
COPY --from=build /app/target/*.jar notification_service.jar

# Exponiere den Port, auf dem der Service läuft
EXPOSE 8080

# Setze den Befehl zum Starten des Notification-Service
#CMD ["java", "-jar", "notification_service.jar"]