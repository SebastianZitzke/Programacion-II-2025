package Punto1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public abstract class Dispositivos {

    // Atributos
    protected String nombre;
    protected String estado;
    protected List<String> historial;

    // Formato de fecha y hora
    private final DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    // Constructor
    public Dispositivos(String nombre) {
        this.nombre = nombre;
        this.estado = "Apagado";
        this.historial = new ArrayList<>();
        agregarHistorial("Estado inicial: " + estado);
    }

    // Método que agrega todo al historial con su fecha
    protected void agregarHistorial(String mensaje) {
        String fechaHora = LocalDateTime.now().format(formato);
        this.historial.add("[" + fechaHora + "] " + mensaje);
    }

    // Encender dispositivo
    public void encender() {
        if (this.estado.equals("Apagado")) {
            this.estado = "Encendido";
            System.out.println(this.nombre + " fue encendido correctamente.");
            agregarHistorial(this.nombre + " fue encendido.");
        } else {
            System.out.println(this.nombre + " ya se encontraba encendido.");
            agregarHistorial("Se intentó encender nuevamente " + this.nombre);
        }
    }

    // Apagar dispositivo
    public void apagar() {
        if (this.estado.equals("Apagado")) {
            System.out.println("El dispositivo ya se encontraba apagado.");
            agregarHistorial("Se intentó apagar nuevamente " + this.nombre);
        } else {
            this.estado = "Apagado";
            System.out.println(this.nombre + " se ha apagado correctamente.");
            agregarHistorial(this.nombre + " fue apagado.");
        }
    }

    // Método abstracto
    public abstract void funcionamiento();

    // Mostrar historial completo
    public void mostrarHistorial() {
        System.out.println("---Historial de: " + this.nombre+"---");
        for (int i=0;i<historial.size();i++) {
            String hecho = this.historial.get(i);
            System.out.println(" - "+hecho);
        }
        System.out.println("-----------------------------------------------------------------");
    }
}
