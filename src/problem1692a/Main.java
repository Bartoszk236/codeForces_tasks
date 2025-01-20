package src.problem1692a;
//https://codeforces.com/problemset/problem/1692/A
//13:44 - time of solution

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final int NUMBER_OF_PEOPLE = 4;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            List<Integer> distances = new ArrayList<>();
            for (int j = 0; j < NUMBER_OF_PEOPLE; j++) {
                distances.add(scanner.nextInt());
            }
            System.out.println(howManyPeopleIsBetterThenTimur(distances));
        }
    }

    public static int howManyPeopleIsBetterThenTimur(List<Integer> distances) {
        int timurDistance = distances.getFirst();
        int betterDistance = 0;
        for (int i = 1; i < NUMBER_OF_PEOPLE; i++) {
            if (distances.get(i) > timurDistance) betterDistance++;
        }
        return betterDistance;
    }
}