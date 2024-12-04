package src.problem546a;
//https://codeforces.com/problemset/problem/546/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstPrice, dollarsHeHas, numberBananaHeWant, totalCost = 0, rent = 0;

        firstPrice = in.nextInt();
        dollarsHeHas = in.nextInt();
        numberBananaHeWant = in.nextInt();

        for (int i = 1; i <= numberBananaHeWant; i++) {
            totalCost = totalCost + (firstPrice * i);
        }
        if (totalCost > dollarsHeHas) rent = dollarsHeHas - totalCost;
        System.out.println(Math.abs(rent));
    }
}