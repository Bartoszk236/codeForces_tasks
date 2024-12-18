package src.problem200b;
//https://codeforces.com/problemset/problem/200/B

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();
        }
        BigDecimal result = new BigDecimal(sum);
        System.out.println(result.divide(new BigDecimal(n), 5, RoundingMode.CEILING));
    }
}