package Punto3;

public class Tweets {

    //Metodo para longitud de contraseña.
    public static void longitudContraseña(String tweet){
        int longitud = tweet.length();
        if(longitud > 0 && longitud <= 280){
            System.out.println("Caracteres: "+longitud);
        }
    }

    //Metodo para concatenar un hashtag.
    public static String concatenarHashtag(String tweet,String hashtag){
        return tweet + " # "+hashtag;
    }

    //Metodo para encontrar usuario.
    public static String encontrarUsuario(String tweet){
        int indice = tweet.indexOf('@');
        int fin = tweet.indexOf(" ",indice);

        if(indice == -1){
            return "No se encontro usuario.";
        }else{
            if(fin == -1){
                return tweet.substring(indice);
            }else{
                return tweet.substring(indice,fin);
            }
        }
    }

    //Metodo para crear un tweet a partir de varios fragmentos.
    public static String crearTweet (String part1,String part2,String part3){

        StringBuilder sb = new StringBuilder();
        sb.append(part1);
        sb.append(" ");
        sb.append(part2);
        sb.append(" ");
        sb.append(part3);
        sb.append(" ");

        return sb.toString();

    }



}
