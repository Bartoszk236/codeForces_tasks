package src.problem1999a;
//https://codeforces.com/problemset/problem/1999/A
//4:26 - time of solution

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
        int first = n / 10;
        int second = n - (first * 10);
        return first + second;
    }
}