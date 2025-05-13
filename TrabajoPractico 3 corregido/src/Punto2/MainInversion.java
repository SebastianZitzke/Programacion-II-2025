package Punto2;

public class MainInversion {
    public static void main(String[] args){

        //Creacion de objeto
        Inversion inversion1 = new Inversion(10,6,10000);

        //Calculamos el interes compuesto
        double calculoInteresCompuesto = Inversion.calculoInversion(
                inversion1.interesesInversion,
                inversion1.inversionInicial,
                inversion1.añosInversion);

//Redondeos
        double redondeo1 = Math.ceil(calculoInteresCompuesto);
        double redondeo2 = Math.floor(calculoInteresCompuesto);
        double redondeo3 = Math.round(calculoInteresCompuesto);


        System.out.println("==INVERSION==");
        System.out.println("----------------------------------------------------------");
        System.out.println("Inversion inicial: "+inversion1.inversionInicial + " $");
        System.out.println("----------------------------------------------------------");
        System.out.println("Interes anual: "+inversion1.interesesInversion+" %");
        System.out.println("----------------------------------------------------------");
        System.out.println("Años de inversion: "+inversion1.añosInversion+" años");
        System.out.println("----------------------------------------------------------");
        System.out.println("Inversion final: "+calculoInteresCompuesto+" $");
        System.out.println("----------------------------------------------------------");
        System.out.println("Redondeo 1: "+redondeo1+ " Redondeo 2: "+redondeo2+" Redondeo 3: "+redondeo3);
        System.out.println("----------------------------------------------------------");


    }

}