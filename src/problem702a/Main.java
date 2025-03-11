package src.problem702a;
//https://codeforces.com/problemset/problem/702/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int score = 0;
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            if (value > max) {
                max = value;
                score++;
            } else {
                max = value;
                score = 1;
            }
            set.add(score);
        }
        System.out.println(set.stream().max(Integer::compareTo).get());
    }
}
