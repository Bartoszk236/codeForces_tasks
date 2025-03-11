package src.problem1955a;
//https://codeforces.com/problemset/problem/1955/A
//3:58 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int min;
            if (n % 2 == 0) {
                min = Math.min(a * n, b * (n / 2));
            } else {
                min = Math.min(a * n, b * (n / 2) + a);
            }
            System.out.println(min);
        }
    }
}
