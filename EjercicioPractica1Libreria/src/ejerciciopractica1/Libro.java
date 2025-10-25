/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractica1;

public class Libro extends Recurso {
    // Atributo especifico de libro
    private String autor;

    public Libro(String autor, String titulo, int anioPublicacion, int numeroPaginas, String genero) {
        super(titulo, anioPublicacion, numeroPaginas, genero);  // Llamada al constructor de Recurso
        this.autor = autor;
    }
    
    // Getters and setter

    public String getAutor() {
        return autor;}

    public void setAutor(String autor) {
        this.autor = autor;}
    
    // Implementacion del metodo abstracto de Recurso

    @Override
    public void mostrarInformacion() {
        System.out.println("Libro: " + getTitulo());
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicacion: " + getAnioPublicacion());
        System.out.println("Numero de paginas: " + getNumeroPaginas());
        System.out.println("Genero: " + getGenero());
        System.out.println("----------------------------------------");
    }
    
}
