package Ejercicio4;

public class Libro extends Material {

    private int paginas;

    public Libro(String titulo, String autor, int paginas) {
        super(titulo, autor);
        this.paginas = paginas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Libro");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Paginas: " + paginas);
    }
}