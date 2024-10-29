package ccc;

import java.util.*;

public class CCC15J4WaitTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> friends = new HashMap<>();
        Map<String, Integer> friendSum = new TreeMap<>();
        Map<String, Integer> friendMessages = new TreeMap<>();
        int length = input.nextInt();
        input.nextLine();
        int t = 0;
        for (int i = 0; i < length; i++) {
            String line = input.nextLine();
            char event = line.charAt(0);
            String num  = line.substring(2);
            if (event != 'W') t++;
            else t += Integer.parseInt(num) - 1;
            if (event == 'R') {
                friends.put(num, t);
                friendMessages.put(num, friendMessages.getOrDefault(num, 0) + 1);
            }
            if (event == 'S') {
                friends.put(num, t - friends.get(num));
                friendSum.put(num, friendSum.getOrDefault(num, 0) + friends.get(num));
                friendMessages.put(num, friendMessages.get(num) - 1);
            }
        }
        for (String key : friendMessages.keySet()) {
            System.out.println(key + " " + (friendMessages.get(key) == 0 ? friendSum.get(key) : -1));
        }
    }
}
