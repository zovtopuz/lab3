package ua.lviv.iot.Auto.Manager;

import ua.lviv.iot.Auto.Auto;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class AutoManagerImpl  {

	LinkedList<Auto> list = new LinkedList<Auto>(); 
	
    public final List<Auto> findGraduationYear(
            final List<Auto> list, final String graduationYear) {
        return list;
        }

  
    public final List<Auto> findWheelDiameter(
            final List<Auto> list, final String wheelDiameter) {
        return list;
        }


    public static List<Auto> sortByPrice(
             List<Auto> list, final boolean sortGoods) {
if(sortGoods == true) {
            list.sort(Comparator.comparing(Auto::getPrice));
        }
        if(sortGoods == false) {
            list.sort(Comparator.comparing(Auto::getPrice).reversed());
        }
        return list;
    }

    public static List<Auto> sortColor(
             List<Auto> list, final boolean sortGoods) {
        if(sortGoods == true) {
            list.sort(Comparator.comparing(Auto::getColor));
        }

        if(sortGoods == false) {
            list.sort(Comparator.comparing(Auto::getColor).reversed());
        }
        return list;
    }


    }