package Punto1;

public class MainElectrodomestico {
    public static void main(String[] args) {
        //Creacion de objetos.
        Electrodomestico electrodomestico1 = new Electrodomestico("Televisor", 4000);
        Electrodomestico electrodomestico2 = new Electrodomestico("Lavarropas",3000);
        Electrodomestico electrodomestico3 = new Electrodomestico("Heladera",5000);

        System.out.println("==ELECTRODOMESTICOS==");
        System.out.println("--------------------------------------");
        System.out.println("1. "+electrodomestico1.nombre + " Consumo: "+electrodomestico1.consumoElectrodomestico + " Kwh");
        System.out.println("--------------------------------------");
        System.out.println("2. "+electrodomestico2.nombre + " Consumo: "+electrodomestico2.consumoElectrodomestico + " Kwh");
        System.out.println("--------------------------------------");
        System.out.println("3. "+electrodomestico3.nombre + " Consumo: "+electrodomestico3.consumoElectrodomestico + " Kwh");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");

        //Calculo cual es el que mas consume.
        double max = Math.max(electrodomestico1.consumoElectrodomestico, electrodomestico2.consumoElectrodomestico);
        double maxTotal = Math.max(electrodomestico3.consumoElectrodomestico, max);

        //Calculo cual es el que menos consume.
        double min = Math.min((electrodomestico1.consumoElectrodomestico), electrodomestico2.consumoElectrodomestico);
        double minTotal = Math.min(electrodomestico3.consumoElectrodomestico, min);

        System.out.println("Consumo maximo: "+maxTotal+ " Kwh");
        System.out.println("--------------------------------------");
        System.out.println("Consumo minimo: "+minTotal+" Kwh");
        System.out.println("--------------------------------------");


    }
}