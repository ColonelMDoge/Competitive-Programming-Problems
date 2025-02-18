package ccc;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC11S2MultipleChoice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> choices = new ArrayList<>();
        int n = input.nextInt(), correct = 0;
        for (int i = 0; i < 2 * n; i++) {
            choices.add(input.next());
        }
        for (int i = 0; i < n; i++) {
            if (choices.get(i).equals(choices.get(i+n))) correct++;
        }
        System.out.println(correct);
    }
}
