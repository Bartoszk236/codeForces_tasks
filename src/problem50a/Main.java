package src.problem50a;
//https://codeforces.com/problemset/problem/50/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1 ≤ m ≤ n ≤ 16
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) throw new IllegalArgumentException("You must enter a integer");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        checkInput(m, n);
        System.out.println((n * m) / 2);
    }

    public static void checkInput(int m, int n) {
        if (m < 1 || n < 1) throw new IllegalArgumentException("Input must be greater than 0");
        if (n > 16 || m > 16) throw new IllegalArgumentException("Input must be less then 16");
        if (n < m) throw new IllegalArgumentException("Second input number must be less then first input number");
    }
}