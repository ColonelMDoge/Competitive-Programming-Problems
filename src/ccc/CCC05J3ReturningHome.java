package ccc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CCC05J3ReturningHome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        ArrayList<String> directions = new ArrayList<>(), locations = new ArrayList<>();
        short counter = 0;
        while (!sentence.equals("SCHOOL")) {
            if (counter % 2 == 0) directions.add(sentence);
            else locations.add(sentence);
            counter++;
            sentence = input.next();
        }
        Collections.reverse(locations);
        Collections.reverse(directions);
        locations.add("HOME");
        for (int i = 0; i < directions.size(); i++) {
            if (directions.get(i).equals("L")) directions.set(i, "R");
            else if (directions.get(i).equals("R")) directions.set(i, "L");
        }
        for (int i = 0; i < locations.size() - 1; i++) {
            if (directions.get(i).equals("L")) System.out.println("Turn LEFT onto " + locations.get(i) + " street.");
            else if (directions.get(i).equals("R")) System.out.println("Turn RIGHT onto " + locations.get(i) + " street.");
        }
        if (directions.getLast().equals("L")) System.out.println("Turn LEFT into your HOME.");
        else if (directions.getLast().equals("R")) System.out.println("Turn RIGHT into your HOME.");
    }
}
