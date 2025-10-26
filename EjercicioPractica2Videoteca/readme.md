## 📘 Enunciado

Desarrolla un programa en **Java** que simule el funcionamiento básico de una **videoteca digital**.  
El sistema debe permitir **registrar usuarios**, **gestionar películas y series**, **buscar títulos**, **registrar alquileres** y **emitir comprobantes**.

El objetivo es aplicar los mismos conceptos de **Programación Orientada a Objetos (POO)**:

- Herencia  
- Encapsulamiento  
- Polimorfismo  
- Sobrescritura de métodos  
- Interfaces  
- Uso de colecciones dinámicas (`ArrayList`)

---

## ⚙️ Requerimientos

### 1. Clases principales

Se deben implementar las siguientes clases:

- `Usuario`
- `Contenido` (clase abstracta)
- `Pelicula` y `Serie` (heredan de `Contenido`)
- `Alquiler`
- `Videoteca`
- `Main`

---

### 2. Clase `Usuario`

Debe incluir los siguientes atributos:

- `rut`
- `nombre`
- `apellidoPaterno`
- `correo`
- `alias`
- `password` (generada automáticamente)

Métodos:
- `generarPassword()`
- `mostrarInformacion()` (de la interfaz)

---

### 3. Clase abstracta `Contenido`

Atributos comunes:
- `titulo`
- `anioEstreno`
- `genero`
- `duracionMinutos`

Método abstracto:
- `mostrarInformacion()`

---

### 4. Clases hijas de `Contenido`

**Pelicula**
- Atributo adicional: `director`

**Serie**
- Atributo adicional: `numeroTemporadas`

Cada una debe sobrescribir el método `mostrarInformacion()`.

---

### 5. Clase `Videoteca`

Debe contener tres listas:
- `ArrayList<Usuario> usuarios`
- `ArrayList<Contenido> contenidos`
- `ArrayList<Alquiler> alquileres`

Métodos requeridos:
- `registrarUsuario(Usuario u)`
- `registrarContenido(Contenido c)`
- `buscarContenidoPorTitulo(String titulo)`
- `buscarUsuarioPorRut(String rut)`
- `registrarAlquiler(Alquiler a)`
- `emitirComprobante(String rutUsuario)`

---

### 6. Clase `Alquiler`

Debe tener:
- Usuario asociado  
- Lista de contenidos alquilados  
- Total del alquiler  
- Descuento aplicado  

Método:
- `emitirComprobante()`

---

### 7. Clase `Main`

- Debe mostrar un **menú interactivo** con las opciones:
- Registrar usuario
- Registrar contenido
- Buscar contenido por título
- Registrar alquiler
- Emitir comprobante
- Salir

---

## Lógica adicional

- Si un usuario alquila **2 o más contenidos**, obtiene un **5% de descuento**.  
- Si alquila **4 o más**, obtiene un **10%**.  
- El sistema debe diferenciar correctamente entre **películas** y **series** al mostrarlas.

---

## Conceptos aplicados

- **POO**: Herencia, Encapsulamiento, Polimorfismo.  
- **Colecciones dinámicas**: `ArrayList`.  
- **Interfaces**: `Mostrable`.  
- **Sobrescritura de métodos**: `mostrarInformacion()` en cada subclase.  
- **Control de flujo**: Menú con `switch` y bucles `while`.

---

## Objetivo general

Construir un sistema orientado a objetos que gestione una videoteca digital aplicando correctamente los principios de POO en Java.

---

## Objetivos específicos

1. Diseñar clases representativas del dominio del problema.  
2. Implementar herencia y polimorfismo mediante clases abstractas e interfaces.  
3. Aplicar encapsulamiento para proteger los datos.  
4. Modelar la relación entre usuarios, contenidos y alquileres.  
5. Consolidar la comprensión del paradigma orientado a objetos.
