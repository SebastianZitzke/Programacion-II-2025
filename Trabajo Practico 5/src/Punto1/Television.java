package Punto1;

public class Television extends Dispositivos {

    //Atributo propio.
    private String programaTv;

    public Television(String nombre, String programaTv) {
        super(nombre);
        this.programaTv = programaTv;
    }

    @Override
    public void funcionamiento() {
        if (!this.estado.equals("Encendido")) {
            System.out.println("Error: el dispositivo está apagado. No se puede ejecutar funcionamiento.");
            agregarHistorial("Error al intentar ejecutar funcionamiento mientras estaba apagado.");
            return;
        }
        System.out.println("Reproduciendo: "+this.programaTv);
        agregarHistorial(this.nombre+" reproducio: "+this.programaTv);

    }
}
