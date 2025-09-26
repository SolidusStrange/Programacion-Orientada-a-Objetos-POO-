public class Cuadro {
    // ENCAPSULACION. Datos son internos del objeto y nadie mas puede cambiarlos desde afuera
    private String codigo;
    private String titulo;
    private String autor;
    private int anioCreacion;
    private String galeria;

    // CONSTRUCTOR
    // Sirve para inicializar las variables del objeto (darles valores iniciales) y para validar esos valores si hace falta.
    public Cuadro(String codigo, String titulo, String autor, int anioCreacion, String galeria){
        if (codigo == null || codigo.isBlank()){
            throw new IllegalArgumentException("El codigo no puede estar vacio");
        }
        this.codigo = codigo; // 'this.codigo' es el atributo del objeto
        this.titulo = (titulo == null) ? "Sin titulo" : titulo; //  condition ? value_if_true : value_if_false;
        this.autor = autor; //distingue el atributo del parámetro con el mismo nombre
        if (anioCreacion < 0) {
            throw new IllegalArgumentException("Año invalido");
        }
        this.anioCreacion = anioCreacion;
        this.galeria = galeria;
    }

    public Cuadro(){ // Constructor por defecto (opcional) que delega al parametrizado
        this("?", "Sin titulo", "Desconocido", 0, null);
    }

    // Getters (acceso controlado)
    public String getCodigo() { return codigo; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioCreacion() { return anioCreacion; }
    public String getGaleria() { return galeria; }

    // Setters: métodos que permiten cambiar los valores de los atributos privados (modificar atributos)

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
    this.autor = autor;
    }

    public void setAniosCreacion(int anioCreacion) {
        if (anioCreacion < 0) {
            throw new IllegalArgumentException("El anio no puede ser negativo")
        }
    }

    public void setGaleria(String galeria) {
        this.galeria = galeria;
    }

}

