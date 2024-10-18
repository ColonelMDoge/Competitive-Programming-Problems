package ccc;

import java.util.HashMap;
import java.util.Scanner;

public class CCC10J3Punchy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sequence = input.nextLine();
        HashMap<String, Integer> variables = new HashMap<>();
        variables.put("A", 0);
        variables.put("B", 0);
        while (!sequence.equals("7")) {
            String firstLetter = String.valueOf(sequence.charAt(2));
            switch (Integer.parseInt(String.valueOf(sequence.charAt(0)))) {
                case 1 -> variables.put(firstLetter, Integer.parseInt(sequence.substring(4)));
                case 2 -> System.out.println(variables.get(firstLetter));
                case 3 -> variables.put(firstLetter, variables.get(firstLetter) + variables.get(String.valueOf(sequence.charAt(4))));
                case 4 -> variables.put(firstLetter, variables.get(firstLetter) * variables.get(String.valueOf(sequence.charAt(4))));
                case 5 -> variables.put(firstLetter, variables.get(firstLetter) - variables.get(String.valueOf(sequence.charAt(4))));
                case 6 -> variables.put(firstLetter, variables.get(firstLetter) / variables.get(String.valueOf(sequence.charAt(4))));
            }
            sequence = input.nextLine();
        }
    }
}