# 🏋️‍♂️ Zona Fit - Sistema de Gestión de Clientes

![Java](https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=for-the-badge&logo=springboot)
![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-Database-blue?style=for-the-badge)
![Swing](https://img.shields.io/badge/Java%20Swing-GUI-purple?style=for-the-badge)
![FlatLaf](https://img.shields.io/badge/FlatLaf-Dark%20Mode-black?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven)
![Lombok](https://img.shields.io/badge/Lombok-Clean%20Code-pink?style=for-the-badge)

---

## 📌 Descripción del proyecto

**Zona Fit** es una aplicación desarrollada con **Java Spring Boot** para la gestión de clientes de un gimnasio.

El proyecto inició como una aplicación de consola, pero posteriormente fue mejorado con una **interfaz gráfica usando Java Swing**, permitiendo administrar clientes de una forma más visual, cómoda e intuitiva.

El sistema permite realizar operaciones CRUD completas:

- Crear clientes
- Listar clientes
- Actualizar información de clientes
- Eliminar clientes
- Visualizar clientes en una tabla
- Seleccionar registros desde la interfaz gráfica

---

## ✨ Características principales

✅ Aplicación desarrollada con Java y Spring Boot  
✅ Interfaz gráfica con Java Swing  
✅ Modo oscuro utilizando FlatLaf  
✅ Gestión completa de clientes  
✅ Tabla visual para mostrar registros  
✅ Botones para guardar, eliminar y limpiar formulario  
✅ Arquitectura organizada por capas  
✅ Persistencia de datos con Spring Data JPA  
✅ Uso de repositorios, servicios e interfaces  
✅ Código más limpio con Lombok  
✅ Aplicación preparada para portafolio en GitHub  

---

## 🖥️ Interfaz gráfica

La aplicación cuenta con una ventana principal donde se pueden administrar los clientes del gimnasio.

Desde la interfaz se puede:

- Ingresar nombre del cliente
- Ingresar apellido del cliente
- Ingresar número de membresía
- Guardar un nuevo cliente
- Seleccionar un cliente desde la tabla
- Modificar datos de un cliente existente
- Eliminar un cliente seleccionado
- Limpiar el formulario

---

## 🛠️ Tecnologías utilizadas

| Tecnología | Descripción |
|----------|-------------|
| Java | Lenguaje principal del proyecto |
| Spring Boot | Framework principal de la aplicación |
| Spring Data JPA | Manejo de persistencia y operaciones CRUD |
| Jakarta Persistence | Definición de entidades JPA |
| Java Swing | Creación de la interfaz gráfica |
| FlatLaf | Diseño visual moderno con modo oscuro |
| Lombok | Reducción de código repetitivo |
| Maven | Gestión de dependencias y construcción del proyecto |
| SLF4J Logger | Registro de mensajes en consola |
| MySQL | Base de datos utilizada para almacenar clientes |

---

## 📂 Estructura del proyecto

```text
src/main/java/st/zona_fit
│
├── ZonaFitApplication.java
├── ZonaFitSwing.java
│
├── gui
│   └── ZonaFitForma.java
│
├── modelo
│   └── Cliente.java
│
├── repositorio
│   └── ClienteRepositorio.java
│
└── servicio
    ├── IClienteServicio.java
    └── ClienteServicio.java
```

---

## 🧱 Arquitectura del sistema

El proyecto está estructurado bajo una arquitectura por capas, separando responsabilidades para mantener un código más ordenado, escalable y fácil de mantener.

### 1. Capa principal

Contiene las clases encargadas de iniciar la aplicación.

- `ZonaFitApplication`: versión de consola.
- `ZonaFitSwing`: versión con interfaz gráfica Swing.

### 2. Capa GUI

Contiene la interfaz gráfica del sistema.

- `ZonaFitForma`: ventana principal donde se gestionan los clientes.

### 3. Capa modelo

Contiene la entidad principal del sistema.

- `Cliente`: representa a un cliente del gimnasio.

### 4. Capa repositorio

Contiene la interfaz encargada de comunicarse con la base de datos.

- `ClienteRepositorio`: extiende de `JpaRepository`.

### 5. Capa servicio

Contiene la lógica de negocio del sistema.

- `IClienteServicio`: define las operaciones disponibles.
- `ClienteServicio`: implementa las operaciones del sistema.

---

## 👤 Modelo Cliente

La entidad `Cliente` representa los datos principales de cada cliente registrado en el gimnasio.

| Campo | Tipo | Descripción |
|------|------|-------------|
| id | Integer | Identificador único del cliente |
| nombre | String | Nombre del cliente |
| apellido | String | Apellido del cliente |
| membresia | Integer | Número de membresía del cliente |

---

## 🧩 Funcionalidades implementadas

| Funcionalidad | Descripción |
|-------------|-------------|
| Listar clientes | Muestra todos los clientes registrados en una tabla |
| Agregar cliente | Permite registrar un nuevo cliente |
| Modificar cliente | Permite actualizar la información de un cliente existente |
| Eliminar cliente | Elimina un cliente seleccionado |
| Limpiar formulario | Limpia los campos de texto y deselecciona la tabla |
| Selección desde tabla | Al seleccionar un cliente, sus datos se cargan en el formulario |
| Modo oscuro | La interfaz usa FlatLaf con tema oscuro |

---

## 🖼️ Interfaz del sistema

La ventana principal incluye:

- Tabla de clientes
- Campo para nombre
- Campo para apellido
- Campo para membresía
- Botón Guardar
- Botón Eliminar
- Botón Limpiar

```text
-------------------------------------------------
|                 Zona Fit                      |
-------------------------------------------------
| ID | Nombre | Apellido | Membresía             |
-------------------------------------------------
| 1  | Juan   | Pérez    | 1001                  |
| 2  | Ana    | López    | 1002                  |
-------------------------------------------------

Nombre:     [________________]
Apellido:   [________________]
Membresía:  [________________]

[ Guardar ]   [ Eliminar ]   [ Limpiar ]
```

---

## ⚙️ Instalación y ejecución

### 1. Clonar el repositorio

```bash
git clone https://github.com/Sadeths/zona-fit.git
```

### 2. Entrar a la carpeta del proyecto

```bash
cd zona-fit
```

### 3. Compilar el proyecto

```bash
mvn clean compile
```

### 4. Ejecutar la aplicación con interfaz gráfica

```bash
mvn spring-boot:run -Dspring-boot.run.main-class=st.zona_fit.ZonaFitSwing
```

También puedes ejecutar directamente la clase:

```text
st.zona_fit.ZonaFitSwing
```

desde tu IDE, como IntelliJ IDEA o VS Code.

---

## 🔧 Configuración de base de datos

Antes de ejecutar el proyecto, se debe configurar la conexión a la base de datos en el archivo:

```text
src/main/resources/application.properties
```

Ejemplo de configuración con MySQL:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/zona_fit
spring.datasource.username=root
spring.datasource.password=tu_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

> Nota: Debes crear previamente la base de datos `zona_fit` en MySQL o adaptar la configuración según tu entorno.

---

## 📦 Dependencias principales

El proyecto utiliza dependencias como:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<dependency>
    <groupId>com.formdev</groupId>
    <artifactId>flatlaf</artifactId>
    <version>3.5.1</version>
</dependency>

<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <scope>runtime</scope>
</dependency>

<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <optional>true</optional>
</dependency>
```

---

## 🚀 Flujo de uso de la aplicación

### Agregar cliente

1. Escribir el nombre.
2. Escribir el apellido.
3. Ingresar el número de membresía.
4. Presionar el botón **Guardar**.
5. El cliente aparecerá automáticamente en la tabla.

---

### Modificar cliente

1. Seleccionar un cliente desde la tabla.
2. Sus datos se cargarán en el formulario.
3. Modificar los campos necesarios.
4. Presionar **Guardar**.
5. La tabla se actualizará con los nuevos datos.

---

### Eliminar cliente

1. Seleccionar un cliente desde la tabla.
2. Presionar el botón **Eliminar**.
3. El cliente será eliminado de la base de datos.
4. La tabla se actualizará automáticamente.

---

### Limpiar formulario

1. Presionar el botón **Limpiar**.
2. Los campos se vaciarán.
3. Se quitará la selección activa de la tabla.

---

## 🎯 Objetivo del proyecto

El objetivo principal de este proyecto es practicar el desarrollo de aplicaciones con **Java Spring Boot**, aplicando conceptos fundamentales de backend y complementándolos con una interfaz gráfica de escritorio usando **Java Swing**.

Este proyecto permite reforzar conocimientos como:

- Programación orientada a objetos
- Arquitectura por capas
- Creación de entidades JPA
- Uso de repositorios con Spring Data JPA
- Implementación de servicios e interfaces
- Inyección de dependencias con Spring
- Persistencia de datos en base de datos
- Creación de interfaces gráficas con Java Swing
- Uso de tablas, formularios y eventos
- Integración de Spring Boot con aplicaciones de escritorio

---

## 💡 Aprendizajes obtenidos

Durante el desarrollo de este proyecto se aplicaron conocimientos importantes como:

- Crear una aplicación Spring Boot desde cero.
- Implementar una entidad con JPA.
- Usar `JpaRepository` para operaciones CRUD.
- Crear servicios para separar la lógica del sistema.
- Inyectar dependencias con `@Autowired`.
- Crear una interfaz gráfica con Swing.
- Usar `JTable` para mostrar información.
- Manejar eventos de botones.
- Seleccionar registros desde una tabla.
- Actualizar datos desde un formulario.
- Aplicar un tema visual oscuro con FlatLaf.
- Ejecutar una aplicación Spring Boot sin servidor web.

---

## 📈 Posibles mejoras futuras

🚀 Crear una API REST para consumir los datos desde frontend web  
🚀 Agregar validaciones más avanzadas en los campos  
🚀 Implementar manejo de excepciones personalizado  
🚀 Agregar buscador de clientes por nombre o membresía  
🚀 Implementar reportes de clientes activos  
🚀 Agregar autenticación de usuarios  
🚀 Crear pruebas unitarias  
🚀 Agregar diseño más personalizado a la interfaz  
🚀 Exportar listado de clientes a PDF o Excel  
🚀 Crear dashboard con estadísticas del gimnasio  

---

## 📌 Estado del proyecto

✅ Proyecto funcional  
✅ CRUD completo implementado  
✅ Interfaz gráfica agregada  
✅ Modo oscuro implementado  
✅ Base de datos integrada con Spring Data JPA  
✅ Arquitectura por capas aplicada  
✅ Listo para subir a GitHub  
✅ Ideal para portafolio de Java / Spring Boot  

---

## 👨‍💻 Autor

**Samahel Thomas**

Proyecto desarrollado como parte de mi aprendizaje en **Java**, **Spring Boot**, **Spring Data JPA** y desarrollo de aplicaciones de escritorio con **Swing**.

- GitHub: [Sadeths](https://github.com/Sadeths)
- LinkedIn: [Samahel Thomas](https://www.linkedin.com/in/samahel-thomas-7330211ba)


---

# 🏋️‍♂️ Zona Fit

Sistema de gestión de clientes para gimnasio desarrollado con **Java Spring Boot**, **Spring Data JPA**, **MySQL** y **Java Swing**.
