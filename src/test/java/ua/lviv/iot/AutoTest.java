package ua.lviv.iot;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.Auto.Manager.AutoManagerImpl;
import ua.lviv.iot.Auto.*;

public class AutoTest {
    
    private List<Auto> instruments;
    
    private AutoManagerImpl iRepairManager;
    
  
    
    @BeforeEach
    public void beforeEach() {
        instruments = new ArrayList<>();
        instruments.add(new Bus("Black", "17", 300, "1955", 17, 23));
        instruments.add(new Car("Red", "19", 8354, "1999", 17, 2.0));
        instruments.add(new Truck("White", "21", 19572, "2010", 15, 27));
        iRepairManager = new AutoManagerImpl();
    }  
    @Test
    void testSortPriceAscending() {
        AutoManagerImpl.sortByPrice(instruments , true);
        Assertions.assertEquals(300, instruments.get(0).getPrice());
    }
    
    @Test
    void testSortPriceAscendingR() {
        AutoManagerImpl.sortByPrice(instruments , false);
        Assertions.assertEquals(19572, instruments.get(0).getPrice());
    }
    
    @Test
    void testSortPriceAscendingb() {
        AutoManagerImpl.sortByPrice(instruments , false);
        Assertions.assertEquals(8354, instruments.get(1).getPrice());
    }
    
    @Test
    void testSortProducerAscending() {
        AutoManagerImpl.sortColor(instruments , true);
        Assertions.assertEquals("Black", instruments.get(0).getColor());
    }
    
    @Test
    void testSortProducerAscendingR() {
        AutoManagerImpl.sortColor(instruments , false);
        Assertions.assertEquals("Red", instruments.get(1).getColor());
    }
    
    @Test
    void testSortProducerAscendings() {
        AutoManagerImpl.sortColor(instruments , false);
        Assertions.assertEquals("White", instruments.get(0).getColor());
    }
    
    @Test
    void testFilterByRating() {
        Assertions.assertEquals(3, iRepairManager.findWheelDiameter(instruments, "17").size());
        Assertions.assertEquals(3, iRepairManager.findWheelDiameter(instruments, "19").size());
        Assertions.assertEquals(3, iRepairManager.findWheelDiameter(instruments, "21").size());
    }
    
  
}