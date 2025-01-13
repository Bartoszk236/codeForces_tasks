package src.problem432a;
//https://codeforces.com/problemset/problem/432/A
//8:40 - time of solution

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final int TEAM_MEMBERS = 3;
    public static final int MAX_COUNT_OF_CHAMPIONS = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        List<Integer> afterAdd = addAttempt(list, k);
        System.out.println(solve(afterAdd));
    }

    public static List<Integer> addAttempt(List<Integer> list, int k) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            result.add(list.get(i) + k);
        }
        return result;
    }

    public static int solve(List<Integer> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= MAX_COUNT_OF_CHAMPIONS) count++;
        }
        return count / TEAM_MEMBERS;
    }
}
