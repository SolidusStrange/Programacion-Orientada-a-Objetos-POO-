package ejerciciopractica1;
public class Revista extends Recurso{
    private int periocidad; // veces al mes que se publica

    public Revista(int periocidad, String titulo, int anioPublicacion, int numeroPaginas, String genero) {
        super(titulo, anioPublicacion, numeroPaginas, genero);
        this.periocidad = periocidad;
    }

    public int getPeriocidad() {
        return periocidad;
    }

    public void setPeriocidad(int periocidad) {
        this.periocidad = periocidad;
    }
    
    // Implementamos el metodo abstracto

    @Override
    public void mostrarInformacion() {
        System.out.println("Revista: " + getTitulo());
        System.out.println("Año de publicación: " + getAnioPublicacion());
        System.out.println("Numero de páginas: " + getNumeroPaginas());
        System.out.println("Genero: " + getGenero());
        System.out.println("Periocidad: " + periocidad + "veces al mes");
        System.out.println("-------------------------------------------");
    }
    
}
