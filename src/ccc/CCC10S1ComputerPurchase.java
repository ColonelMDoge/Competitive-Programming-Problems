package ccc._2010;

import java.util.*;

public class CCC10S1ComputerPurchase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computers = input.nextInt();
        int max = 0, secondMax = 0;
        ArrayList<String> list = new ArrayList<>();
        SortedSet<String> filtered = new TreeSet<>();
        SortedSet<String> filtered2 = new TreeSet<>();
        for (int i = 0; i < computers; i++) {
            String name = input.next();
            int rating  = 2 * input.nextInt() + 3 * input.nextInt() + input.nextInt();
            if(rating > max) {
                secondMax = max;
                max = rating;
            } else if (rating > secondMax && rating != max) secondMax = rating;
            list.add(name + "." + rating);
        }
        for (String s : list) {
            if (s.contains(String.valueOf(max))) filtered.add(s.split("\\.")[0]);
            if (s.contains(String.valueOf(secondMax))) filtered2.add(s.split("\\.")[0]);
        }
        for (String s : filtered) System.out.println(s);
        int o = filtered.size();
        for (int i = 0; i < filtered2.size() && filtered.size() != 2; i++) {
            String e = filtered2.removeFirst();
            filtered.add(e);
            if (filtered.size() > o) {
                System.out.println(e);
                break;
            }
        }
    }
}
