package Punto3;
import java.util.Scanner;
public class MainCuentaBancaria {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        //CREACION OBJETO.
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.numCuenta = 123;
        cuenta.nombre = "Juan Sebastian";
        cuenta.saldo = 1200;

        System.out.println("===BANCO DIGITAL===");
        System.out.println("Ingrese su numero de cuenta: ");
        int numeroCuenta = teclado.nextInt();

        if(numeroCuenta == cuenta.numCuenta) {
            System.out.println("Bienvenido: "+cuenta.nombre+"!");


            System.out.println("1.Agregar saldo");
            System.out.println("2.Retirar saldo");
            System.out.println("3.Mostrar saldo actual");
            System.out.println("Opcion: ");
            int opcion = teclado.nextInt();

            if (opcion == 1) {
                cuenta.consultaSaldo();
                System.out.println("¿Cuanto saldo desea agregar?: ");
                double saldo = teclado.nextDouble();
                cuenta.agregarSaldo(saldo);
                cuenta.consultaSaldo();
            }
            if (opcion == 2) {
                cuenta.consultaSaldo();
                System.out.println("¿Cuanto saldo desea retirar?: ");
                double saldo = teclado.nextDouble();
                cuenta.retirarSaldo(saldo);
                cuenta.consultaSaldo();
            }
            if (opcion == 3) {
                cuenta.consultaSaldo();
            }
            if (opcion < 1 || opcion > 3) {
                System.out.println("Opcion no valida.");
            }

        } else{
            System.out.println("Numero de cuenta incorrecto.");
        }
    }
}