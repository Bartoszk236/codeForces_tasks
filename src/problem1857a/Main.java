package src.problem1857a;
//https://codeforces.com/problemset/problem/1857/A
//4:45 - time of solution

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(scanner.nextInt());
            }
            int sum = list.stream().reduce(0, Integer::sum);
            if (sum % 2 == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
