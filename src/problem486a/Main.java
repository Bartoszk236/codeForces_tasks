package src.problem486a;
//https://codeforces.com/problemset/problem/486/A

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = new BigInteger(scanner.nextLine());
        BigInteger result;

        if (n.remainder(new BigInteger("2")).equals(BigInteger.ZERO)) {
            result = n.divide(new BigInteger("2"));
        } else {
            result = n.divide(new BigInteger("2")).multiply(new BigInteger("-1"))
                    .subtract(new BigInteger("1"));

        }
        System.out.println(result);
    }
}