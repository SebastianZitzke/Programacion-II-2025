package password;

import java.util.Scanner;

public class MainPassword {
    public static void main(String[] args) {

        int opcion;
        System.out.println("---SISTEMA DE VALIDACION DE CONTRASEÑA---");

        Scanner sb = new Scanner(System.in);

        do{
            Password.mostrarMenu();
            opcion = Integer.parseInt(sb.nextLine());

            try {
                if (opcion == 1) {
                    System.out.println("Ingrese una contraseña: ");
                    String contraseña1 = sb.nextLine();
                    Password password1 = new Password(contraseña1);
                    password1.validacionPassword();
                }
            }catch (Exception e){
                System.out.println("ERROR: "+e);
            }
            if(opcion == 2){
                System.out.println("Hasta luego!");
            }else if(opcion>2 || opcion<1){
                System.out.println("No valido.");
            }
}while(opcion!=2);
    }
}
