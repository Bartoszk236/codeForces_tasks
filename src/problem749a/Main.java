package src.problem749a;
//https://codeforces.com/problemset/problem/749/A
//6:56 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            n = n / 2;
            System.out.println(n);
            for (int i = 0; i < n; i++) {
                System.out.print("2 ");
            }
        } else {
            n = n / 2;
            System.out.println(n);
            System.out.print("3 ");
            for (int i = 0; i < n - 1; i++) {
                System.out.println("2 ");
            }
        }
    }
}
