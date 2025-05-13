package Punto4;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
public class MainLibro {
    public static void main(String[] args){
        Libro libro1 = new Libro("Harry Potter","J.K Rowling","999999999-2222");
        Scanner teclado = new Scanner(System.in);

        int opcion2;
        int opcion3;

        System.out.println("===LIBRERIA===");
        System.out.println("Desea consultar los libros disponibles?");
        System.out.println("Si");
        System.out.println("No");
        System.out.println("Opcion: ");
        int opcion = teclado.nextInt();

        if(opcion == 1){
            libro1.mostrarInformacion();
            System.out.println("Desea llevarlo?: ");
            System.out.println("Si");
            System.out.println("No");
            System.out.println("Opcion : ");
            opcion2 = teclado.nextInt();
            if(opcion2 == 1){
                libro1.prestar();
                libro1.mostrarInformacion();
                System.out.println("Perfecto, ya leiste tu libro!. ¿Deseas devolverlo?");
                System.out.println("Si");
                System.out.println("No");
                System.out.println("Opcion: ");
                opcion3 = teclado.nextInt();
                if(opcion3 == 1){
                    libro1.devolver();
                    libro1.mostrarInformacion();
                }if(opcion3 < 1 || opcion3 > 2){
                    System.out.println("Opcion no valida.");
                }if(opcion3 == 2 ){
                    System.out.println("Vuelva pronto.");
                }
            }if(opcion2 == 2){
                System.out.println("Vuelva pronto!.");
            }if(opcion2 < 1 || opcion2 > 2){
                System.out.println("Opcion no valida.");
            }
        }if(opcion < 1 || opcion > 2){
            System.out.println("Opcion no valida.");
        }if(opcion == 2){
            System.out.println("Vuelva pronto.");
        }



    }
}
