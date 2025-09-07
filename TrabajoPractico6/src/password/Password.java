package password;


import java.sql.SQLOutput;

public class Password {

private String password;

    public Password(String password) {
        this.password = password;
    }

    /*
    Metodo: validacionPassword();
    Lo que hara el metodo es comprobar si contiene al menos un numero, que sea distinta
    de null y que tenga mas de 8 digitos.
     */
    public void validacionPassword() throws Exception{

        if(this.password == null || this.password.isEmpty()){
            throw new Exception("la contraseña no puede estar vacia.");
        }else if(this.password.length()<8){
            throw new Exception("la contraseña no puede tener menos de 8 caracteres.");
        }else if(!this.password.matches(".*\\d.*")){
            throw new Exception("la contraseña debe contener al menos un numero.");
        }
        System.out.println("Contraseña valida...");
    }

    /*
    Metodo: mostrarMenu();
    Mustra un menu donde se podra ingresar una contraseña y validarla.
     */
    public static void mostrarMenu(){
        System.out.println("\t1.Ingresar una contraseña");

        System.out.println("\t2.Salir");

        System.out.println("\tOpcion: ");


    }
}
