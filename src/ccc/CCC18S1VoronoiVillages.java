package ccc;

import java.util.*;
public class CCC18S1VoronoiVillages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        double nSize = Double.POSITIVE_INFINITY; // required
        ArrayList<Double> villages = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            villages.add(input.nextDouble());
        }

        Collections.sort(villages);

        for (int i = 0; i < number - 2; i++) {

            double v = villages.get(i + 1);
            double n1 = villages.get(i);
            double n2 = villages.get(i + 2);
            double space = ((v - n1) / 2) + ((n2 - v) / 2);

            if (space < nSize) {
                nSize = space;
            }

        }
        System.out.printf("%.1f\n", nSize);
    }
}
