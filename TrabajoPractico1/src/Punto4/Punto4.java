package Punto4;

import java.util.Scanner;
public class Punto4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("CALENDARIO.");
        System.out.println("INGRESE UN DIA,MES,AÑO.");
        System.out.println("DIA: ");
        int dia = sc.nextInt();
        System.out.println("MES: ");
        int mes = sc.nextInt();
        System.out.println("AÑO: ");
        int año = sc.nextInt();

        if(mes<1||mes>12){
            System.out.println("MES INGRESADO NO VALIDO.");

        }else if(mes <= 3){
            System.out.println("AÑO: "+año);
            System.out.println("MES: "+mes);
            System.out.println("DIA: "+dia);

            System.out.println("LA FECHA INGRESADA CORRESPONDE AL PRIMER TRIMESTRE DEL AÑO.");

        }else if(mes<=6&&mes>3){
            System.out.println("AÑO: "+año);
            System.out.println("MES: "+mes);
            System.out.println("DIA: "+dia);
            System.out.println("LA FECHA INGRESADA CORRESPONDE AL SEGUNDO TRIMESTRE DEL AÑO.");
        }else if(mes<=9&&mes>6){
            System.out.println("AÑO: "+año);
            System.out.println("MES: "+mes);
            System.out.println("DIA: "+dia);
            System.out.println("LA FECHA INGRESADA CORRESPONDE AL TERCER TRIMESTRE DEL AÑO.");
        }else{
            System.out.println("AÑO: "+año);
            System.out.println("MES: "+mes);
            System.out.println("DIA: "+dia);
            System.out.println("LA FECHA INGRESADA CORRESPONDE AL CUARTO TRIMESTRE DEL AÑO.");
        }
    }
}
