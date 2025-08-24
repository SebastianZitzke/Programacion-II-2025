public class ReproductorMusica extends Dispositivos {

    private String musicName;
    private String autor;

    public ReproductorMusica(String nombre, String musicName, String autor) {
        super(nombre);
        this.musicName = musicName;
        this.autor = autor;
    }

    @Override
    public void funcionamiento() {
        if (!this.estado.equals("Encendido")) {
            System.out.println("Error: el dispositivo está apagado. No se puede ejecutar funcionamiento.");
            agregarHistorial("Error al intentar ejecutar funcionamiento mientras estaba apagado.");
            return;
        }

        System.out.println("Reproduciendo: " + this.musicName + " - " + this.autor);
        agregarHistorial("Reproduciendo " + this.musicName + " - " + this.autor);
    }
}
