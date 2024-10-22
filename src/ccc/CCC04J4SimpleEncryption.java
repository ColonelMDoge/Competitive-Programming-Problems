package ccc;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC04J4SimpleEncryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String keyword = input.nextLine(), message = input.nextLine();
        ArrayList<Character> encryption = new ArrayList<>();
        for (int i = 0; i < message.length(); i++) {
            if (Character.isLetter(message.charAt(i))) encryption.add(message.charAt(i));
        }
        for (int charOfKey = 0; charOfKey < keyword.length(); charOfKey++) {
            for (int charOfMessage = 0; charOfMessage < encryption.size(); charOfMessage++) {
                if (charOfMessage % keyword.length() == charOfKey) {
                    encryption.set(charOfMessage, (char) (65 + (encryption.get(charOfMessage) + keyword.charAt(charOfKey)) % 65 % 26));
                }
            }
        }
        for (Character c : encryption) System.out.print(c);
    }
}
