package src.problem1915a;
//https://codeforces.com/problemset/problem/1915/A
//6:10 - time of solution

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final int COUNT_OF_NUMBERS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < COUNT_OF_NUMBERS; j++) {
                list.add(scanner.nextInt());
            }
            System.out.println(solve(list));
        }
    }

    public static int solve(List<Integer> list) {
        list.sort(Integer::compareTo);
        if (list.getFirst() == list.get(1)) return list.get(2);
        else return list.getFirst();
    }
}