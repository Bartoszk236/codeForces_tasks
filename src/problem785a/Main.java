package src.problem785a;
//https://codeforces.com/problemset/problem/785/A
//5:53 - time of solution

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Tetrahedron", 4);
        map.put("Cube", 6);
        map.put("Octahedron", 8);
        map.put("Dodecahedron", 12);
        map.put("Icosahedron", 20);
        int n = scanner.nextInt();
        scanner.nextLine();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            count += map.get(line);
        }
        System.out.println(count);
    }
}