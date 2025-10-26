# Programacion-Orientada-a-Objetos-POO-

Proyecto de Librería - Resumen Conceptual

## 1. Encapsulamiento
Cada clase define sus **atributos como privados** (`private`) y ofrece métodos públicos (`get` y `set`) para acceder o modificar los datos.  
Esto protege la información y evita que se altere directamente desde fuera de la clase.

**Ejemplo:**  

```java
private String nombre;
public String getNombre() { return nombre; }
public void setNombre(String nombre) { this.nombre = nombre; }
```

---
## 2. Herencia
Se aplica en la jerarquía:
```
Recurso  ←  Libro
         ←  Revista
         ←  Comic
```
Cada subclase hereda los atributos y métodos de `Recurso`, pero también **agrega o sobrescribe comportamientos propios**.

**Ejemplo:**  
Cada tipo de recurso implementa su propia versión de `mostrarInformacion()`, demostrando **polimorfismo**.

---

## 3. Composición
La clase `Libreria` **contiene listas de objetos** de otras clases (`Cliente`, `Recurso`, `Venta`), lo que muestra **relaciones “tiene un”**:
- Una librería *tiene clientes*  
- Una librería *tiene recursos*  
- Una librería *tiene ventas*

**Ejemplo:**
```java
private ArrayList<Cliente> clientes;
private ArrayList<Recurso> recursos;
private ArrayList<Venta> ventas;
```

---

## 4. Polimorfismo
Cuando el método `mostrarInformacion()` se ejecuta, **cada tipo de recurso** (Libro, Revista, Comic) responde de forma diferente aunque se use la misma llamada desde `Libreria`.

**Ejemplo:**  
```java
for (Recurso r : recursos) {
    r.mostrarInformacion(); // se adapta al tipo real
}
```

---

## 5. Abstracción
El programa oculta los detalles internos del manejo de listas y solo ofrece métodos claros como:
- `registrarCliente()`
- `buscarRecursoPorTitulo()`
- `emitirBoleta()`

El usuario del sistema (o quien programa el `Main`) **no necesita saber cómo se almacenan los datos**, solo usa las funciones.
---
## 6. Control de Flujo (Main)
El menú guía la interacción y coordina las operaciones:
- Ingresar cliente  
- Ingresar recurso  
- Buscar recurso  
- Registrar venta  
- Emitir boleta  
