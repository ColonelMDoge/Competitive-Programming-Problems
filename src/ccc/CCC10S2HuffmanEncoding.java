package ccc;

import java.util.HashMap;
import java.util.Scanner;

public class CCC10S2HuffmanEncoding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Character, String> code = new HashMap<>();
        int sequences = input.nextInt();
        for (int i = 0; i < sequences; i++) {
            code.put(input.next().charAt(0), input.next());
        }
        String encodedSequence = input.next();
        int pointer = 0;
        while (pointer < encodedSequence.length()) {
            for (Character c : code.keySet()) {
                if (encodedSequence.substring(pointer).startsWith(code.get(c))) {
                    System.out.print(c);
                    pointer += code.get(c).length();
                }
            }
        }
    }
}
