package src.problem1850a;
//https://codeforces.com/problemset/problem/1850/A
//5:54 - time of solution

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                list.add(scanner.nextInt());
            }
            checkAnswer(addAll(list));
        }
    }

    public static List<Integer> addAll(List<Integer> list) {
        int first = list.getFirst();
        int last = list.getLast();
        int center = list.get(1);
        int ab = first + center;
        int ac = first + last;
        int bc = last + center;
        return Arrays.asList(ab, ac, bc);
    }

    public static void checkAnswer(List<Integer> list) {
        if (list.stream().anyMatch(number -> number >= 10)) System.out.println("YES");
        else System.out.println("NO");
    }
}