
package ejerciciopractica1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Libreria libreria = new Libreria();
        
        int opcion = 0;
        while (opcion != 6){
            System.out.println("----- MENU -----");
            System.out.println("1. Ingresar cliente");
            System.out.println("2. Ingresar recurso");
            System.out.println("3. Buscar recurso");
            System.out.println("4. Registrar venta");
            System.out.println("5. Emitir boleta");
            System.out.println("6. Salir");
            System.out.print("Ingrese opcion: ");
            opcion = scanner.nextInt(); // Pedimos la opcion
            scanner.nextLine(); // Para limpiar buffer
        
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese RUT: ");
                    String rut = scanner.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese apellido paterno: ");
                    String apellidoP = scanner.nextLine();
                    System.out.print("Ingrese apellido materno: ");
                    String apellidoM = scanner.nextLine();
                    System.out.print("Ingrese alias: ");
                    String alias = scanner.nextLine();
                    System.out.print("Ingrese correo: ");
                    String correo = scanner.nextLine();
                    
                    // Validamos que no estén vacios
                    if(rut.isEmpty() || nombre.isEmpty() || apellidoP.isEmpty() || apellidoM.isEmpty() || alias.isEmpty() || correo.isEmpty()){
                        System.out.println("Error: Todos los campos son obligatorios.");
                    }else{
                        Cliente cliente = new Cliente(rut, nombre, apellidoP, apellidoM, alias, correo, ""); // Creamos creando una instancia cliente con la clase Cliente()
                        libreria.registrarCliente(cliente); // Llamamos el metodo que creamos en libreria que contiene los arrays
                        System.out.println("Cliente registrado. Contrasena generada: " + cliente.getPassword());
                    }
                    break;
                case 2:
                    /* 1) Preguntar qué tipo de recurso desea ingresar:
                        Libro
                        Revista
                        Comic */
                    System.out.println("Seleccione tipo de recurso: ");
                    System.out.println("1. Libro");
                    System.out.println("2. Revista");
                    System.out.println("3. Comic");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();
                    
                    /* 2) Pedir al usuario los atributos comunes de Recurso:
                        Título
                        Año de publicación
                        Número de páginas
                        Género */
                    
                    System.out.print("Ingrese titulo: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese anio de publicacion: ");
                    int anio = scanner.nextInt();
                    System.out.print("Ingrese numero de paginas: ");
                    int paginas = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Ingrese genero: ");
                    String genero = scanner.nextLine();
                    
                    /* 3) Pedir los atributos específicos según el tipo de recurso:
                        Libro → Autor
                        Revista → Periodicidad (número de veces al mes)
                        Comic → Dibujante */

                    switch (tipo) {
                        case 1: // Libro
                            System.out.println("Ingrese autor: ");
                            String autor = scanner.nextLine();
                            /* 4) Crear el objeto correspondiente (Libro, Revista, Comic)*/
                            Libro libro = new Libro(autor, titulo, anio, paginas, genero); 
                            /* 5) Llamar al método de Libreria para agregarlo al ArrayList de recursos */
                            libreria.registrarRecurso(libro); 
                            break;
                        case 2: // Revista
                            System.out.println("Ingrese la periocidad de la revista: ");
                            int periocidad = scanner.nextInt();
                            Revista revista = new Revista(periocidad, titulo, anio, paginas, genero);
                            libreria.registrarRecurso(revista);
                            break;
                        case 3: // Comic
                            System.out.println("Ingrese el dibujante del comic: ");
                            String dibujante = scanner.nextLine();
                            Comic comic = new Comic(dibujante, titulo, anio, paginas, genero);
                            libreria.registrarRecurso(comic);
                            break;
                        
                        default:
                            System.out.println("Opcion no valida");
                    }
                    /* 6) Mostrar un mensaje de éxito */
                    System.out.println("Recurso registrado correctamente"); 
                    break;
                    
                case 3:
                    System.out.println("Ingrese el titulo del recurso a buscar: ");
                    String tituloRecurso = scanner.nextLine();
                    libreria.buscarRecursoPorTitulo(tituloRecurso); 
                    break;
                    
                case 4:
                    /*
                    1) Seleccionar cliente:
                        Pedimos el RUT del cliente o listamos todos los clientes y pedimos elegir uno.
                        Buscamos en la lista de clientes de Libreria.
                        Si no existe, mostramos mensaje de error.
                    */
                    System.out.println("Ingrese RUT del cliente: ");
                    String rutCliente = scanner.nextLine();
                    Cliente clienteVenta = libreria.buscarClientePorRut(rutCliente); // Devuelve el objeto tipo cliente
                    if(clienteVenta == null){
                        System.out.println("Cliente no encontrado. Primero debe registrarlo");
                        break;
                    }
                    // 2) Pedir al usuario la cantidad de productos que quiere comprar.
                    System.out.println("Ingrese la cantidad de productos que desea comprar: ");
                    int cantidadProductos = scanner.nextInt();
                    scanner.nextLine();
                    
                    // 3) Calcular el total.
                    
                    double precioUnitario = 1000; // Ejemplo
                    double totalCompra = cantidadProductos * precioUnitario;
                    double descuento = 0;
                    
                    if (cantidadProductos > 3) {
                        descuento = 10;
                        totalCompra = totalCompra * 0.9;
                    }else if(cantidadProductos > 2) {
                        descuento = 5;
                        totalCompra = totalCompra * 0.95;
                    }else{
                        descuento = 0;
                    }
                     
                    // 4) Guardamos el total final y descuento en el objeto Venta
                    Venta venta = new Venta(clienteVenta, totalCompra, descuento); // Instanciamos un nuevo objeto de la clase Venta
                    libreria.registrarVenta(venta); // Agregamos a el array el objeto venta que instanciamos antes
                    System.out.println("Venta registrada exitosamente"); 
                    break;
                    
                case 5:
                    System.out.println("Ingrese el RUT del cliente para emitir la boleta");
                    String rutBoleta = scanner.nextLine();
                    libreria.emitirBoleta(rutBoleta);
                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
            
        }
        scanner.close(); // Cerramos el scanner
        
        
        
    }
}
