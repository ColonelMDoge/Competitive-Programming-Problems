package ccc;

import java.math.BigInteger;
import java.util.Scanner;

public class CCC12S1DontPassMeTheBall {
    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ONE) || n.equals(BigInteger.ZERO)) return BigInteger.ONE;
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt() - 1;
        if (n < 4) {
            System.out.println(0);
            return;
        }
        BigInteger numerator = factorial(BigInteger.valueOf(n));
        BigInteger denominator = factorial(BigInteger.valueOf(n-3));
        System.out.println(numerator.divide(denominator).divide(BigInteger.valueOf(6)));
    }
}
