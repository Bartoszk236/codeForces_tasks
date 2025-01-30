package src.problem1360a;
//https://codeforces.com/problemset/problem/1360/A
//24:16 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println((int) Math.pow(Math.min(Math.max(a, b * 2), Math.max(a * 2, b)), 2));
        }
    }
}
