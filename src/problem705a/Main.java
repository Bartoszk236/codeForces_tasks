package src.problem705a;
//https://codeforces.com/problemset/problem/705/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append("I hate that");
            } else {
                sb.append("I love that");
            }
            sb.append(" ");
        }
        sb.delete(sb.length() - 5, sb.length()).append("it");
        System.out.println(sb);
    }
}