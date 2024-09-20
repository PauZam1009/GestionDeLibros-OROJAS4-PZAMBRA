package gestiondelibros;

public class Libro {

    String titulo;
    String autor;

    int numeroPaginas;
    int anoPublicacion;

    public Libro(String titulo, String autor, int numeroPaginas, int anoPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.anoPublicacion = anoPublicacion;

    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

   public void mostrarDatosLibros(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("Año de Publicación: " + anoPublicacion);
   }
}
