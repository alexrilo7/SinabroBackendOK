# Usa una imagen base de Java 17 (compatible con Spring Boot 3.x)
FROM openjdk:17-jdk-alpine

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR generado al contenedor
COPY target/backend-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto en el que corre tu aplicación (por defecto, 8080)
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
