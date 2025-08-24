package Punto2;

import java.time.LocalDateTime;

public class mainTarea {
    public static void main(String[] args){

        LocalDateTime inicio = LocalDateTime.of(2025,8,23,12,32);
        LocalDateTime fin = LocalDateTime.of(2025,9,10,20,0);

Dev programador = new Dev(inicio,fin,"Programador");
Publicidad publicidad = new Publicidad(inicio,fin,"Jefe de publicidad/marketing");
Test tester = new Test(inicio,fin,"Tester QA");

        System.out.println("...................................................");
        System.out.println(programador.informe());
        System.out.println("...................................................");
        System.out.println(publicidad.informe());
        System.out.println("...................................................");
        System.out.println(tester.informe());
        System.out.println("...................................................");






    }
}
