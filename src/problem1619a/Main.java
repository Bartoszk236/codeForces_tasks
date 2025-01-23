package src.problem1619a;
//https://codeforces.com/problemset/problem/1619/A
//3:38 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            String word = scanner.nextLine();
            int wordLength = word.length();
            if (wordLength % 2 == 1) {
                System.out.println("NO");
            } else {
                int halfIndex = wordLength / 2;
                String a = word.substring(0, halfIndex);
                String b = word.substring(halfIndex);
                if (a.equals(b)) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}