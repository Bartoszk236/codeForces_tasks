package src.problem1328a;
//https://codeforces.com/problemset/problem/1328/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(getMoves(scanner.nextInt(), scanner.nextInt()));
        }
    }

    public static int getMoves(int a, int b){
        if (a % b == 0) return 0;
        if (a < b) return b - a;
        return b - (a % b);
    }
}