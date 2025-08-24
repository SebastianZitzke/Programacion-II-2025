package Punto1;

public class Camara extends Dispositivos {

    public Camara(String nombre) {
        super(nombre);
    }

    @Override
    public void funcionamiento() {

        if (!this.estado.equals("Encendido")) {
            System.out.println("Error: el dispositivo está apagado. No se puede ejecutar funcionamiento.");
            agregarHistorial("Error al intentar ejecutar funcionamiento mientras estaba apagado.");
            return;
        }

        System.out.println("Fotografia tomada!");
        agregarHistorial("Se tomo una fotografia.");

    }
}
