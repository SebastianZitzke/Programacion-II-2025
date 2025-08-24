package Punto2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public abstract class Tarea {

    //Atributos.
    protected LocalDateTime fechaInicio;
    protected LocalDateTime fechaFin;
    protected String responsable;

    //Constructores.
    public Tarea(LocalDateTime fechaInicio, LocalDateTime fechaFin, String responsable) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.responsable = responsable;
    }


    //Metodo abstracto.
    public abstract String tareaAsignada();


    //Metodos comunes.
    public long calcularTiempo(){
        Duration duracion = Duration.between(fechaInicio,fechaFin);
        return duracion.toHours();
    }

    public String informe(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String texto = "-Tarea: "+tareaAsignada()+ "\n-Responsable: "+this.responsable+"\n-Fecha de inicio: "+fechaInicio.format(formato)+
                "\n-Fecha de finalizacion: "+fechaFin.format(formato)+"\n-Tiempo total invertido: "+calcularTiempo()+" horas";

        return texto;
    }
    }

