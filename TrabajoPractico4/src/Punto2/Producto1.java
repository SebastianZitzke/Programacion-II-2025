package Punto2;

public class Producto1 implements Comparable<Producto1>{

   private String nombre;
   private double precio;
   private int stock;

    public Producto1(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int compareTo(Producto1 o) {
        return Double.compare(getPrecio(),o.precio);
    }

    @Override
    public String toString() {
        return "Producto{ Nombre: "+getNombre()+", Precio: $"+getPrecio()+", Stock: "+getStock();


    }
}
