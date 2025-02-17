package src.problem1353b;
//https://codeforces.com/problemset/problem/1353/B
//19:54 - time of solution

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            List<Integer> listA = new ArrayList<>();
            List<Integer> listB = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                listA.add(scanner.nextInt());
            }
            for (int j = 0; j < n; j++) {
                listB.add(scanner.nextInt());
            }
            System.out.println(solve(listA, listB, k));
        }
    }

    public static int solve(List<Integer> listA, List<Integer> listB, int k) {
        listA.sort(Comparator.naturalOrder());
        listB.sort(Comparator.reverseOrder());
        List<Integer> result = new ArrayList<>();
        int kTemp = k;
        for (int i = 0; i < k; i++) {
            int valueB = listB.get(i);
            if (valueB > listA.get(i)) {
                result.add(valueB);
            } else kTemp--;
        }
        for (int i = kTemp; i < listA.size(); i++) {
            result.add(listA.get(i));
        }
        return result.stream().reduce(0, Integer::sum);
    }
}
