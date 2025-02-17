package src.problem1676b;
//https://codeforces.com/problemset/problem/1676/B
//6:14 - time of solution

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
            System.out.println(solve(list));
        }
    }

    public static int solve(List<Integer> list) {
        int sum = 0;
        int min = list.stream().min(Integer::compareTo).get();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > min) {
                sum += list.get(i) - min;
            }
        }
        return sum;
    }
}
