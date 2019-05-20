package ua.lviv.iot.Auto.Manager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import ua.lviv.iot.Auto.Auto;

public class RepairAutoManager {

  public static void writeToFile(List<Auto> repairs)
      throws FileNotFoundException, IOException {
    File myFile = new File("out.csv");
    try (FileOutputStream fos = new FileOutputStream(myFile);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bufWriter = new BufferedWriter(osw);) {
      for (Auto repair:repairs) {
        bufWriter.write(
            repair.getHeaders() + "\n"
            + repair.toCSV() + "\n"
        );
      }
    } finally {
      System.out.println();
    }
  }

@SuppressWarnings("unused")
private String toCSV() {
	// TODO Auto-generated method stub
	return null;
}

@SuppressWarnings("unused")
private String getHeaders() {
	// TODO Auto-generated method stub
	return null;
}
} 