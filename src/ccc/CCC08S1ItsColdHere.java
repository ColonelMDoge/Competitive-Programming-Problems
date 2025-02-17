package ccc;

import java.util.Scanner;

public class CCC08S1ItsColdHere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minTemp = 201;
        String coldest = "";
        while(true) {
            String city = input.next();
            int temp = input.nextInt();
            if (temp < minTemp) {
                minTemp = temp;
                coldest = city;
            }
            if (city.equals("Waterloo")) break;
        }
        System.out.println(coldest);
    }
}
