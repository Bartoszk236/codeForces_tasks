package src.problem791a;
//https://codeforces.com/problemset/problem/791/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int count = 0;
        while (true){
            a = a * 3;
            b = b * 2;
            count++;
            if (a > b) break;
        }
        System.out.println(count);
    }
}