package Punto3;

import java.util.Scanner;

public class MainTweets {
    public static void main(String[] args){
        Scanner sb = new Scanner(System.in);

//1.Solicitamos que ingrese un tweet al usuario.
        System.out.println("==TWEETS==");
        System.out.println("Ingrese un tweet: ");
        String tweet = sb.nextLine();


        //2.Solicito que ingrese un hashtag.
        System.out.println("Ingrese un hashtag: ");
        String hashtag = sb.nextLine();


        //3.Solicito que el usuario ingrese fragmentos para crear un tweet.
        System.out.println("Ingrese 3 fragmentos de tweet");
        System.out.println("Fragmento 1: ");
        String part1 = sb.nextLine();
        System.out.println("Fragmento 2: ");
        String part2 = sb.nextLine();
        System.out.println("Fragmento 3: ");
        String part3 = sb.nextLine();

        //4. Muestro por pantalla.
        System.out.println("---------------------------------------------------------------");
        System.out.println("Tweet: "+tweet);
        System.out.println("---------------------------------------------------------------");
        Tweets.longitudContraseña(tweet);
        System.out.println("---------------------------------------------------------------");
        System.out.println("Hashtag: "+Tweets.concatenarHashtag(tweet,hashtag));
        System.out.println("---------------------------------------------------------------");
        System.out.println("Usuario: "+Tweets.encontrarUsuario(tweet) );
        System.out.println("---------------------------------------------------------------");
        System.out.println("Tweet por fragmentos: "+Tweets.crearTweet(part1,part2,part3));
        System.out.println("---------------------------------------------------------------");












    }


}
