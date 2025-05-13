package Punto5;

public class mainEmpleado {
    public static void main(String[] args){

        Empleado empleado1 = new Empleado("Sebastian",6000);
        Empleado empleado2 = new Empleado("Juan",4500);

        empleado1.datosEmpleado();
        empleado1.aumentarSalarioPorcentaje(10,"Horas extras");
        empleado1.aumentoSalarioTotal(2500,"Bono navideño");
        empleado1.datosEmpleado();

        empleado2.datosEmpleado();

        System.out.println("Numero total de empleados: "+Empleado.getCantidadEmpleados());



    }
}
