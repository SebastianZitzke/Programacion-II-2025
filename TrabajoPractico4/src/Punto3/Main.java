package Punto3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        String[] arreglo = ArregloCadenas.crearArray();

        System.out.println("Arreglo ordenado: "+ Arrays.toString(arreglo));

       String cadena = ArregloCadenas.ingreseCadena();
       int posicion = ArregloCadenas.buscarCadena(arreglo,cadena);

       ArregloCadenas.mostrarResultado(cadena,posicion);



    }
}
