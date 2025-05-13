package Punto5;

/*Gestor de empleados: Crea una clase Empleado que tenga los siguientes atributos: legajo,
nombre, salario y cantidad de empleados. La clase debe permitir:
• Cada empleado debe tener un numero único de legajo.
• Debe permitir aumentar el salario del empleado a través de un porcentaje y por medio
de un monto fijo, registrando el motivo del aumento.
• Se debe obtener la cantidad total de empleados./*

 */
public class Empleado {

    //Atributos.
    private   String nombre;
    private double salario;
    private int legajo;

    private static int numeroEmpleado = 0;

    //Constructor.


    public Empleado(String nombre, double salario) {
        numeroEmpleado ++;
        this.nombre = nombre;
        this.salario = salario;
        this.legajo = numeroEmpleado;
    }

    public void aumentarSalarioPorcentaje(double porcentaje,String motivo){
        double aumento = salario * (porcentaje/100);
        salario = salario + aumento;

        System.out.println("Aumento: "+aumento);
        System.out.println("Motivo: "+motivo);

    }

    public void aumentoSalarioTotal(double monto,String motivo){
        salario = monto + salario;

        System.out.println("Aumento: "+monto);
        System.out.println("Motivo: "+motivo);

    }

    public void datosEmpleado(){
        System.out.println("======================");
        System.out.println("Nombre: "+nombre);
        System.out.println("Legajo: "+legajo);
        System.out.println("Salario: "+salario);
        System.out.println("======================");
    }

    public static int getCantidadEmpleados() {
        return numeroEmpleado;
    }
}
