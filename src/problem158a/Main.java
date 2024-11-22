package src.problem158a;
//https://codeforces.com/problemset/problem/158/A

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!(scanner.hasNextInt())) throw new RuntimeException("You must enter an integer");
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        if (n > 50 || n < 1 || k > 50 || k < 1) throw new RuntimeException("You must enter a number from 1 to 150");
        if (k > n) throw new RuntimeException("Number n must be bigger than k");
        List<Integer> scores = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int in = scanner.nextInt();
            scores.add(in);
        }
        int winners = 0;
        int pointsToWin = scores.get(k - 1);
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) >= pointsToWin && scores.get(i) != 0) winners++;
        }
        System.out.println(winners);
    }
}