package Punto3;

public class ProductoElectronico extends Producto {

    //Atributos.
    private String periodoGarantia;

    public ProductoElectronico(String nombre, double precio,String periodoGarantia) {
        super(nombre, precio);
        this.periodoGarantia = periodoGarantia;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("--Detalles del producto--");
        System.out.println("|Producto: "+this.nombre);
        System.out.println("|Precio: $"+this.precio);
        System.out.println("|Periodo de garantia: "+this.periodoGarantia+ " meses");

    }
}
