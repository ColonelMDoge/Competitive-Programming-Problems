package misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PEGTest2Spooky4Me {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(tokenizer.nextToken());
        long L = Long.parseLong(tokenizer.nextToken());
        int S = Integer.parseInt(tokenizer.nextToken());
        List<List<Long>> houses = new ArrayList<>();
        houses.add(List.of(L + 1, 0L));
        for (int i = 0; i < N; i++) {
            tokenizer = new StringTokenizer(br.readLine());
            long a = Long.parseLong(tokenizer.nextToken()), b = Long.parseLong(tokenizer.nextToken()), s = Long.parseLong(tokenizer.nextToken());
            houses.add(List.of(a, s));
            houses.add(List.of(b + 1, -s));
        }
        houses.sort(Comparator.comparingLong(List::getFirst));
        int spookyThreshold = 0;
        for (int i = 0; i < houses.size() - 1; i++) {
            spookyThreshold += houses.get(i).get(1);
            if (spookyThreshold >= S) {
                L -= houses.get(i + 1).getFirst() - houses.get(i).getFirst();
            }
        }
        System.out.println(L);
    }
}
