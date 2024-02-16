package ccc;

import java.util.*;
public class CCC21J3SecretInstructions {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String lastTurn = "";

        while (true) {

            String combo = input.nextLine();
            if (combo.equals("99999")) break;

            char[] combination = combo.toCharArray();
            String sequence = "";
            int direction = (combination[0] - '0') + (combination[1] - '0');

            if (direction == 0) sequence += lastTurn;
            else if (direction % 2 == 0) sequence += "right";
            else sequence += "left";

            lastTurn = sequence;
            sequence = sequence + (" " + combination[2] + combination[3] + combination[4]);
            System.out.println(sequence);

        }
    }
}