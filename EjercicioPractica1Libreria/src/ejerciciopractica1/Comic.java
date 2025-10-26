
package ejerciciopractica1;

public class Comic extends Recurso{
    private String dibujante;

    public Comic(String dibujante, String titulo, int anioPublicacion, int numeroPaginas, String genero) {
        super(titulo, anioPublicacion, numeroPaginas, genero);
        this.dibujante = dibujante;
    }

    public String getDibujante() {
        return dibujante;
    }

    public void setDibujante(String dibujante) {
        this.dibujante = dibujante;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Comic: " + getTitulo());
        System.out.println("Dibujante: " + dibujante);
        System.out.println("Año de publicación: " + getAnioPublicacion());
        System.out.println("Numero de páginas: " + getNumeroPaginas());
        System.out.println("Genero: " + getGenero());
        System.out.println("---------------------------------------");
    }

}
