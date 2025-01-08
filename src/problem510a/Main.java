package src.problem510a;
//https://codeforces.com/problemset/problem/510/A
//1:15:16 - time of solution

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<String> patterns = createPatterns(m);
        int realRow = 1, patternRow = 0;
        while (realRow <= n) {
            if (realRow % 2 != 0) {
                System.out.println(patterns.getFirst());
                realRow++;
            } else {
                if (patternRow % 2 == 0){
                    System.out.println(patterns.get(1));
                    patternRow++;
                    realRow++;
                } else {
                    System.out.println(patterns.get(2));
                    patternRow++;
                    realRow++;
                }
            }
        }
    }

    public static List<String> createPatterns(int m) {
        StringBuilder firstPart = new StringBuilder();
        List<String> patterns = new ArrayList<>();
        for (int j = 0; j < m; j++) {
            firstPart.append("#");
        }
        patterns.add(firstPart.toString());
        StringBuilder secondPart = new StringBuilder();
        for (int j = 0; j < m - 1; j++) {
            secondPart.append(".");
        }
        secondPart.append("#");
        patterns.add(secondPart.toString());
        StringBuilder thirdPart = new StringBuilder();
        thirdPart.append("#");
        for (int k = 0; k < m - 1; k++) {
            thirdPart.append(".");
        }
        patterns.add(thirdPart.toString());
        return patterns;
    }
}