package src.problem959a;
//https://codeforces.com/problemset/problem/959/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) System.out.println("Mahmoud");
        else System.out.println("Ehab");
    }
}
