package ccc;
import java.util.*;
import java.util.stream.IntStream;
public class CCC24J3BronzeCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = IntStream.range(0, input.nextInt()).map(value -> input.nextInt()).toArray();
        List<Integer> scoresList = Arrays.stream(scores).boxed().toList();
        SortedSet<Integer> list = new TreeSet<>(scoresList);
        Optional<Integer> bronzeScore = list.stream().skip(list.size() - 3).findFirst();
        System.out.print(bronzeScore.orElse(null) + " ");
        System.out.println(scoresList.stream().filter(value -> value.equals(bronzeScore.orElse(null))).count());
    }
}