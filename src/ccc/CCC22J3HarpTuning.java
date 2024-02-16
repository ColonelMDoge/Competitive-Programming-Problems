package ccc;

import java.util.Scanner;
public class CCC22J3HarpTuning {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sequence = input.nextLine();
        char[] line = sequence.toCharArray();

        String instruction;
        int lastPos = 0;
        int endPos = 0;

        for (int x = 0; x < line.length; x++) {
            if(line[x] == '+' || line[x] == '-') {
                for (int i = x + 1; i < line.length; i++) {
                    if (Character.isDigit(line[i])) {
                        endPos++;
                    } else break;
                }

                instruction = sequence.substring(lastPos, x + endPos + 1);
                lastPos = x + endPos + 1;
                endPos = 0;

                if (instruction.contains("+")) {
                    String result = instruction.replace("+", " tighten ");
                    System.out.println(result);
                } else if (instruction.contains("-")) {
                    String result = instruction.replace("-", " loosen ");
                    System.out.println(result);
                }
            }
        }
    }
}