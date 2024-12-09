package src.problem59a;
//https://codeforces.com/problemset/problem/59/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int big = 0, small = 0;
        char[] input = in.nextLine().toCharArray();
        for (int i = 0; i < input.length; i++) {
            char c = input[i];
            if (Character.isLowerCase(c)) {
                small++;
            } else if (Character.isUpperCase(c)) {
                big++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            char c = input[i];
            sb.append(c);
        }
        String result = sb.toString();
        if (small == big) System.out.println(result.toLowerCase());
        if (small > big) System.out.println(result.toLowerCase());
        if (small < big) System.out.println(result.toUpperCase());
    }
}