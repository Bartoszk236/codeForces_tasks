package src.problem4a;
//https://codeforces.com/problemset/problem/4/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!(scanner.hasNextInt())) throw new RuntimeException("You must enter an integer");
        int number = scanner.nextInt();
        if (number > 100 || number < 1) throw new RuntimeException("You must enter a number from 1 to 100");
        if (number % 2 == 0 && !(number == 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}