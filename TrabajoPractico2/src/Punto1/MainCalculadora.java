package Punto1;

import java.util.Scanner;
public class MainCalculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//Declaracion de variable
        double num1 = 0;
        double num2 = 0;
//Creacion de objetos.
        Calculadora operacion = new Calculadora();

        System.out.println("===CALCULADORA===");

        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        System.out.println("Opcion: ");
        int opcion = teclado.nextInt();

        if(opcion < 1 || opcion > 4){
            System.out.println("Error opcion no valida.");
        }else{
            System.out.println("Ingrese el primer numero: ");
            num1 = teclado.nextDouble();
            System.out.println("Ingrese el segundo numero: ");
            num2 = teclado.nextDouble();
        }
        if(opcion == 1){
            operacion.sumar(num1,num2);
            System.out.println("Resultado: "+operacion.suma);
        }
        if(opcion == 2){
            operacion.restar(num1 , num2);
            System.out.println("Resultado: "+operacion.resta);
        }
        if(opcion == 3){
            operacion.multiplicar(num1 , num2);
            System.out.println("Resultado: "+operacion.multiplicacion);
        }
        if(opcion == 4){
            operacion.dividir(num1 , num2);
            System.out.println("Resultado: "+operacion.division);
        }

    }
}