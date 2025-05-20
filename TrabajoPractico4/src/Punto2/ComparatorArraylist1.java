package Punto2;

import java.util.Comparator;

public class ComparatorArraylist1 implements Comparator<OrdenamientoArraylist> {


    @Override
    public int compare(OrdenamientoArraylist o1, OrdenamientoArraylist o2) {
        return Double.compare(o1.getPrecio(), o2.getPrecio());
    }
}
