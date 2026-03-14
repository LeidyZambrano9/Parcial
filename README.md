# Parcial Backend

## Descripción del Proyecto

Este proyecto consiste en una aplicación web desarrollada en Java utilizando Servlets y JSP, que permite gestionar reservas de espacios en un coworking.

Los usuarios pueden:

* Crear una reserva indicando su nombre, fecha, espacio y duración.
* Visualizar todas las reservas registradas.
* Eliminar reservas existentes.

El sistema valida que:

* Todos los campos del formulario estén completos.
* No se puedan registrar reservas en fechas pasadas.

Las reservas se almacenan en memoria utilizando una lista, por lo que no se requiere una base de datos.


# Requisitos Previos

Para ejecutar el proyecto se requiere tener instalado:

* Java JDK 8 o superior
* Apache Tomcat 8.5.96
* NetBeans 19 (IDE utilizado para el desarrollo)
* Navegador web

# Estructura del Proyecto

El proyecto está organizado de la siguiente manera:

```
ParcialLeidyZambrano
│
├── src
│   ├── datos
│   │     └── ReservaMemoria.java
│   │
│   ├── modelo
│   │     └── Reserva.java
│   │
│   └── servlet
│         ├── ReservaServlet.java
│         ├── ListaReservasServlet.java
│         └── EliminarReservaServlet.java
│
├── web
│   ├── index.html
│   ├── confirmacion.jsp
│   ├── reservas.jsp
│   ├── error.jsp
│   │
│   └── css
│        └── estilos.css
```



# Pasos para el Despliegue

## 1. Clonar o descargar el proyecto

Desde un repositorio Git:

```
git clone: https://github.com/LeidyZambrano9/Parcial.git
```

O descargar el archivo ZIP del proyecto y descomprimirlo.

---

## 2. Abrir el proyecto en NetBeans

1. Abrir NetBeans 19
2. Ir a File → Open Project
3. Seleccionar la carpeta del proyecto

---

## 3. Configurar el servidor Tomcat

1. Ir a Services → Servers
2. Agregar Apache Tomcat 8.5.96
3. Seleccionar la carpeta donde está instalado Tomcat.

---

## 4. Ejecutar el proyecto

1. Hacer clic derecho sobre el proyecto
2. Seleccionar Run

NetBeans desplegará automáticamente la aplicación en Apache Tomcat.

---

# Acceso a la Aplicación

Una vez desplegado el proyecto, la aplicación puede abrirse en el navegador en la siguiente URL:

```
http://localhost:8080/ParcialLeidyZambrano/index.html
```

Desde esta página el usuario podrá registrar reservas y acceder a la lista de reservas.

---

# Funcionalidades Implementadas

* Registro de reservas mediante formulario.
* Validación de campos obligatorios.
* Validación para evitar reservas en fechas pasadas.
* Visualización de todas las reservas registradas.
* Eliminación de reservas.
* Manejo de errores con mensajes amigables.
* Interfaz básica con CSS.

---

# Autor

Proyecto desarrollado por:

Leidy Zambrano


