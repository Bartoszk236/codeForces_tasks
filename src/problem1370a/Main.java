package src.problem1370a;
//https://codeforces.com/problemset/problem/1370/A
//41:10 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            if (n % 2 == 0) {
                System.out.println(n / 2);
            } else {
                System.out.println((n - 1) / 2);
            }
        }
    }
}