package Punto2;

import java.util.*;

import static Punto2.Ordenamiento.bubbleSort;
import static Punto2.Ordenamiento.crearArreglo;


public class Main {
    public static void main(String[] args) {

        int[] tamaños = {100, 1000, 10000};

        for (int tamaño : tamaños) {
            int[] original = crearArreglo(tamaño);

            int[] arreglo1 = Arrays.copyOf(original, original.length);
            int[] arreglo2 = Arrays.copyOf(original, original.length);

            long inicio1 = System.nanoTime();
            bubbleSort(arreglo1);
            long fin1 = System.nanoTime();

            long inicio2 = System.nanoTime();
            Arrays.sort(arreglo2);
            long fin2 = System.nanoTime();

            System.out.println("Tamaño: " + tamaño);
            System.out.println("Bubble Sort: " + (fin1 - inicio1) / 1_000_000.0 + " ms");
            System.out.println("Arrays.sort(): " + (fin2 - inicio2) / 1_000_000.0 + " ms");
            System.out.println();
        }


//PRODUCTO.

Producto1[] productos = {
                new Producto1("Television",250,4),
                new Producto1("Playstation 5",750,3),
                new Producto1("Xbox one",650,6),

};
        //Ordenar los productos por precio.
        System.out.println("--Productos ordenados por precio--");
        Arrays.sort(productos);
        for(Producto1 p : productos){
            System.out.println(p);
        }
        System.out.println("----------------------------------------------------------");
        //Ordenar los productos por nombre
        System.out.println("--Productos ordenados por nombre--");
        Arrays.sort(productos,new ComparatorProducto1());
        for(Producto1 p : productos){
            System.out.println(p);
        }
        System.out.println("----------------------------------------------------------");

        //Creo el array list.

       OrdenamientoArraylist producto1 = new OrdenamientoArraylist("Lavarropas",25,3);
        OrdenamientoArraylist producto2 = new OrdenamientoArraylist("Plancha",60,5);
        OrdenamientoArraylist producto3 = new OrdenamientoArraylist("Cafetera", 35, 2);

        List<OrdenamientoArraylist> listaProducto = new ArrayList<OrdenamientoArraylist>();
        listaProducto.add(producto1);
        listaProducto.add(producto2);
        listaProducto.add(producto3);

        //Ordenamiento por nombre
        System.out.println("--Productos ordenados por nombre(Arraylist)--");
        Collections.sort(listaProducto);
        for(OrdenamientoArraylist p: listaProducto){
            System.out.println(p);
        }
        System.out.println("----------------------------------------------------------");
        //Productos ordenados por precio.
        System.out.println("--Productos ordenados por precio--");
        Collections.sort(listaProducto, new ComparatorArraylist1());

        for(OrdenamientoArraylist p: listaProducto){
            System.out.println(p);
        }
        System.out.println("----------------------------------------------------------");
        //Productos ordenados por stock
        System.out.println("--Productos ordenados por stock--");
        Collections.sort(listaProducto, new ComparatorArraylist2());
        for(OrdenamientoArraylist p: listaProducto) {
            System.out.println(p);
        }





    }




    }
