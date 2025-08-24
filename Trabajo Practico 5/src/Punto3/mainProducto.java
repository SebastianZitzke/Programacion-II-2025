package Punto3;

public class mainProducto {
    public static void main(String[] args){

ProductoAlimenticio p1 = new ProductoAlimenticio("Leche",1500,"01-09-2025");
ProductoAlimenticio p2 = new ProductoAlimenticio("Cafe",2000,"29-08-2025");
ProductoElectronico p3 = new ProductoElectronico("Celular",1000000,"12");
ProductoIndumentaria p4 = new ProductoIndumentaria("Remera",20000,"L");

        p1.mostrarDetalle();
        System.out.println("\n");
        p2.mostrarDetalle();
        System.out.println("\n");
        p3.mostrarDetalle();
        System.out.println("\n");
        p4.mostrarDetalle();
        System.out.println("\n");
        System.out.println("---------------------------");

        System.out.println("|Precio total: $"+(p1.calcularPrecio()+ p2.calcularPrecio()+ p3.calcularPrecio()+ p4.calcularPrecio())+"|");
        System.out.println("---------------------------");
    }
}
