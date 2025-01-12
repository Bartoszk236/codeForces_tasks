package src.problem472a;
//https://codeforces.com/problemset/problem/472/A
//16:34 - time of solution

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        solve(n).forEach(System.out::println);
    }

    public static List<Integer> solve(int n) {
        int a = 0;
        int b = 0;
        if (n % 2 == 0) {
            a = n / 2;
            b = a;
        } else {
            a = (n - 1) / 2;
            b = a + 1;
        }
        while (isPrime(a) || isPrime(b)) {
            a++;
            b--;
        }
        return new ArrayList<>(Arrays.asList(a, b));
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
