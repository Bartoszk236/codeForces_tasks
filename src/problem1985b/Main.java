package src.problem1985b;
//https://codeforces.com/problemset/problem/1985/B

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            System.out.println(solve(n));
        }
    }

    public static int solve(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 2; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j < Integer.MAX_VALUE; j++) {
                int score = i * j;
                if (score > n) break;
                sum += score;
            }
            map.put(i, sum);
        }
        int maxKey = -1;
        int maxValue = Integer.MIN_VALUE;
        for (int key : map.keySet()) {
            int value = map.get(key);
            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
            }
        }
        return maxKey;
    }
}
