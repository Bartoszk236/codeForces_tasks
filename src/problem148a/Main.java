package src.problem148a;
//https://codeforces.com/problemset/problem/148/A
//6:12 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= d; i++) {
            if (i % k == 0) count++;
            else if (i % l == 0) count++;
            else if (i % m == 0) count++;
            else if (i % n == 0) count++;
        }
        System.out.println(count);
    }
}