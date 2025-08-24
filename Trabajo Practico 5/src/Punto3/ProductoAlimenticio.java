package Punto3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProductoAlimenticio extends Producto {

    //Atributo.
    private LocalDate fechaVencimiento;

    //Constructor.
    public ProductoAlimenticio(String nombre, double precio, String fechaVencimiento) {
        super(nombre, precio);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaVencimiento = LocalDate.parse(fechaVencimiento, formato);
    }

    public boolean calcularFechaVencimiento(){
        LocalDate hoy = LocalDate.now();
        LocalDate limite = hoy.plusDays(7);
        return !fechaVencimiento.isAfter(limite);
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("--Detalles del producto--");
        System.out.println("|Producto: "+this.nombre);
        System.out.println("|Precio: $"+this.precio);
        System.out.println("|Vencimiento: "+this.fechaVencimiento);
        System.out.println("|¿Esta por vencer?| "+(calcularFechaVencimiento() ? "Si":"No"));

    }
}
