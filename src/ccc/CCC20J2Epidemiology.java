package ccc;

import java.util.Scanner;
public class CCC20J2Epidemiology {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int people = input.nextInt();
        int infected = input.nextInt();
        int infectionsPerPerson = input.nextInt();
        int day = 0;
        int infectedPeople = infected;

        for(int i = 0; true; i++) {

            if (infectedPeople > people) {
                System.out.println(day);
                break;
            }

            day++;
            infected *= infectionsPerPerson;
            infectedPeople += infected;

        }
    }
}
