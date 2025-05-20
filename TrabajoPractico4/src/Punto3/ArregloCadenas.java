package Punto3;

import java.util.Arrays;
import java.util.Scanner;

public class ArregloCadenas {

    //Metodo para crear array.
    public static String[] crearArray() {
        String arreglo[] = {"Francescolli", "Ortega", "Perez", "Alonso", "Gallardo"};
        Arrays.sort(arreglo);
        return arreglo;
    }

//Metodo para buscar cadena.
    public static String ingreseCadena(){
        Scanner sb = new Scanner(System.in);
        System.out.println("Ingrese la cadena que desea ingresar: ");
        String cadena = sb.next();
        return cadena;
    }

    //Metodo para buscar con binary.
    public static int buscarCadena(String[] arreglo,String cadena){
        return Arrays.binarySearch(arreglo,cadena);
    }

    public static void mostrarResultado(String cadena,int posicion ){
        if(posicion>=0){
            System.out.println("Cadena: "+cadena+" , Posicion: "+posicion);
        }else{
            System.out.println("No se encontro cadena.");
        }
    }

}
