package Punto1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ReproductorMusica reproductor = new ReproductorMusica("Reproductor","Puente","Gustavo Cerati");
        Camara camara = new Camara("Cannon f500");
        Television television = new Television("Smart Tv Samsung","Cartoon Network");

        //Reproductor de Musica.
        System.out.println("--Reproductor Musical--");
        reproductor.encender();
        reproductor.funcionamiento();
        reproductor.apagar();
        reproductor.mostrarHistorial();



        //Camara de fotos
        System.out.println("--Camara--");
        camara.encender();
        camara.encender();
        camara.funcionamiento();
        camara.apagar();
        camara.mostrarHistorial();


        //Television
        System.out.println("--Television--");
        television.encender();
        television.funcionamiento();
        television.apagar();
        television.mostrarHistorial();


    }
}