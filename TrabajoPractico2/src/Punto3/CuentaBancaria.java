package Punto3;

public class CuentaBancaria {
    //ATRIBUTOS.
    int numCuenta;
    String nombre;
    double saldo;

    //METODOS.
    public void agregarSaldo(double saldoAgregar){
        saldo = saldo + saldoAgregar;
    }
    public void retirarSaldo(double saldoRetirar){
        if(saldoRetirar > saldo){
            System.out.println("El saldo que desea retirar es mayor que el de su cuenta.");
        }else{
            saldo = saldo - saldoRetirar;
        }
    }
    public void consultaSaldo(){
        System.out.println("Su saldo actual es: "+saldo);
    }

}