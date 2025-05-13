package Punto2;

import java.util.Scanner;

public class Punto2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE SU NOTA 1: ");
        double nota1=teclado.nextDouble();
        System.out.println("INGRESE SU NOTA 2: ");
        double nota2=teclado.nextDouble();
        System.out.println("INGRESE SU NOTA 3: ");
        double nota3=teclado.nextDouble();

        double promedio= (nota1+nota2+nota3)/3;

        if(promedio<=3){
            System.out.println("EL ALUMNO REPROBO LA MATERIA.");

        }else if(promedio>=8){
            System.out.println("EL ALUMNO PROMOCIONO LA MATERIA.");
        }else{
            System.out.println("EL ALUMNO REGULARIZO LA MATERIA.");
        }
    }



}

