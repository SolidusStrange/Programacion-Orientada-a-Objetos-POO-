package videoteca;

public abstract class Contenido {
    private String titulo;
    private int anioEstreno;
    private String genero;
    private int duracionMinutos;

    public Contenido(String titulo, int anioEstreno, String genero, int duracionMinutos) {
        this.titulo = titulo;
        this.anioEstreno = anioEstreno;
        this.genero = genero;
        this.duracionMinutos = duracionMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }
    
    public abstract void mostrarInformacion();
    
}
