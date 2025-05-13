package Punto1;
import java.util.Scanner;
public class Punto1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE SU NOTA DE PROGRAMACION: ");
        double nota = teclado.nextDouble();
        if(nota<4){
            System.out.printf("EL ALUMNO A REPROBADO.");
        }else if(nota==10){
            System.out.println("EL ALUMNO SACO NOTA SOBRESALIENTE.");
        }else{
            System.out.println("EL ALUMNO A APROBADO.");
        }


    }
}