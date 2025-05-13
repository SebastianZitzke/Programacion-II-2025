package Punto3;

import java.util.Scanner;

public class Punto3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO MAYOR A CERO Y MENOR A 100: ");
        double num = sc.nextDouble();

        if(num<0||num>99){
            System.out.println("NUMERO NO VALIDO");
        }else if(num>=10){
            System.out.println("EL NUMERO INGRESADO TIENE DOS DIGITOS.");

        }else{
            System.out.println("EL NUMERO INGRESADO TIENE UN DIGITO.");
        }
    }
}
