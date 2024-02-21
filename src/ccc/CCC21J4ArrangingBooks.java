package ccc;
import java.util.Scanner;
public class CCC21J4ArrangingBooks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.next();
        int countL = 0,  countS = 0, countSinL = 0, countLinL = 0, countLinS = 0, countSinS = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'L') countL++;
            if (sentence.charAt(i) == 'S') countS++;
        }
        for (int i = 0; i < countL; i++) {
            if (sentence.charAt(i) == 'S') countSinL++;
            if (sentence.charAt(i) == 'L') countLinL++;
        }
        for (int i = sentence.length() - 1; i > sentence.length() - countS - 1; i--) {
            if (sentence.charAt(i) == 'S') countSinS++;
            if (sentence.charAt(i) == 'L') countLinS++;
        }
        int max = Math.max(countLinS,countSinL);
        int lNotCounted = countL - countLinL - countLinS;
        int sNotCounted = countS - countSinL - countSinS;
        System.out.println(max + lNotCounted + sNotCounted);
    }
}