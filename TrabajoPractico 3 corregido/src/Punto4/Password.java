package Punto4;

import java.util.Random;

public class Password {
    //Metodo 1 - Validacion de longitud de contraseña.

    public static void validacionLongitud (String password){
        int longitud = password.length();

        if(longitud >= 8){
            System.out.println("Longitud de contraseña valida.");
        }else{
            System.out.println("Longitud de contraseña invalida.");
            System.exit(0);
        }
    }

    //Metodo 2 - Validar si la contraseña tiene digito numerico.
    public static boolean validacionDigitoNum (String password) {
        boolean digitoNum = false;

        for (int i = 0; i < password.length(); i++) {

            if (Character.isDigit(password.charAt(i))) {
                digitoNum = true;
                break;
            }


        }

        return digitoNum;
    }

    //Metodo 3 - Validar si la contraseña tiene caracter especial.
    public static boolean validacionCaracterEsp (String password){
        for(int i = 0; i < password.length(); i++){

            char c = password.charAt(i);
            if(!Character.isLetterOrDigit(c)){
                return true;
            }


        }
        return false;
    }

    //Metodo 4 - Crear contraseña aleatoria.
    public static String contraseñaAleatoria (int longitud){
        String letrasMayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letrasMinus = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String especiales = "!@#$%^&*()-_+=<>?";

        String caracteres = letrasMayus + letrasMinus + numeros + especiales;
        Random random = new Random();

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<longitud ; i++){

            int indice = random.nextInt(caracteres.length());

            sb.append(caracteres.charAt(indice));


        }
        return sb.toString();
    }
}
