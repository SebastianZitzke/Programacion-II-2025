package Punto3;

public abstract class Producto implements Detallable{

//Atributos.
    protected String nombre;
    protected double precio;

    //Constructor.

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double calcularPrecio(){
        return precio;
    }
}
