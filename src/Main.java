import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileHandler fh = new FileHandler();

        ArrayList<Covid19Data> data = fh.loadData();

        for(Covid19Data d : data) {
            System.out.println(d);;
        }
        System.out.println();
        System.out.println("Would you like to order by Region or Age Group?");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        switch(input) {
            case "region" -> {
                Collections.sort(data, new RegionComparator());
                for(Covid19Data dat : data) {
                    System.out.println(dat);
                }
            }
            case "age group" -> {
                Collections.sort(data, new AldersGruppeComparator());
                for(Covid19Data dat : data) {
                    System.out.println(dat);
                }
            }
        }
    }
}