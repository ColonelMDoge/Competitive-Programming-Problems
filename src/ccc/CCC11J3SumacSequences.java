package ccc;

import java.util.*;
public class CCC11J3SumacSequences {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> sumacSequence = new ArrayList<>();
        sumacSequence.add(input.nextInt());
        sumacSequence.add(input.nextInt());

        for (int i = 0; true; i++) {

            int n1 = sumacSequence.get(i);
            int n2 = sumacSequence.get(i + 1);
            int sumac = n1 - n2;

            if (sumac >= 0) {
                sumacSequence.add(sumac);
            } else {
                System.out.println(sumacSequence.size());
                break;

            }
        }
    }
}
