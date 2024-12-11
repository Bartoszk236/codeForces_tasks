package src.problem116a;
//https://codeforces.com/problemset/problem/116/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int max = 0, result = 0;
        for (int i = 0; i < n; i++) {
            int out = input.nextInt();
            int in = input.nextInt();
            max = max - out;
            max = max + in;
            if (max > result) result = max;
        }
        System.out.println(result);
    }
}