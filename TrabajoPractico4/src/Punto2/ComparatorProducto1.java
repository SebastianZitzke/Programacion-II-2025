package Punto2;

import java.util.Comparator;

public class ComparatorProducto1 implements Comparator<Producto1> {

    @Override
    public int compare(Producto1 o1, Producto1 o2) {
        return o1.getNombre().compareToIgnoreCase(o2.getNombre());
    }
}
