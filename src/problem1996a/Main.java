package src.problem1996a;
//https://codeforces.com/problemset/problem/1996/A
//2:53 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            if (n % 4 == 0) System.out.println(n / 4);
            else System.out.println((n / 4) + 1);
        }
    }
}
