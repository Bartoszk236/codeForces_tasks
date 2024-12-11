package src.problem677a;
//https://codeforces.com/problemset/problem/677/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = in.nextInt();
        int width = 0;
        for (int i = 0; i < n; i++) {
            int height = in.nextInt();
            if (height > h) width += 2;
            else width++;
        }
        System.out.print(width);
    }
}