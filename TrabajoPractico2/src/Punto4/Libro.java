package Punto4;

/*Crea una clase Libro que tenga atributos para el título, el autor, el ISBN y el estado
(disponible o prestado). La clase debe tener métodos para:
• prestar(): Marca el libro como prestado, si está disponible.
• devolver(): Marca el libro como disponible.
• mostrarInformacion(): Muestra el título, el autor, el ISBN y el estado del libro./*

 */

public class Libro {

    //Atributos.
    String autor;
    String titulo;
    String isbn;
    boolean disponible;

    //Metodo constructor.
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }

    //Metodo prestar.
    public void prestar(){
        if(disponible){ //El libro esta disponible.
            disponible = false;
            System.out.println("El libro a sido prestado.");
        }else{
            System.out.println("El libro ya fue prestado.");
        }
    }

    //Metodo devolver.
    public void devolver(){
        if(!disponible){   //El libro no esta disponible.
            disponible = true;
            System.out.println("El libro fue devuelto.");
        }else {
            System.out.println("El libro se encuentra disponible.");
        }
    }

    public void mostrarInformacion(){
        System.out.println("======================");
        System.out.println("Libro: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Isbn: "+isbn);
        System.out.println("Estado: " + (disponible ? "Disponible" : "Prestado"));
        System.out.println("======================");
    }



}
