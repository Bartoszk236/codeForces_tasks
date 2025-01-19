package src.problem1760a;
//https://codeforces.com/problemset/problem/1760/A
//3:10 - time of solution

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final int COUNT_OF_NUMBERS = 3;
    public static final int INDEX_OF_MEDIAN_NUMBER = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < COUNT_OF_NUMBERS; j++) {
                list.add(scanner.nextInt());
            }
            list.sort(Integer::compareTo);
            System.out.println(list.get(INDEX_OF_MEDIAN_NUMBER));
        }
    }
}