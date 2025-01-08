package src.problem144a;
//https://codeforces.com/problemset/problem/144/A
//14:50 - time of solution

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        int biggest = 0, biggestIndex = 0;
        int least = Integer.MAX_VALUE, leastIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > biggest) {
                biggest = list.get(i);
                biggestIndex = i;
            }
            if (list.get(i) <= least) {
                least = list.get(i);
                leastIndex = i;
            }
        }
        if (biggestIndex < leastIndex) System.out.println(biggestIndex + (list.size() - (leastIndex + 1)));
        else System.out.println(biggestIndex + (list.size() - (leastIndex + 1)) - 1);
    }
}