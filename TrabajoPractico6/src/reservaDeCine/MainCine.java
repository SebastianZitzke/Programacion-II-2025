package reservaDeCine;

import java.util.Scanner;

public class MainCine {
    public static void main(String[] args) {

        Scanner sb = new Scanner(System.in);

        SalaDeCine sala1 = new SalaDeCine(15);

        boolean salir = false;

        while(!salir){
            sala1.mostrarAsientos();
            System.out.println("Ingrese el numero de asiento a reservar(0 para salir): ");
            int asiento = sb.nextInt();

            if(asiento == 0){
                salir = true;
            }else{
                try{
                    sala1.reservarAsiento(asiento);

                }catch (Exception e){
                    System.out.println("Error: "+e);
                }
            }
        }
        System.out.println("Programa finalizado.");
    }



}
