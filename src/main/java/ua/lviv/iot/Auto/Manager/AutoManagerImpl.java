package ua.lviv.iot.Auto.Manager;

import ua.lviv.iot.Auto.Auto;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class AutoManagerImpl implements AutoManager<Object> {

     @Override

        public  java.util.List<Auto> findGraduationYear(
             List<Auto> list,  String graduationYear) {
            return list;
        }

    @Override
    public  java.util.List<Auto> findWheelDiameter(
             List<Auto> list,  String wheelDiameter) {
        return list;
    }


    public  java.util.List<Auto> sortByPrice(
            java.util.List<Auto> list,  boolean sortGoods) {
        if (sortGoods == true) {
            list.sort(Comparator.comparing(Auto::getPrice));
        }

        if (sortGoods == false) {
            list.sort(Comparator.comparing(Auto::getPrice).reversed());
        }
        return list;
    }

    public  LinkedList<Auto> sortColor(
             LinkedList<Auto> list,  boolean sortGoods) {
        if (sortGoods == true) {
            list.sort(Comparator.comparing(Auto::getColor));
        }

        if (sortGoods == false) {
            list.sort(Comparator.comparing(Auto::getColor).reversed());
        }
        return list;
    }

    @Override
    public  List<Auto> sortByPrice(List<Auto> list,  int sortGoods) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public  List<Auto> sortByColor(
            List<Auto> list,  boolean sortGoods) {
        // TODO Auto-generated method stub
        return null;
    }
}