package ccc;
import java.util.Scanner;
public class CCC15J3Rovarspraket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String vowels = "aeiou";
        String consonants = "bcdfghjklmnpqrstvwxyz";
        String consonantA = "bc";
        String consonantE = "dfg";
        String consonantI = "hjkl";
        String consonantO = "mnpqr";
        StringBuilder word = new StringBuilder();
        for (char c : input.nextLine().toCharArray()) {
            word.append(c);
            if (vowels.contains(String.valueOf(c))) continue;
            word.append(consonantA.contains(String.valueOf(c)) ? "a" : consonantE.contains(String.valueOf(c)) ? "e" : consonantI.contains(String.valueOf(c)) ? "i" : consonantO.contains(String.valueOf(c)) ? "o" : "u");
            if (c == 'z') word.append('z');
            else word.append(consonants.charAt(consonants.indexOf(c) + 1));
        }
        System.out.println(word);
        input.close();
    }
}