package ccc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CCC22S2GoodGroups {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create ArrayLists to store the TOGETHER and SEPARATE groups
        ArrayList<String[]> TOGETHER = new ArrayList<>();
        ArrayList<String[]> SEPARATE = new ArrayList<>();

        // Get the TOGETHER group from user input
        int num1 = input.nextInt();
        input.nextLine();
        for (int i = 0; i < num1; i++) {
            TOGETHER.add(input.nextLine().split(" "));
        }

        // Get the SEPARATE group from user input
        int num2 = input.nextInt();
        input.nextLine();
        for (int i = 0; i < num2; i++) {
            SEPARATE.add(input.nextLine().split(" "));
        }

        // Create a HashMap to store the names and their group index
        HashMap<String, Integer> nameLookup = new HashMap<>();
        int num3 = input.nextInt();
        input.nextLine();
        for (int i = 0; i < num3; i++) {
            String[] names = input.nextLine().split(" ");
            for (String name : names) {
                nameLookup.put(name, i);
            }
        }

        // Check for violations in the TOGETHER group
        int violations = 0;
        for (String[] group : TOGETHER) {
            if (!nameLookup.get(group[0]).equals(nameLookup.get(group[1]))) {
                violations++;
            }
        }

        // Check for violations in the SEPARATE group
        for (String[] group : SEPARATE) {
            if (nameLookup.get(group[0]).equals(nameLookup.get(group[1]))) {
                violations++;
            }
        }

        // Output the number of violations
        System.out.println(violations);
    }
}