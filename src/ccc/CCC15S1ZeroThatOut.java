package ccc;

import java.util.Scanner;
import java.util.Stack;

public class CCC15S1ZeroThatOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int number = input.nextInt();
        for (int i = 0; i < number; i++) {
            stack.push(input.nextInt());
            if (stack.peek() == 0) {
                stack.pop();
                stack.pop();
            }
        }
        System.out.println(stack.stream().mapToInt(Integer::intValue).sum());
    }
}
