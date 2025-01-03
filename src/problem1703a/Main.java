package src.problem1703a;
//https://codeforces.com/problemset/problem/1703/A
//16:22 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testsNumber = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < testsNumber; i++) {
            String input = scanner.nextLine();
            char[] chars = input.toLowerCase().toCharArray();
            if (chars[0] == 'y' && chars[1] == 'e' && chars[2] == 's' ) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}