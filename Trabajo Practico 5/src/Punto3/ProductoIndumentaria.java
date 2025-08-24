package Punto3;

public class ProductoIndumentaria extends Producto{

    //Atributo
    private String talle;

    public ProductoIndumentaria(String nombre, double precio,String talle) {
        super(nombre, precio);
        this.talle = talle;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("--Detalles del producto--");
        System.out.println("|Producto: "+this.nombre);
        System.out.println("|Precio: $"+this.precio);
        System.out.println("|Talle: "+this.talle);

    }
}
