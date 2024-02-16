package ccc;

import java.util.Scanner;
import static java.lang.Integer.parseInt;
public class CCC14J3DoubleDice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int antonia = 100;
        int dave = 100;
        int games = input.nextInt();
        input.nextLine();

        for (int i = 0; i < games; i++) {

            String[] dice = input.nextLine().split(" ");

            if (parseInt(dice[0]) == parseInt(dice[1])) continue;
            else if (parseInt(dice[0]) < parseInt(dice[1])) antonia -= parseInt(dice[1]);
            else dave -= parseInt(dice[0]);

        }

        System.out.println(antonia);
        System.out.println(dave);

    }
}
