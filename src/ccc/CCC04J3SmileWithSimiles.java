package ccc;

import java.util.Scanner;
public class CCC04J3SmileWithSimiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nOfAdj = input.nextInt();
        int nOfNoun = input.nextInt();
        input.nextLine();

        String[] adj = new String[nOfAdj];
        String[] noun = new String[nOfNoun];

        for(int i = 0; i < nOfAdj; i++) {
            adj[i] = input.nextLine();
        }
        for (int i = 0; i < nOfNoun; i++) {
            noun[i] = input.nextLine();
        }
        for (int i = 0; i < nOfAdj; i++) {
            for (int x = 0; x < nOfNoun; x++) {
                System.out.println(adj[i] + " as " + noun[x]);
            }
        }
    }
}
