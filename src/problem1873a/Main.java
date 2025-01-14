package src.problem1873a;
//https://codeforces.com/problemset/problem/1873/A
//6:20 - time of solution

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
            ArrayList<Character> list = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                list.add(line.charAt(j));
            }
            System.out.println(solve(list));
        }
    }

    public static String solve(List<Character> list) {
        int count = 0;
        if (list.getFirst() == 'a') count++;
        if (list.get(1) == 'b') count++;
        if (list.getLast() == 'c') count++;
        if (count > 0) {
            return "YES";
        } else {
            return "NO";
        }
    }
}