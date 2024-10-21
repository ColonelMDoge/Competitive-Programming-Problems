package ccc;

import java.util.HashMap;
import java.util.Scanner;

public class CCC06J3CellPhoneMessaging {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Character, Integer> pressAmount = new HashMap<>();
        HashMap<Character, Integer> keyBind = new HashMap<>();
        putMultiple(pressAmount, 1, 'a','d','g','j','m','p','t','w');
        putMultiple(pressAmount, 2, 'b','e','h','k','n','q','u','x');
        putMultiple(pressAmount, 3, 'c','f','i','l','o','r','v','y');
        putMultiple(pressAmount, 4, 's','z');
        putMultiple(keyBind, 2, 'a','b','c');
        putMultiple(keyBind, 3, 'd','e','f');
        putMultiple(keyBind, 4, 'g','h','i');
        putMultiple(keyBind, 5, 'j','k','l');
        putMultiple(keyBind, 6, 'm','n','o');
        putMultiple(keyBind, 7, 'p','q','r','s');
        putMultiple(keyBind, 8, 't','u','v');
        putMultiple(keyBind, 9, 'w','x','y','z');
        String sentence = input.nextLine();
        while (!sentence.equals("halt")) {
            int time = pressAmount.get(sentence.charAt(0));
            for (int i = 1; i < sentence.length(); i++) {
                if (keyBind.get(sentence.charAt(i)).equals(keyBind.get(sentence.charAt(i - 1)))) time += 2;
                time += pressAmount.get(sentence.charAt(i));
            }
            System.out.println(time);
            sentence = input.nextLine();
        }
     }
     public static void putMultiple(HashMap<Character, Integer> hashMap, int number, Character...chars) {
        for (char c : chars) hashMap.put(c, number);
     }
}
