package src.problem1742a;
//https://codeforces.com/problemset/problem/1742/A
//5:21 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (solve(a, b, c)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean solve(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }
}