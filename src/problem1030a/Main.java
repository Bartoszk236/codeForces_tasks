package src.problem1030a;
//https://codeforces.com/problemset/problem/1030/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Set<Integer> verdicts = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int v = in.nextInt();
            verdicts.add(v);
        }
        List<Integer> sortedVerdicts = new ArrayList<>(verdicts);
        if (sortedVerdicts.size() > 1) System.out.print("HARD");
        else if (sortedVerdicts.getFirst() == 1) System.out.print("HARD");
        else System.out.print("EASY");
    }
}