package Punto4;

import java.util.Scanner;

public class MainPassword {
    public static void main(String[] args){

        Scanner sb = new Scanner(System.in);
        System.out.println("==PASSWORD==");
        System.out.println("Ingrese contraseña: ");
        String password = sb.nextLine();

        //Validacion de longitud.
        Password.validacionLongitud(password);

        //Validacion de caracter numerico.
        if(!Password.validacionDigitoNum(password)){
            System.out.println("No tiene caracter numerico. No valida.");
            System.exit(0);
        }

        //Validacion de caracter especial.
        if(!Password.validacionCaracterEsp(password)){
            System.out.println("No tiene caracter especial. No valida.");
            System.exit(0);
        }

        System.out.println("--Contraseña segura--");


//Contraseña segura aleatoria.
        System.out.println("-----------------------------------");
        System.out.println("Contraseña aleatoria: "+Password.contraseñaAleatoria(12));

    }

}



