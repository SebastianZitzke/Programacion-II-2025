package Punto1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sb = new Scanner(System.in);

       //Solicito el tamaño del arreglo.
        System.out.println("Ingrese el tamaño del arreglo: ");
        int tamaño = sb.nextInt();

        int[] numEnteros = new int[tamaño];

//Llenar arreglo
        for(int i = 0;i<numEnteros.length;i++){
            System.out.println("Ingrese el numero "+(i+1)+" : " );
            numEnteros[i] = sb.nextInt();
        }

        //Metodo suma.
        System.out.println("--Metodo Suma--");
        int suma = ManipularArreglos.sumarNumeros(numEnteros);
        System.out.println("Suma: "+suma);

        //Metodo calcular el mayor.
        System.out.println("--Metodo Calcular Mayor--");
        int mayor = ManipularArreglos.calcularMayor(numEnteros);
        System.out.println("Mayor: "+mayor);

        //Metodo calcular el menor.
        System.out.println("--Metodo Calcular Menor--");
        int menor = ManipularArreglos.calcularMenor(numEnteros);
        System.out.println("Menor: "+menor);

        //Metodo mostrar array
        System.out.println("--Array--");
        ManipularArreglos.mostrarArray(numEnteros);

        //Metodo array invertido
        System.out.println("--Array Invertido--");
        ManipularArreglos.mostrarArrayInvertido(numEnteros);


    }
}
