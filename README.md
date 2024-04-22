# Proyecto API RESTful con Java y Spring Boot

Este proyecto es una API RESTful construida con Java y Spring Boot que proporciona funcionalidades para gestionar libros y autores en una biblioteca.

## Requisitos del Entorno de Desarrollo
Antes de ejecutar este proyecto, debes asegurarte de tener lo siguiente:

- **Java JDK**: Asegúrate de tener instalada la versión recomendada de Java (JDK 17 o superior).
- **Maven**: Una herramienta para la gestión de proyectos y la construcción de aplicaciones Java. Descarga e instala Maven si no lo tienes.
- **IDE**: Un entorno de desarrollo integrado, como IntelliJ IDEA, Eclipse, o Visual Studio Code.

## Configuración del Proyecto
Para configurar el proyecto:

1. **Clonar el Repositorio**:
   Clona el repositorio del proyecto usando `git` o descarga el archivo ZIP desde tu sistema de control de versiones preferido.
    ```bash
    git clone https://github.com/tu-repositorio/apirest-spring-boot.git

2. Importar el Proyecto en tu IDE:
Abre tu IDE y selecciona la opción para importar un proyecto existente. Luego, selecciona la carpeta del proyecto que acabas de clonar o descomprimir.

3. Compilar el Proyecto:
Una vez importado, usa Maven para compilar el proyecto y descargar las dependencias necesarias.

    ```bash
    mvn clean install

Este comando limpiará el proyecto, compilará las clases y empaquetará el proyecto en un archivo JAR.

## Ejecución
Para ejecutar el proyecto, usa el archivo JAR generado por Maven. Desde la raíz del proyecto, ejecuta el siguiente comando:

    java -jar target/test-back-end-sysman.jar

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
