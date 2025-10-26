## 📘 Enunciado

Se debe desarrollar un programa en **Java** que modele el funcionamiento básico de una **librería**.  
El sistema debe permitir **registrar clientes**, **ingresar recursos** (como libros, revistas o cómics), **buscar recursos**, **registrar ventas** y **emitir boletas**.  

El ejercicio busca aplicar conceptos fundamentales de **Programación Orientada a Objetos (POO)**, como:

- Herencia  
- Encapsulamiento  
- Polimorfismo  
- Sobrescritura de métodos  
- Uso de interfaces  
- Uso de estructuras dinámicas (ArrayList)

---

## ⚙️ Requerimientos

### 1. Clases principales
Se deben implementar las siguientes clases:

- `Cliente`
- `Recurso` (clase base abstracta)
- `Libro`, `Revista` y `Comic` (heredan de `Recurso`)
- `Venta`
- `Libreria`
- `Main` (con menú principal)

---

### 2. Clase `Cliente`
Debe contener:
- RUT  
- Nombre  
- Apellido paterno  
- Apellido materno  
- Alias  
- Correo  
- Contraseña (generada automáticamente)

Incluye un método `mostrarInformacion()` para mostrar los datos del cliente.

---

### 3. Clase abstracta `Recurso`
Atributos comunes:
- Título  
- Año de publicación  
- Número de páginas  
- Género  

Incluye el método abstracto `mostrarInformacion()` que será sobrescrito por sus clases hijas.

---

### 4. Clases hijas de `Recurso`
Cada una debe sobrescribir el método `mostrarInformacion()` e incluir su atributo específico:

- `Libro` → `autor`  
- `Revista` → `periodicidad`  
- `Comic` → `dibujante`

---

### 5. Clase `Libreria`
Contiene tres listas principales:
- `ArrayList<Cliente> clientes`
- `ArrayList<Recurso> recursos`
- `ArrayList<Venta> ventas`

Y los métodos:
- `registrarCliente(Cliente c)`  
- `registrarRecurso(Recurso r)`  
- `buscarRecursoPorTitulo(String titulo)`  
- `buscarClientePorRut(String rut)`  
- `registrarVenta(Venta v)`  
- `emitirBoleta(String rutCliente)`

---

### 6. Clase `Venta`
Contiene:
- Cliente asociado  
- Total de compra  
- Descuento aplicado  

Y el método:
- `emitirBoleta()` → Muestra los datos del cliente, total y descuento aplicado.

---
### 7. Clase `Main`
Implementa un **menú interactivo** con las siguientes opciones:

- Ingresar cliente
- Ingresar recurso
- Buscar recurso
- Registrar venta
- Emitir boleta
- Salir

---




