package src.problem1352a;
//https://codeforces.com/problemset/problem/1352/A
//53:30 - time of solution

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            List<Integer> results = solve(n);
            int resultSize = results.size();
            System.out.println(resultSize);
            for (int j = 0; j < resultSize; j++) {
                System.out.print(results.get(j) + " ");
            }
            System.out.print("\n");
        }
    }

    public static List<Integer> solve(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        List<Integer> res = new ArrayList<>();
        int pow = 0;
        for (int i = chars.length - 1 ; i >= 0; i--) {
            String s = String.valueOf(chars[i]);
            BigInteger integer = new BigInteger(s);
            BigInteger result = integer.multiply(BigInteger.valueOf(10).pow(pow));
            if (!result.equals(BigInteger.ZERO)) res.add(result.intValue());
            pow++;
        }
        return res;
    }
}