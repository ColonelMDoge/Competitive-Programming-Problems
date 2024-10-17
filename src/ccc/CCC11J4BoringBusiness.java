package ccc;

import java.util.Scanner;
public class CCC11J4BoringBusiness {
    public static int[][] boringPlan = new int[201][401];
    public static int xPos = 0, yPos = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        carveOut("d", 3, false);
        carveOut("r", 3, false);
        carveOut("d", 2, false);
        carveOut("r", 2, false);
        carveOut("u", 2, false);
        carveOut("r", 2, false);
        carveOut("d", 4, false);
        carveOut("l", 8, false);
        carveOut("u", 2, false);
        String line = input.nextLine();
        while(!line.contains("q")) {
            carveOut(line.split(" ")[0], Integer.parseInt(line.split(" ")[1]), true);
            line = input.nextLine();
        }
    }
    public static void carveOut(String dir, int quantity, boolean userInput) {
        boolean intersection = false;
        switch (dir) {
            case "d" -> {
                for (int i = 0; i < quantity; i++) {
                    if (boringPlan[yPos + 1][xPos + 200] == 1) {
                        intersection = true;
                    }
                    boringPlan[yPos + 1][xPos + 200] = 1;
                    yPos++;
                }
            }
            case "r" -> {
                for (int i = 0; i < quantity; i++) {
                    if (boringPlan[yPos][xPos + 201] == 1) {
                        intersection = true;
                    }
                    boringPlan[yPos][xPos + 201] = 1;
                    xPos++;

                }
            }
            case "l" -> {
                for (int i = 0; i < quantity; i++) {
                    if (boringPlan[yPos][xPos + 199] == 1) {
                        intersection = true;
                    }
                    boringPlan[yPos][xPos + 199] = 1;
                    xPos--;
                }
            }
            case "u" -> {
                for (int i = 0; i < quantity; i++) {
                    if (boringPlan[yPos - 1][xPos + 200] == 1) {
                        intersection = true;
                    }
                    boringPlan[yPos - 1][xPos + 200] = 1;
                    yPos--;
                }
            }
        }
        if (userInput && intersection) {
            System.out.println(xPos + " " + -yPos + " DANGER");
            System.exit(0);
        } else if (userInput) {
            System.out.println(xPos + " " + -yPos + " safe");
        }
    }
}