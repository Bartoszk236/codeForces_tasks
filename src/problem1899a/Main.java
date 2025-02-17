package src.problem1899a;
//https://codeforces.com/problemset/problem/1899/A
//20:14 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            if (n % 3 == 1 || n % 3 == 2) System.out.println("First");
            else System.out.println("Second");
        }
    }
}
