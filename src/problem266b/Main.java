package src.problem266b;
//https://codeforces.com/problemset/problem/266/B

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        in.nextLine();
        String query = in.nextLine();
        char[] chars = query.toCharArray();
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (chars[j] == 'B' && chars[j + 1] == 'G') {
                    chars[j] = 'G';
                    chars[j + 1] = 'B';
                    j++;
                }
            }
        }
        System.out.print(new String(chars));
    }
}