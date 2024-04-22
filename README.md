# Proyecto API REST para Gestión de Libros con Java y Spring Boot

Este proyecto es una API REST para la gestión de libros, construida con Java y Spring Boot. Proporciona varios endpoints para crear, obtener, actualizar y eliminar libros.

## Requisitos

- Java 17 o superior
- Maven 3 o superior

## Instalación y Compilación

Para compilar el proyecto, asegúrate de tener Maven instalado. Desde la raíz del proyecto, ejecuta el siguiente comando:

```bash
mvn clean install
```
Este comando limpiará el proyecto, compilará las clases y empaquetará el proyecto en un archivo JAR.

## Ejecución
Para ejecutar el proyecto, usa el archivo JAR generado por Maven. Desde la raíz del proyecto, ejecuta el siguiente comando:

```bash
java -jar target/test-back-end-sysman.jar
```

Asegúrate de reemplazar test-back-end-sysman.jar con el nombre del archivo JAR que fue generado durante la compilación.

Por defecto, el servicio se ejecutará en el puerto 8080. Puedes cambiar esto modificando el archivo de configuración application.properties o application.yml.

## Endpoints de la API

Esta API REST para la gestión de libros incluye los siguientes endpoints:

- **POST /libros**
    - Crea un nuevo libro.
    - El cuerpo de la solicitud debe contener información sobre el libro, como el título, el autor, y la fecha de publicación.
    - Ejemplo de cuerpo de solicitud:
      ```json
      {
        "title": "El Nombre del Viento",
        "author": "Patrick Rothfuss",
        "publicationDate": "2007-03-27"
      }
      ```

- **GET /libros**
    - Devuelve la lista de todos los libros disponibles.

- **GET /libros/{id}**
    - Devuelve un libro específico por su ID.
    - Reemplaza `{id}` con el ID del libro que deseas obtener.

- **PUT /libros/{id}**
    - Actualiza un libro existente.
    - Reemplaza `{id}` con el ID del libro que deseas actualizar.
    - El cuerpo de la solicitud debe contener los campos a actualizar.
    - Ejemplo de cuerpo de solicitud:
      ```json
      {
        "title": "El Temor de un Hombre Sabio"
      }
      ```

- **DELETE /libros/{id}**
    - Elimina un libro por su ID.
    - Reemplaza `{id}` con el ID del libro que deseas eliminar.

---
