package src.problem758a;
//https://codeforces.com/problemset/problem/758/A
//6:00 - time of solution

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println(solve(list));
    }

    public static int solve(List<Integer> list) {
        int max = list.stream().max(Integer::compareTo).get();
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += max - list.get(i);
        }
        return sum;
    }
}