public class Galeria {
    private String codigo;
    private String nombre;
    private String ciudad;

    public Galeria(String codigo, String nombre, String ciudad) {
        setCodigo(codigo);
        setNombre(nombre);
        setCiudad(ciudad);
    }

    //default
    public Galeria(){
        this("?", "Desconocido", "Desconocida");
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isBlank()){
            throw new IllegalArgumentException("Codigo no puede estar vacio");
        }
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        if (ciudad == null || ciudad.isBlank()){
            throw new IllegalArgumentException("La ciudad no puede estar vacia");
        }
        this.ciudad = ciudad;
    }

    


}

