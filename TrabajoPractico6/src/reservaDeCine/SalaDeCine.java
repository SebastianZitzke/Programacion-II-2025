package reservaDeCine;

public class SalaDeCine {
    private Asiento[] asientos;

    //-CREO LA SALA DE CINE
public SalaDeCine(int capacidad ){
    asientos = new Asiento[capacidad];
    for(int i=0;i<capacidad;i++){
        asientos[i] = new Asiento(i+1);
    }
}


public void reservarAsiento(int numeroAsiento) throws Exception{
    if(numeroAsiento < 0 || numeroAsiento > asientos.length){
        throw new Exception("El numero de asiento no es valido.");
    }
    asientos[numeroAsiento-1].ocuparAsiento();
    System.out.println("Reserva confirmada para el asiento: "+numeroAsiento);
}

    public void mostrarAsientos() {
        System.out.println("\nEstado de los asientos:");
        for (Asiento a : asientos) {
            System.out.print("[ " + a.getNumero() + (a.isOcupado() ? " X" : " O") + " ] ");
        }
        System.out.println();
    }
}






