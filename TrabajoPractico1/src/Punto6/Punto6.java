package Punto6;

import java.util.Scanner;
public class Punto6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cantidad n de triangulos: ");
        int n= sc.nextInt();
        int equilatero=0,isosceles=0,escaleno=0;
        for(int i = 1; i<=n ; i++){
            System.out.println("Ingrese el lado uno: ");
            double lado1 = sc.nextDouble();
            System.out.println("Ingrese el lado dos: ");
            double lado2 = sc.nextDouble();
            System.out.println("Ingrese el lado tres: ");
            double lado3 = sc.nextDouble();

            if(lado1==lado2 && lado2==lado3){
                System.out.println("El triangulo es EQUILATERO");
                equilatero++;
            }else if(lado1==lado2 || lado1==lado3 || lado2==lado3){
                System.out.println("El triangulo es ISOSCELES");
                isosceles++;
            }else{
                System.out.println("El triangulo es ESCALENO");
                escaleno++;
            }
        }
        System.out.println("--------------------------");
        System.out.println("RESULTADOS OBTENIDOS");
        System.out.println("--------------------------");
        System.out.println("-Triangulo equilateros:"+equilatero);
        System.out.println("-Triangulo isosceles:"+isosceles);
        System.out.println("-Triangulo escaleno:"+escaleno);
        System.out.println("--------------------------");

        if(equilatero < escaleno && equilatero < isosceles){
            System.out.println("El triangulo de menor cantidad es EQUILATERO.");
        }
        else if(escaleno < equilatero && escaleno < isosceles){
            System.out.println("El triangulo de menor cantidad es ESCALENO.");
        }
        else if(isosceles < equilatero && isosceles < escaleno){
            System.out.println("El triangulo de menor cantidad es ISOSCELES.");
        }
        else if(equilatero==isosceles && equilatero==escaleno){
            System.out.println("Hay una misma cantidad de triangulos diferentes.");
        }
        else if(equilatero==isosceles){
            System.out.println("Hay una misma cantidad de triangulos de menor cantidad EQUILATEROS e ISOSCELES.");
        }
        else if(equilatero==escaleno){
            System.out.println("Hay una misma cantidad de triangulos de menor cantidad EQUILATEROS y ESCALENOS.");
        }
        else if(escaleno==isosceles){
            System.out.println("Hay una misma cantidad de triangulos de menor cantidad ESCALENO e ISOSCELES.");
        }
    }
}
