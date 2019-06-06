package ua.lviv.iot;

import java.util.LinkedList;
import ua.lviv.iot.Auto.Car;
import ua.lviv.iot.Auto.Auto;
import ua.lviv.iot.Auto.Bus;
import ua.lviv.iot.Auto.Truck;
import ua.lviv.iot.Auto.Manager.AutoManagerImpl;

public class Main {

    public static void main(String[] args) {

        Bus Bus = new Bus("Black", "17", 3590, "1955");
        Car Car = new Car("Red","19",8354,"1999");
        Truck Truck = new Truck("White", "21", 19572, "2010");

        LinkedList<Auto> List = new LinkedList<Auto>();
        List.add(Bus);
        List.add(Car);
        List.add(Truck);

        AutoManagerImpl manager = new  AutoManagerImpl();
        System.out.println("List existing colors: "+ List.size()+ ";");
        for(int i = 0; i < List.size(); i++) {
            if(List.get(i) instanceof Auto) {
                System.out.println(List.get(i).getColor());
            }
        }

        manager.sortColor(List, true);
        System.out.println("Sort ascending color: ");
        for(int i = 0; i < List.size(); i++) {
            if(List.get(i) instanceof Auto) {
                System.out.println(List.get(i).getColor());
            }
        }

        manager.sortColor(List, false);
        System.out.println("Sort by descending color: ");
        for(int i = 0; i < List.size();i++) {
            if(List.get(i) instanceof Auto) {
                System.out.println(List.get(i).getColor());
            }
        }

        manager.sortByPrice(List, true);
        System.out.println(" Sort by ascending price: ");
        for(int i = 0; i< List.size();i++) {
            if(List.get(i) instanceof Auto) {
                System.out.println(List.get(i).getPrice());
            }
        }

        manager.sortByPrice(List, false);
        System.out.println(" Sort by price decreasing: ");
        for(int i = 0;i < List.size();i++) {	
            if(List.get(i) instanceof Auto) {
                System.out.println(List.get(i).getPrice());
            }
        }
        
        manager.findGraduationYear(List, "1955");
        System.out.println("GraduationYear: ");
        Auto resultGraduationYear  =  List.stream().filter(x -> "1955".equals(x.getGraduationYear())).findAny().orElse(null);
        System.out.println("\n" + resultGraduationYear);
        
        manager.findWheelDiameter(List, "19");
        System.out.println("WheelDiameter: ");
        Auto resultWheelDiameter  =  List.stream().filter(x -> "19".equals(x.getWheelDiameter())).findAny().orElse(null);
        System.out.println("\n" + resultWheelDiameter);
        
       
       
    }
}
