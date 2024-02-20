package ccc;
import java.util.Scanner;
public class CCC23J3SpecialEvent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numPeople = input.nextInt();
        int[] availablePeople = new int[5];
        for (int i = 0; i < numPeople; i++) {
            String week = input.next();
            for (int j = 0; j < week.length(); j++) {
                if (week.charAt(j) == 'Y') availablePeople[j]++;
            }
        }
        String days = "";
        int maxPeople = 0;
        for (int i : availablePeople) {
            if (i > maxPeople) maxPeople = i;
        }
        for (int i = 0; i < availablePeople.length; i++) {
            if (availablePeople[i] == maxPeople) days += (i + 1) + ",";
        }
        System.out.println(days.substring(0, days.length() - 1));
    }
}