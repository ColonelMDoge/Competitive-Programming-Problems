package ccc;
import java.util.Scanner;
import java.util.Arrays;
public class CCC13J4TimeOnTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minutes = input.nextInt();
        int chores = input.nextInt();
        int[] list = new int[chores];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        int totalChores = 0;
        int time = 0;
        for (int j : list) {
            if (time + j <= minutes) {
                totalChores++;
                time += j;
            } else break;
        }
        System.out.println(totalChores);
    }
}