package Punto1;

public class ManipularArreglos {

//Metodo para sumar los numeros.

    public static int sumarNumeros(int[] arreglo){
        int suma = 0;

        for(int i=0;i<arreglo.length;i++){
            suma = suma + arreglo[i];

        }
return suma;

    }

    //Metodo para calcular el mayor.
    public static int calcularMayor(int[] arreglo){
        int mayor = arreglo[0];
        for(int i: arreglo){
            if(i>mayor){
                mayor=i;
            }
        }
return mayor;
    }

    public static int calcularMenor(int[] arreglo){
        int menor = arreglo[0];
        for(int i: arreglo){
                if(i<menor){
                    menor=i;
                }
            }
            return menor;

    }

    public static void mostrarArray(int[] arreglo){
        for(int i=0;i<arreglo.length;i++){
            System.out.println(arreglo[i]);
        }
    }

    public static void mostrarArrayInvertido(int[] arreglo){
        for(int i=arreglo.length-1;i>=0;i--){
            System.out.println(arreglo[i]);
        }
    }







}
