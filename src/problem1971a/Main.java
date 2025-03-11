package src.problem1971a;
//https://codeforces.com/problemset/problem/1971/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.print(Math.min(x, y) + " " + Math.max(x, y) + "\n");
        }
    }
}
