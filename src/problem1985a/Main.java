package src.problem1985a;
//https://codeforces.com/problemset/problem/1985/A
//8:21 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            String a = scanner.next();
            String b = scanner.next();
            System.out.println(b.charAt(0) + a.substring(1, 3) + " " + a.charAt(0) + b.substring(1, 3));
        }
    }
}
