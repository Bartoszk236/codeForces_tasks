package src.problem231a;
//https://codeforces.com/problemset/problem/231/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!(scanner.hasNextInt())) throw new RuntimeException("You must enter an integer");
        int n = scanner.nextInt();
        if (n > 1000 || n < 1) throw new RuntimeException("You must enter a number from 1 to 1000");
        int winners = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j <= 3; j++) {
                sum += scanner.nextInt();
            }
            if (sum > 1) winners++;
        }
        System.out.println(winners);
    }
}