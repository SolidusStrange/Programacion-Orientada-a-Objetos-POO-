public class Evaluacion {
    private Cuadro cuadro;
    private Critico critico;
    private int calificacion; // debe estar entre 0 y 70

    // Constructor parametrizado
    public Evaluacion(Cuadro cuadro, Critico critico, int calificacion) {
        this.cuadro = cuadro;
        this.critico = critico;
        setCalificacion(calificacion); // usamos el setter para validar
    }

    // Constructor por defecto seguro
    public Evaluacion() {
        this(new Cuadro(), new Critico(), 0); // objetos por defecto + calificacion 0
    }

    // Getters y setters
    public Cuadro getCuadro() {
        return cuadro;
    }

    public void setCuadro(Cuadro cuadro) {
        this.cuadro = cuadro;
    }

    public Critico getCritico() {
        return critico;
    }

    public void setCritico(Critico critico) {
        this.critico = critico;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        if (calificacion < 0 || calificacion > 70) {
            throw new IllegalArgumentException("La calificacion debe estar entre 0 y 70");
        }
        this.calificacion = calificacion;
    }
}
