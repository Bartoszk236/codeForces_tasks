package src.problem1294a;
//https://codeforces.com/problemset/problem/1294/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(solve(a, b, c, n));
        }
    }

    private static String solve(int a, int b, int c, int n) {
        int max = Math.max(a, Math.max(b, c));
        int diff = 0;
        if (max == a) diff = (max - b) + (max - c);
        else if (max == b) diff = (max - a) + (max - c);
        else diff = (max - b) + (max - a);
        n -= diff;
        if (n % 3 == 0 && n >= 0) return "YES";
        return "NO";
    }
}
