package ccc;

import java.util.*;

public class CCC08J3GPSTextEntry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Character, ArrayList<Integer>> textPad = new HashMap<>();
        // dont ask why i did this
        textPad.put('A', new ArrayList<>(Arrays.asList(0,0)));
        textPad.put('B', new ArrayList<>(Arrays.asList(1,0)));
        textPad.put('C', new ArrayList<>(Arrays.asList(2,0)));
        textPad.put('D', new ArrayList<>(Arrays.asList(3,0)));
        textPad.put('E', new ArrayList<>(Arrays.asList(4,0)));
        textPad.put('F', new ArrayList<>(Arrays.asList(5,0)));
        textPad.put('G', new ArrayList<>(Arrays.asList(0,1)));
        textPad.put('H', new ArrayList<>(Arrays.asList(1,1)));
        textPad.put('I', new ArrayList<>(Arrays.asList(2,1)));
        textPad.put('J', new ArrayList<>(Arrays.asList(3,1)));
        textPad.put('K', new ArrayList<>(Arrays.asList(4,1)));
        textPad.put('L', new ArrayList<>(Arrays.asList(5,1)));
        textPad.put('M', new ArrayList<>(Arrays.asList(0,2)));
        textPad.put('N', new ArrayList<>(Arrays.asList(1,2)));
        textPad.put('O', new ArrayList<>(Arrays.asList(2,2)));
        textPad.put('P', new ArrayList<>(Arrays.asList(3,2)));
        textPad.put('Q', new ArrayList<>(Arrays.asList(4,2)));
        textPad.put('R', new ArrayList<>(Arrays.asList(5,2)));
        textPad.put('S', new ArrayList<>(Arrays.asList(0,3)));
        textPad.put('T', new ArrayList<>(Arrays.asList(1,3)));
        textPad.put('U', new ArrayList<>(Arrays.asList(2,3)));
        textPad.put('V', new ArrayList<>(Arrays.asList(3,3)));
        textPad.put('W', new ArrayList<>(Arrays.asList(4,3)));
        textPad.put('X', new ArrayList<>(Arrays.asList(5,3)));
        textPad.put('Y', new ArrayList<>(Arrays.asList(0,4)));
        textPad.put('Z', new ArrayList<>(Arrays.asList(1,4)));
        textPad.put(' ', new ArrayList<>(Arrays.asList(2,4)));
        textPad.put('-', new ArrayList<>(Arrays.asList(3,4)));
        textPad.put('.', new ArrayList<>(Arrays.asList(4,4)));
        String text = input.nextLine();
        int xPos = 0, yPos = 0;
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            int x = textPad.get(text.charAt(i)).getFirst();
            int y = textPad.get(text.charAt(i)).get(1);
            sum += Math.abs(y - yPos) + Math.abs(x - xPos);
            xPos = x;
            yPos = y;
        }
        sum += Math.abs(5 - yPos) + Math.abs(4 - xPos);
        System.out.println(sum);
    }
}
