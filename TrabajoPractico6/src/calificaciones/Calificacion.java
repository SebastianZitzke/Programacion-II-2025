package calificaciones;

import java.util.List;

public class Calificacion {

    /*
    Metodo validacionCalificacion();
    - Con este metodo vamos a validar que la calificacion ingresada sea ente 0 y 10.
     */

    public static void validacionCalificacion(double calificacion) throws Exception{
        if(calificacion < 0 || calificacion > 10){
            throw new Exception("Calificacion no valida: ["+calificacion+"]");
        }
    }

    /*
    Metodo validarLista();
    - Con este metodo vamos a implementar una lista de calificaciones en las cuales el programa
    va a analizar cuales de ellas son validas y cuales no.
     */
    public static void validarLista(List<Double> calificaciones){
        for(double nota : calificaciones){
            try {
                Calificacion.validacionCalificacion(nota);
                System.out.println("Calificacion valida: ["+nota+"]");
            } catch (Exception e) {
                System.out.println("ERROR: "+e);
            }
        }
    }


}
