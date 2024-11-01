import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private final File file = new File("CovidData.csv");

    public ArrayList<Covid19Data> loadData()  {
        ArrayList<Covid19Data> data = new ArrayList<>();
        Scanner sc = null;
        try {
            sc = new Scanner(file, StandardCharsets.ISO_8859_1);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] attributes = line.split(";");
            data.add(new Covid19Data(attributes[0], attributes[1],
                                    attributes[2], attributes[3],
                                    attributes[4], attributes[5],
                                    attributes[6]));

        }
        sc.close();
        return data;
    }
}
