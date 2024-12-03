package src.problem263a;
//https://codeforces.com/problemset/problem/263/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] matrix = new int[5][5];
        int oneRow = 0, oneColumn = 0, centralRow = 2, centralColumn = 2, countOfOne = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (!(in.hasNextInt())) throw new IllegalArgumentException("You must enter a integer");
                int input = in.nextInt();
                if (!(input == 0 || input == 1)) throw new IllegalArgumentException("You must enter a 0 or 1");
                matrix[i][j] = input;
                if (matrix[i][j] == 1) {
                    countOfOne++;
                    oneRow = i;
                    oneColumn = j;
                }
                if (countOfOne > 1) throw new IllegalArgumentException("You must insert only once number one");
            }
        }

        int moves = Math.abs(centralRow - oneRow) + Math.abs(centralColumn - oneColumn);
        System.out.println(moves);
    }
}