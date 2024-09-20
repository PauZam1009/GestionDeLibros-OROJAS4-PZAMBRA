package gestiondelibros;

public class AdminLibros {

    public static void main(String[] args){


        Libro libroUno = new Libro("El Principito", "Antoine de Saint-Exupéry", 96, 1943);
        Libro libroDos = new Libro("Cien Años de Soledad", "Gabriel García Marquez", 417, 1967);
        Libro libroTres = new Libro("El Quijote de la Mancha", "Miguel de Cervantes Savedra", 920, 1605);

        System.out.println("Libro 1: ");
        libroUno.mostrarDatosLibros();
        System.out.println();
        System.out.println("Libro 2: ");
        libroDos.mostrarDatosLibros();
        System.out.println();
        System.out.println("Libro 3: ");
        libroTres.mostrarDatosLibros();
        System.out.println();

        libroUno.setNumeroPaginas(100);

        System.out.println("Libro 1 actualizado: ");
        System.out.println("Titulo: " + libroUno.getTitulo());
        System.out.println("Autor: " + libroUno.getAutor());
        System.out.println("Número de Páginas: " + libroUno.getNumeroPaginas());
        System.out.println("Año Publicación: " + libroUno.getAnoPublicacion());


    }


}
