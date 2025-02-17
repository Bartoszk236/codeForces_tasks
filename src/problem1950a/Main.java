package src.problem1950a;
//https://codeforces.com/problemset/problem/1950/A
//2:55 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a < b && b < c) System.out.println("STAIR");
            else if (a < b && b > c) System.out.println("PEAK");
            else System.out.println("NONE");
        }
    }
}