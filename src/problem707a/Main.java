package src.problem707a;
//https://codeforces.com/problemset/problem/707/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] matrix = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.next().charAt(0);
            }
        }
        System.out.println(solve(matrix));
    }

    public static String solve(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 'C' || matrix[i][j] == 'M' || matrix[i][j] == 'Y') return "#Color";
            }
        }
        return "#Black&White";
    }
}
