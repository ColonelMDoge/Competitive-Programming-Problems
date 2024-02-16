package ccc;

import java.util.Scanner;
public class CCC19J3ColdCompress {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StringBuilder formattedLine = new StringBuilder();
        int counter = 0;

        int lines = input.nextInt();
        input.nextLine();
        String[] FLArray = new String[lines];

        for (int i = 0; i < lines; i++) {
            char[] sequence = input.nextLine().toCharArray();
            for (int x = 0; x < sequence.length; x++) {
                if (x != sequence.length - 1 && sequence[x] == sequence[x + 1]) counter++;
                else {
                    formattedLine.append(counter + 1).append(" ").append(sequence[x]).append(" ");
                    counter = 0;
                }
            }
            FLArray[i] = formattedLine.toString();
            formattedLine = new StringBuilder();
        }
        for (String i : FLArray) {
            System.out.println(i);
        }
    }
}