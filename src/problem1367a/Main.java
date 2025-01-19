package src.problem1367a;
//https://codeforces.com/problemset/problem/1367/A
//29:28 - time of solution

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            String line = scanner.nextLine();
            System.out.println(solve(line));
        }
    }

    public static String solve(String line) {
        int length = line.length();
        String end = line.substring(length - 2);
        String inside = line.substring(0, length - 2);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inside.length(); i++) {
            if (i % 2 == 0) sb.append(inside.charAt(i));
        }
        sb.append(end);
        return sb.toString();
    }
}