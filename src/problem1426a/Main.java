package src.problem1426a;
//https://codeforces.com/problemset/problem/1426/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            System.out.println(solve(n, x));
        }
    }

    public static int solve(int n, int x) {
        int level = 1;
        if (n == 1 || n == 2) return level;
        int from = 3;
        int to = x + 2;
        while (true) {
            level++;
            for (int i = from; i <= to; i++) {
                if (i == n) return level;
            }
            from = to + 1;
            to = level * x + 2;
        }
    }
}
