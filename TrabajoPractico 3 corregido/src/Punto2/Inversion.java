package Punto2;

public class Inversion {

    //Atributos de la inversion.
    double inversionInicial , interesesInversion;
    int añosInversion;

    //Constructor.

    public Inversion(double interesesInversion, int añosInversion, double inversionInicial) {
        this.interesesInversion = interesesInversion;
        this.añosInversion = añosInversion;
        this.inversionInicial = inversionInicial;
    }

    //Metodo de calculo de la inversion.
    public static double calculoInversion(double interesesInversion,double inversionInicial,int añosInversion){
        double porcentaje = interesesInversion / 100;
        return inversionInicial * Math.pow(1+porcentaje,añosInversion);

    }
}
