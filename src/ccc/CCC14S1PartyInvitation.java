package ccc;

import java.util.ArrayList;
import java.util.Scanner;

public class CCC14S1PartyInvitation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int friends = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= friends; i++) list.add(i);
        int sacrifices = input.nextInt();
        for (int i = 0; i < sacrifices; i++) {
            int size = list.size(), purge = input.nextInt();
            for (int j = 0; j < size; j++) {
                if ((j + 1) % purge != 0) list.add(list.get(j));
            }
            for (int k = 0; k < size; k++) list.removeFirst();
        }
        list.forEach(System.out::println);
    }
}
