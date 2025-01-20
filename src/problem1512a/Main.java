package src.problem1512a;
//https://codeforces.com/problemset/problem/1512/A
//6:34 - time of solution

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

    public static int solve(List<Integer> numbers) {
        int first = numbers.getFirst();
        int last = numbers.getLast();
        int dominant = 0;
        if (first == last) dominant = first;
        else dominant = numbers.get(1);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) != dominant) return i + 1;
        }
        return 0;
    }

}