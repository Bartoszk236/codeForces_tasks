package src.problem1926a;
//https://codeforces.com/problemset/problem/1926/A
//3:09 - time of solution

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            String line = scanner.nextLine();
            System.out.println(solve(line));
        }
    }

    public static Character solve(String line) {
        char[] chars = line.toCharArray();
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            result.add(chars[i]);
        }
        long charA = result.stream().filter(c -> c == 'A').count();
        long charB = result.stream().filter(c -> c == 'B').count();
        return charA > charB ? 'A' : 'B';
    }
}
