package Punto2;

import java.util.Comparator;

public class ComparatorArraylist2 implements Comparator<OrdenamientoArraylist> {
    @Override
    public int compare(OrdenamientoArraylist o1, OrdenamientoArraylist o2) {
        return Integer.compare(o1.getStock(),o2.getStock());
    }
}
