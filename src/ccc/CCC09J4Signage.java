package ccc;

import java.util.*;

public class CCC09J4Signage {
    public static void determineString(List<String> subList, int targ) {
        StringBuilder builder = new StringBuilder(String.join(".", subList));
        if (subList.size() == 1 && subList.getFirst().length() < targ) builder.append(".");
        int pos = builder.indexOf(".");
        while(builder.length() < targ) {
            if (pos != -1) builder.insert(pos, ".");
            pos = builder.indexOf(".", pos + 3);
        }
        System.out.println(builder);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        String[] sentence = "WELCOME TO CCC GOOD LUCK TODAY".split(" ");
        int subSentenceLength = 0, spaces = 0, words = 0;
        List<String> subList = new ArrayList<>();
        for (String s : sentence) {
            if (s.length() == length) {
                System.out.println(s);
                continue;
            }
            else if (subSentenceLength + s.length() + spaces >= length) {
                determineString(subList, length);
                subSentenceLength = 0;
                subList.clear();
                words = 0;
            }
            subList.add(s);
            subSentenceLength += s.length();
            words++;
            spaces = words - 1;
        }
        determineString(subList, length);
    }
}
