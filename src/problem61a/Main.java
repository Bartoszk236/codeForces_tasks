package src.problem61a;
//https://codeforces.com/problemset/problem/61/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charsA.length; i++) {
            if (charsA[i] == charsB[i]) sb.append("0");
            else sb.append("1");
        }
        System.out.println(sb);
    }
}