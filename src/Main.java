import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileHandler fh = new FileHandler();

        ArrayList<Covid19Data> data = fh.loadData();

        for(Covid19Data d : data) {
            System.out.println(d);;
        }


    }
}