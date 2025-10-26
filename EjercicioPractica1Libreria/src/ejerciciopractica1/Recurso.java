package ejerciciopractica1;

public abstract class Recurso {
    // Clase abstracta
    private String titulo;
    private int anioPublicacion;
    private int numeroPaginas;
    private String genero;

    public Recurso(String titulo, int anioPublicacion, int numeroPaginas, String genero) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    // Método abstracto que deberán implementar las subclases
    public abstract void mostrarInformacion();
    
    
}
