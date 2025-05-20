package Punto2;

public class OrdenamientoArraylist implements Comparable<OrdenamientoArraylist> {

    private String nombre;
    private double precio;
    private int stock;

    public OrdenamientoArraylist(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public int compareTo(OrdenamientoArraylist o) {
        return this.nombre.compareTo(o.getNombre());
    }

    @Override
    public String toString() {
        return "Productos{ Nombre: " + getNombre() + ", Precio: $" + getPrecio() + ", Stock: " + getStock() + " }";
    }
}
