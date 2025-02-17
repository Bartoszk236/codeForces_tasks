package src.problem1535a;
//https://codeforces.com/problemset/problem/1535/A
//7:58 - time of solution

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            LinkedList<Integer> list = new LinkedList<>();
            for (int j = 0; j < 4; j++) {
                list.add(scanner.nextInt());
            }
            System.out.println(solve(list));
        }
    }

    public static String solve(LinkedList<Integer> list) {
        int finalOne = Math.max(list.get(0), list.get(1));
        int finalTwo = Math.max(list.get(2), list.get(3));
        list.sort(Comparator.reverseOrder());
        if ((finalOne == list.getFirst() || finalOne == list.get(1))
                && (finalTwo == list.getFirst() || finalTwo == list.get(1))) return "YES";
        return "NO";
    }
}
