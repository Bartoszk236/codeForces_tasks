package src.problem268a;
//https://codeforces.com/problemset/problem/268/A
//26:36 - time of solution

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int teamsNumber = scanner.nextInt();
        HashMap<Integer, List<Integer>> teams = new HashMap<>();
        for (int i = 0; i < teamsNumber; i++) {
            int homeColor = scanner.nextInt();
            int awayColor = scanner.nextInt();
            teams.put(i, List.of(homeColor, awayColor));
        }
        int count = 0;
        for (int i = 0; i < teamsNumber; i++) {
            int mainColor = teams.get(i).getFirst();
            for (int j = 0; j < teamsNumber; j++) {
                if (j != i) {
                    int otherColor = teams.get(j).get(1);
                    if (mainColor == otherColor) count++;
                }
            }
        }
        System.out.println(count);
    }
}