package src.problem228a;
//https://codeforces.com/problemset/problem/228/A

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static final int NUMBER_OF_HORSE_SHOES = 4;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < NUMBER_OF_HORSE_SHOES; i++) {
            set.add(scanner.nextInt());
        }
        System.out.println(NUMBER_OF_HORSE_SHOES - set.size());
    }
}