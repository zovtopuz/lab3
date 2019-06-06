package ua.lviv.iot.Auto.Manager;


import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.Auto.Auto;
public interface AutoManager<S> {
    LinkedList<Auto> list = new LinkedList<Auto>();

    List<Auto> findGraduationYear(List<Auto> list, String graduationYear);
    List<Auto> findWheelDiameter(List<Auto> list, String wheelDiameter);
    List<Auto> sortByPrice(List<Auto> list, int sortGoods);
    List<Auto> sortByColor(List<Auto> list, boolean sortGoods);
}
