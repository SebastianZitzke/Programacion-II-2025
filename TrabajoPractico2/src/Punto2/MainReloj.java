package Punto2;

import java.util.Scanner;
public class MainReloj {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        //Creacion de objeto.
        Reloj miReloj = new Reloj();
        int opcion = 1;
        System.out.println("===RELOJ===");
        miReloj.establecerHora(22,59,58);

        while(opcion == 1){
            miReloj.mostrarHora();
            System.out.println("¿Usted desea avanzar el tiempo del reloj?");
            System.out.println("1.SI");
            System.out.println("2.NO");
            System.out.println("Opcion: ");
            opcion = teclado.nextInt();
            if (opcion == 1) {
                miReloj.avanzarSegundos();
                miReloj.mostrarHora();
            }
            if(opcion == 2){
                System.out.println("Vuelva pronto!");
            }
            if(opcion < 1 || opcion > 2){
                System.out.println("Opcion no valida.");
            }

        }
    }
}
