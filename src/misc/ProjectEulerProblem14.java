package misc;
public class ProjectEulerProblem14 {
    public static void main(String[] args) {
        int longestChain = 0, startingNumber = 0;
        for (int i = 1; i < 1000000; i++) {
            long chainNumber = i;
            int count = 0;
            while (chainNumber != 1) {
                if (chainNumber % 2 == 0) chainNumber /= 2;
                else chainNumber = chainNumber * 3 + 1;
                count++;
            }
            if (count > longestChain) {
                longestChain = count;
                startingNumber = i;
            }
        }
        System.out.println(startingNumber);
    }
}