
# Aplicación de Principios POO en el Proyecto *La Tuerca Loca*

## 1. Herencia

La **herencia** permite crear clases nuevas basadas en una clase existente, reutilizando código común y especializando el comportamiento.

En este proyecto, la clase abstracta `Vehiculo` define los atributos y métodos comunes para todos los vehículos:

```java
protected String codigo;
protected String marca;
protected String modelo;
protected double precioBase;
protected int anioFabricacion;
```

Las clases `Automovil` y `Motocicleta` heredan de `Vehiculo`, obteniendo estos atributos y agregando sus propios comportamientos y atributos específicos, como el tipo de carrocería o la cilindrada.

Esto evita duplicar código y permite que cada subclase defina su propio comportamiento mediante la sobrescritura de métodos.

---

## 2. Interfaz

La **interfaz `PromEspecial`** representa un contrato que define el método `descuentoFeriado()` y una constante `DTO` con el valor del descuento.

```java
public interface PromEspecial {
    double DTO = 0.123;
    double descuentoFeriado();
}
```

`Vehiculo` implementa esta interfaz, lo que obliga a todas las subclases (`Automovil` y `Motocicleta`) a definir cómo se calcula el descuento feriado.  
Esto promueve la **abstracción** y permite que diferentes tipos de vehículos manejen la misma funcionalidad con su propia lógica interna.

---

## 3. Polimorfismo

El **polimorfismo** permite que diferentes clases respondan de manera distinta al mismo método.  
En este caso, tanto `Automovil` como `Motocicleta` implementan el método `descuentoFeriado()` de forma diferente.

```java
// En Automovil
@Override
public double descuentoFeriado() {
    if (marca.equalsIgnoreCase("Ford") && tipoCarroceria.equalsIgnoreCase("SUV")) {
        double descuento = precioBase * DTO;
        precioBase -= descuento;
        return descuento;
    }
    return 0;
}

// En Motocicleta
@Override
public double descuentoFeriado() {
    return 0;
}
```

La clase `Concesionaria` recorre una lista de vehículos y ejecuta este método sin importar el tipo concreto:

```java
for (Vehiculo v : listaVehiculos) {
    totalDescuentos += v.descuentoFeriado();
}
```

Cada vehículo ejecuta su propia versión del método, demostrando polimorfismo.

---

## 4. Colecciones

Las **colecciones** permiten almacenar múltiples objetos dinámicamente.  
La clase `Concesionaria` usa un `ArrayList<Vehiculo>` para guardar automóviles y motocicletas:

```java
private ArrayList<Vehiculo> listaVehiculos;
```

Gracias al polimorfismo, la colección puede almacenar distintos tipos de vehículos sin problema:

```java
listaVehiculos.add(new Automovil(...));
listaVehiculos.add(new Motocicleta(...));
```

La colección facilita recorrer, buscar y aplicar operaciones masivas sobre todos los vehículos.

---

## 5. Conclusión

En el proyecto *La Tuerca Loca*, el estudiante aplica correctamente los principios fundamentales de la Programación Orientada a Objetos:

- **Herencia:** para compartir atributos y comportamientos comunes.  
- **Interfaz:** para definir contratos comunes y mantener independencia entre clases.  
- **Polimorfismo:** para que cada clase responda de manera diferente al mismo método.  
- **Colecciones:** para gestionar eficientemente un conjunto heterogéneo de objetos.

Estos principios permiten un diseño flexible, extensible y fácil de mantener.
