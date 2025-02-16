package ccc;

import java.util.Scanner;
import java.util.Stack;

public class CCC08J4FromPrefixToPostfix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        String line = input.nextLine();
        while(!line.equals("0")) {
            line = line.replaceAll(" ", "");
            if (!(line.contains("+") || line.contains("-"))) {
                System.out.println(line);
                line = input.nextLine();
                continue;
            }
            for (int i = line.length()-1; i >= 0; i--) {
                if (line.charAt(i) != '+' && line.charAt(i) != '-') stack.push(line.substring(i,i+1));
                else stack.push(stack.pop() + stack.pop() + line.charAt(i));
            }
            System.out.println(stack.pop().replaceAll(""," ").trim());
            line = input.nextLine();
        }
    }
}