import java.util.ArrayList; //para crear listas dinamicas
import java.util.Scanner; // input en python

public class Main {
    public static void main(String[] args){
        // scanner similar a input
        Scanner scanner = new Scanner(System.in);

        ArrayList<Galeria> galerias = new ArrayList<>();
        ArrayList<Critico> criticos = new ArrayList<>();
        ArrayList<Cuadro> cuadros = new ArrayList<>();
        ArrayList<Evaluacion> evaluaciones = new ArrayList<>();

        // Ejemplo cuadro de apertura
        Cuadro c1 = new Cuadro("C001", "La noche estrellada", "Van Gogh", 1889, "Museo XYZ");
        cuadros.add(c1);

        Critico cr1 = new Critico("12345678-9", "Juan Perez", "Pintura", 15);
        criticos.add(cr1);

        Galeria g1 = new Galeria("G001", "Galería Central", "Santiago");
        galerias.add(g1);

        Evaluacion e1 = new Evaluacion(c1, cr1, 65);
        evaluaciones.add(e1);   

        // menu con loop
        int opcion = 0; // Inicializamos variable
        
        while (opcion != 6){
            System.out.println("\n=== SISTEMA DE REGISTRO DE CUADROS Y EVALUACIONES ===");
            System.out.println("1. Ingresar Galeria");
            System.out.println("2. Ingresar Critico");
            System.out.println("3. Ingresar Cuadro");
            System.out.println("4. Ingresar Evaluacion");
            System.out.println("5. Calcular Resultados");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt(); // lee el numero elegido
            scanner.nextLine(); //limpiar

            switch (opcion) {
                case 1:
                    System.out.println("Codigo de la galeria: ");
                    String codigo = scanner.nextLine();
                    System.out.println("Nombre de la galeria: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ciudad de la galeria: ");
                    String ciudad = scanner.nextLine();

                    Galeria g = new Galeria(codigo, nombre, ciudad); // llamamos al constructor parametrizado y le asignamos los atributos
                    galerias.add(g); //agregamos el objeto al array
                    System.out.println("Galeria agregada correctamente.");
                    break;

                case 2:
                    System.out.println("Rut del critico");
                    String rutC = scanner.nextLine();
                    System.out.println("Nombre del critico");
                    String nombreC = scanner.nextLine();
                    System.out.println("Especialidad del critico");
                    String especialidadC = scanner.nextLine();
                    System.out.println("Anios de experiencia del critico");
                    int aniosC = scanner.nextInt();

                    Critico c = new Critico(rutC, nombreC, especialidadC, aniosC);
                    criticos.add(c); // agregamos al critico
                    System.out.println("Critico agregado correctamente");
                    break;

                case 3:
                    System.out.println("Codigo del cuadro");
                    String codCuadro = scanner.nextLine(); 
                    System.out.println("Titulo del cuadro");
                    String tituloCuadro = scanner.nextLine();
                    System.out.println("Autor del cuadro");
                    String autorCuadro = scanner.nextLine();
                    System.out.println("Anio de creacion");
                    int anioCreacionCuadro = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Galeria donde esta el cuadro");
                    String galeriaCuadro = scanner.nextLine();

                    Cuadro cuadro = new Cuadro(codCuadro, tituloCuadro, autorCuadro, anioCreacionCuadro, galeriaCuadro);
                    cuadros.add(cuadro);
                    System.out.println("Cuadro agregado correctamente");
                    break;

                case 4:
                    if (cuadros.isEmpty()) {
                        System.out.println("No hay cuadros disponibles. Primero agregue uno.");
                    break;
                    }

                    if (criticos.isEmpty()) {
                        System.out.println("No hay criticos disponibles. Primero agregue uno.");
                    break;
                    }

                    // Mostrar cuadros disponibles
                    System.out.println("Seleccione un cuadro: ");
                    for (int i = 0; i < cuadros.size(); i++) {
                        System.out.println((i+1) + ". " + cuadros.get(i).getTitulo());
                    }
                    int idxCuadro = scanner.nextInt() - 1; // restamos 1 para el indice
                    scanner.nextLine(); //limpiamos buffer

                    // Mostrar criticos disponibles
                    System.out.println("Seleccione un critico: ");
                    for (int i = 0; i < criticos.size(); i++) {
                        System.out.println((i + 1) + ". " + criticos.get(i).getNombre()); 
                    }
                    int idxCritico = scanner.nextInt() - 1; 
                    scanner.nextLine();

                    // Leer calificacion
                    System.out.println("Ingrese calificacion (0-70)");
                    int calificacion = scanner.nextInt();
                    scanner.nextLine();

                    // crear y agregar la evaluacion
                    Evaluacion eva = new Evaluacion(cuadros.get(idxCuadro), criticos.get(idxCritico), calificacion);
                    evaluaciones.add(eva);
                    System.out.println("Evaluación agregada correctamente.");   
                    break;

                case 5:
                    System.out.println("=== Resultados de Evaluaciones ===");
                    for (Evaluacion e : evaluaciones) {
                        System.out.println("Cuadro: " + e.getCuadro().getTitulo() +
                                            ", Calificacion: " + e.getCalificacion() +
                                            ", Critico: " + e.getCritico().getNombre());
                                        
                    }   

                    break;

                case 6:
                    System.out.println("Saliendo del sistema!");
                    break;
                
                default:
                    System.out.println("Opcion invalida");
                
            }
        }



        /* 
        // Mostrar informacion de los objetos
        for (Cuadro c : cuadros) { // type variable : arrayname)
            System.out.println(c.getTitulo() + " por " + c.getAutor());
        }

        for (Evaluacion e : evaluaciones) {
            System.out.println("Cuadro: " + e.getCuadro().getTitulo() +
                                ", Calificacion: " + e.getCalificacion() +
                                ", Critico: " + e.getCritico().getNombre());
        }
                                */
    }

}
