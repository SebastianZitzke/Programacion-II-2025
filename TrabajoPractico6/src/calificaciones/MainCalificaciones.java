package calificaciones;

import java.util.ArrayList;
import java.util.Arrays;

public class MainCalificaciones {

    public static void main(String[] args) {

        System.out.println("---SISTEMA DE VALIDACIONES DE CALIFICACIONES---");
        ArrayList<Double> calificaciones = new ArrayList<>();
        calificaciones.add(2.5);
        calificaciones.add(9.5);
        calificaciones.add(-3.4);
        calificaciones.add(13.8);

        System.out.println("Validando las calificaciones...");
        System.out.println("");
        Calificacion.validarLista(calificaciones);



    }

}
