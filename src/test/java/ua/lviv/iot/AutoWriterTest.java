package ua.lviv.iot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.Auto.Auto;
import ua.lviv.iot.Auto.Bus;
import ua.lviv.iot.Auto.Car;
import ua.lviv.iot.Auto.CarBrand;
import ua.lviv.iot.Auto.Motor;
import ua.lviv.iot.Auto.Truck;
import ua.lviv.iot.Auto.VolumeMotor;
import ua.lviv.iot.Auto.Manager.*;

class AutosWriterTest {

  private List<Auto> repairs;

  public void setUp() {
    repairs = new ArrayList<>();
  }
  
  @BeforeEach
  public void beforeEach() {
    repairs = new ArrayList<>();
    repairs.add(new Bus("Black", "17", 3590, "1955", CarBrand.BMW, 17, 23));
    repairs.add(new Car("Red", "19", 8354, "1999", VolumeMotor.Big, 17, 2.0));
    repairs.add(new Truck("White", "21", 19572, "2010",  Motor.DIESEL, 15, 27));
    
  }
  
  @Test
  public void testWriteToFile() throws FileNotFoundException, IOException {
    RepairAutoManager.writeToFile(repairs);
    File myFile = new File("out.csv");
    try (FileInputStream fis = new FileInputStream(myFile);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader bufReader = new BufferedReader(isr);) {
      String line = null;
      String lines = "";
      while ((line = bufReader.readLine()) != null) {
        lines += line + "\n";
      }
      lines = lines.substring(0, lines.length() - 1);
      System.out.println(lines);
      Assertions.assertEquals(
          "color, wheelDiameter,\r\n" + 
          "price, graduationYear,color, wheelDiameter, brand, numberOfWindows, numberOfStandingPlaces, " +
          "Black, 17, 3590,1955, CarBrand.BMW, 17, 23\n" + 
          "color, wheelDiameter, price, graduationYear, volume, seats, loadCapacity\n" + 
          "Red, 19, 8354, 1999, VolumeMotor.Big, 17, 2.0\n" + 
          "color, wheelDiameter, price, graduationYear, dvig, weight, numberOfWheels\n" + 
          "White, 21, 19572, 2010,  Motor.DIESEL, 15, 27\n",lines);
    } finally {
      System.out.println();
    }
  }

}