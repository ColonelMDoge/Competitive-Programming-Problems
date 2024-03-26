package misc;
public class ProjectEulerProblem16 {
    public static void main(String[] args) {
        // Crazy one liner to compete against python buddy :D
        System.out.println(new java.math.BigInteger("2").pow(1000).toString().chars().map(Character::getNumericValue).sum());
    }
}