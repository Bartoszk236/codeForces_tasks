package src.problem492a;
//https://codeforces.com/problemset/problem/492/A
//23:21 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int level = 0, sumCubesOnLevel = 1, count = 2;
        while (n >= sumCubesOnLevel) {
            n -= sumCubesOnLevel;
            level++;
            sumCubesOnLevel += count;
            count++;
        }
        System.out.println(level);
    }
}
