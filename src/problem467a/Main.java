package src.problem467a;
//https://codeforces.com/problemset/problem/467/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = 0, q = 0, count = 0, n = 0;
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            p = scanner.nextInt();
            q = scanner.nextInt();
            if (q - p > 1) count++;
        }
        System.out.println(count);
    }
}