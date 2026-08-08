package Ejercicio4;

public class Revista extends Material {

    private int edicion;

    public Revista(String titulo, String autor, int edicion) {
        super(titulo, autor);
        this.edicion = edicion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Revista");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Edicion: " + edicion);
    }
}