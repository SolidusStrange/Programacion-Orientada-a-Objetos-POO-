public class Critico {
    // definimos las variables como privadas para que solo sean accesible dentro de la clase
    private String rut;
    private String nombre;
    private String especialidad;
    private int aniosExperiencia;

    // creamos la instancia de Critico
    public Critico(String rut, String nombre, String especialidad, int aniosExperiencia){
        setRut(rut);
        setNombre(nombre);
        setEspecialidad(especialidad);
        setAniosExperiencia(aniosExperiencia);
    }

    public Critico(){
        this("?","Desconocido","General", 0);
    }
        
    // creamos los getters y setter con sus respectivas validaciones
    public String getRut(){return rut;} // obtenemos el rut
    public void setRut(String rut){
        if(rut == null || rut.trim().isEmpty()){ // revisamos que no este vacia
            throw new IllegalArgumentException("El RUT no puede estar vacio");
        }
        this.rut = rut; // establecemos el rut obtenido
    
    }  

    public String getNombre(){return nombre;} //obtenemos el nombre
    public void setNombre(String nombre){
        if(nombre == null || nombre.trim().isEmpty()){ // revisamos que no este vacia
            throw new IllegalArgumentException("El nombre del critico no puede estar vacio");
        }
        this.nombre = nombre; // establecemos el nombre obtenido
    } 

    public String getEspecialidad(){return especialidad;} //obtenemos especialidad
    public void setEspecialidad(String especialidad){
        if(especialidad == null || especialidad.trim().isEmpty()){ // revisamos que no este vacia
            throw new IllegalArgumentException("La especialidad no puede estar vacio");
        }
        this.especialidad = especialidad; // establecemos la especialidad obtenida
    } 

    public int getAniosExperiencia(){return aniosExperiencia;} //obtenemos anios de experiencia
    public void setAniosExperiencia(int aniosExperiencia){
        if(aniosExperiencia < 0 || aniosExperiencia > 80){
            throw new IllegalArgumentException("Los anios de experiencia deben estar entre 0 y 80");
        }
        this.aniosExperiencia = aniosExperiencia; //establecemos los anios de experiencia
    }

    // creamos los metodos que usaremos
    public void mostrarInfo(){
        System.out.println("RUT: " + rut);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Anios de experiencia: " + aniosExperiencia);
    }


}

/* 
Constructor parametrizado usa los setters → validación centralizada.
Constructor por defecto → delega al parametrizado.
Getters y setters con validaciones.
Método mostrarInfo() para imprimir los datos.
*/