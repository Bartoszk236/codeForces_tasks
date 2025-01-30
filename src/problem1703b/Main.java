package src.problem1703b;
//https://codeforces.com/problemset/problem/1703/B
//5:41 - time of solution

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            scanner.nextLine();
            System.out.println(solve(scanner.nextLine()));
        }
    }

    public static int solve(String line) {
        List<Character> solved = new ArrayList<>();
        char[] chars = line.toCharArray();
        int score = 0;
        for (int i = 0; i < chars.length; i++) {
            if (solved.contains(chars[i])) {
                score++;
            } else {
                solved.add(chars[i]);
                score += 2;
            }
        }
        return score;
    }
}
