package src.problem1669a;
//https://codeforces.com/problemset/problem/1669/A
//4:56 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int rating  = scanner.nextInt();
            if (rating >= 1900) System.out.println("Division 1");
            else if (rating >= 1600) System.out.println("Division 2");
            else if (rating >= 1400) System.out.println("Division 3");
            else System.out.println("Division 4");
        }
    }
}