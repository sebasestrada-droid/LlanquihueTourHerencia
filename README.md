# 🌄 Llanquihue Tour - Jerarquía de Servicios Turísticos

> Actividad Formativa - Semana 6  
> Programación Orientada a Objetos (Java)

---

# 📖 Descripción

Este proyecto corresponde a la continuación del sistema **Llanquihue Tour**, incorporando una **jerarquía de clases mediante herencia simple**.

Se implementa una superclase llamada **ServicioTuristico** y tres subclases especializadas que representan distintos tipos de servicios ofrecidos por la agencia.

Durante la ejecución, el programa crea instancias de cada tipo de servicio y muestra su información utilizando el método `toString()` sobrescrito en cada subclase.

---

# 🎯 Objetivo de esta semana

Implementar una jerarquía de clases aplicando conceptos fundamentales de Programación Orientada a Objetos:

- Herencia simple.
- Uso del constructor `super()`.
- Sobrescritura del método `toString()`.
- Organización del proyecto mediante paquetes.
- Reutilización de código entre clases.

---

# 🏗️ Estructura del proyecto

```
LlanquihueTourApp
│
└── src
    │
    ├── model
    │   ├── ServicioTuristico.java
    │   ├── RutaGastronomica.java
    │   ├── PaseoLacustre.java
    │   └── ExcursionCultural.java
    │
    ├── data
    │   └── GestorServicios.java
    │
    └── ui
        └── Main.java
```

---

# 📚 Clases creadas

## 📌 ServicioTuristico

Superclase del sistema.

Contiene los atributos comunes:

- Nombre
- Duración del servicio

---

## 🍽️ RutaGastronomica

Hereda de `ServicioTuristico`.

Atributo adicional:

- Número de paradas gastronómicas.

---

## 🚤 PaseoLacustre

Hereda de `ServicioTuristico`.

Atributo adicional:

- Tipo de embarcación.

---

## 🏛️ ExcursionCultural

Hereda de `ServicioTuristico`.

Atributo adicional:

- Lugar histórico.

---

## 📂 GestorServicios

Clase encargada de crear dos objetos de cada subclase y mostrarlos por consola.

---

## ▶️ Main

Punto de entrada del programa.

Ejecuta el sistema y muestra toda la información de los servicios turísticos.

---

# 💻 Conceptos de POO utilizados

- ✅ Herencia
- ✅ Encapsulamiento
- ✅ Polimorfismo
- ✅ Sobrescritura de métodos
- ✅ Uso de `super()`
- ✅ Organización por paquetes

---

# ▶️ Instrucciones para ejecutar

1. Abrir el proyecto en IntelliJ IDEA.
2. Ejecutar la clase:

```
ui.Main
```

3. La consola mostrará la información de todos los servicios turísticos creados.

---

# 👨‍💻 Autor

**Sebastián Estrada**

Duoc UC  
