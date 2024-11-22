package src.problem282a;
//https://codeforces.com/problemset/problem/282/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!(scanner.hasNextInt())) throw new RuntimeException("You must enter an integer");
        int n = scanner.nextInt();
        if (n > 150 || n < 1) throw new RuntimeException("You must enter a number from 1 to 150");
        int x = 0;
        for (int i = 0; i < n; i++) {
            String in = scanner.next();
            if (in.equals("++") || in.equals("X++") || in.equals("++X") || in.equals("+X+")) x++;
            if (in.equals("--") || in.equals("--X") || in.equals("X--") || in.equals("-X-")) x--;
        }
        System.out.println(x);
    }
}