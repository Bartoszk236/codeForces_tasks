package src.problem723a;
//https://codeforces.com/problemset/problem/723/A
//16:03 - time of solution

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        List<Integer> list = Arrays.asList(x, y, z);
        list.sort(Integer::compareTo);
        int center = list.get(1);
        int sum = Math.abs(x - center) + Math.abs(y - center) + Math.abs(z - center);
        System.out.println(sum);
    }
}