# Proyecto de Prueba - Desarrollador Java Backend
Este proyecto es una prueba técnica para el cargo de Desarrollador Java Backend. El objetivo principal es crear un servicio web en Java utilizando Spring Boot para integrar servicios externos proporcionados en el enlace proporcionado.

# Descripción del Proyecto
El proyecto consiste en desarrollar un servicio web en Java con Spring Boot que consuma tres servicios externos. Estos servicios proporcionan información sobre productos y categorías, y también permiten crear nuevos productos. Se debe implementar un conjunto de endpoints para interactuar con estos servicios externos.

# Requerimientos
Antes de ejecutar el proyecto, asegúrate de tener instalado lo siguiente:

- Java JDK 11 o superior.
- IDE (por ejemplo, IntelliJ, Eclipse) o Editor de texto para visualizar y editar el código.
- Graddle para gestionar las dependencias del proyecto.

# Estructura del Proyecto
La estructura del proyecto está organizada de la siguiente manera:

```
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com.example.backend/
│   │   │   │   ├── controller/
│   │   │   │   │   ├── ProductController.java
│   │   │   │   │   ├── CategoryController.java
│   │   │   │   ├── model/
│   │   │   │   │   ├── Product.java
│   │   │   │   │   ├── Category.java
│   │   │   │   │   ├── ProductRequest.java
│   │   │   │   ├── service/
│   │   │   │   │   ├── ApiClient.java
│   │   │   ├── BackendApplication.java
│   ├── resources/
│   │   ├── application.properties
│   ├── test/
│   │   ├── java/
│   │   │   ├── com.example.backend/
│   │   │   │   ├── controllers/
│   │   │   │   │   ├── ProductoControllerTest.java
│   │   │   │   │   ├── CategoriaControllerTest.java
│   │   │   │   ├── services/
│   │   │   │   │   ├── ApiClientTest.java
```

# Tecnologías Utilizadas
- Java
- Spring Boot
- Spring Web
- RestTemplate

# Autor
Nombre: Juan Camilo Restrepo Bareño

# Notas Adicionales
Este proyecto fue creado como parte de una prueba técnica para el cargo de Desarrollador Java Backend. Cualquier mejora, sugerencia o corrección es bienvenida. ¡Gracias por revisar este proyecto!
