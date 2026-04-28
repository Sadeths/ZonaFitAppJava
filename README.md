# 🏋️ ZonaFitApp (Java + MySQL)

Aplicación de consola desarrollada en Java que permite gestionar clientes de un gimnasio mediante operaciones CRUD conectadas a una base de datos MySQL.

---

## 🚀 Tecnologías utilizadas

* Java (JDK 17+)
* JDBC
* MySQL
* Maven

---

## 📂 Estructura del proyecto

```
zona_fit/
│
├── presentacion/   → Interfaz de usuario (menú consola)
├── datos/          → DAO (acceso a datos)
├── dominio/        → Modelo (Cliente)
├── conexion/       → Conexión a base de datos
```

---

## ⚙️ Funcionalidades

* 📋 Listar clientes
* 🔍 Buscar cliente por ID
* ➕ Agregar cliente
* ✏️ Modificar cliente
* ❌ Eliminar cliente

---

## 🧠 Ejemplo de uso

```
*** Zona Fit (GYM) ***
1. Listar clientes
2. Buscar clientes
3. Agregar cliente
4. Modificar cliente
5. Eliminar cliente 
6. Salir
```

---

## 🛠️ Configuración

1. Crear la base de datos en MySQL:

```sql
CREATE DATABASE zona_fit_db;

USE zona_fit_db;

CREATE TABLE cliente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    membresia INT
);
```

2. Configurar conexión en el archivo `Conexion.java`:

```java
var usuario = "root";
var password = "tu_password";
```

---

## ▶️ Cómo ejecutar

1. Clonar el repositorio:

```bash
git clone https://github.com/tu-usuario/ZonaFitAppJava.git
```

2. Ejecutar el proyecto desde tu IDE (IntelliJ / VS Code)

---

## 📌 Mejoras futuras

* Validaciones de datos
* Manejo de excepciones más robusto
* Uso de `try-with-resources`
* Implementación de interfaz gráfica (JavaFX o Web)
* Uso de variables de entorno para credenciales

---

## 👨‍💻 Autor

Desarrollado por **Samahel Thomas**
