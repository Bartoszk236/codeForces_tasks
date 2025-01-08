package src.problem381a;
//https://codeforces.com/problemset/problem/381/A
//9:21 - time of solution

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cardNumberOnTable = scanner.nextInt();
        List<Integer> listOfCards = new ArrayList<>();
        for (int i = 0; i < cardNumberOnTable; i++) {
            listOfCards.add(scanner.nextInt());
        }
        int scoreOfSereja = 0;
        int scoreOfDima = 0;
        for (int i = 0; i < cardNumberOnTable; i++) {
            int max = Math.max(listOfCards.getFirst(), listOfCards.getLast());
            int index = checkIndex(listOfCards, max);
            if (i % 2 == 0) {
                scoreOfSereja += max;
            } else {
                scoreOfDima += max;
            }
            listOfCards.remove(index);
        }
        System.out.println(scoreOfSereja + " " + scoreOfDima);
    }

    public static int checkIndex(List<Integer> list, int max) {
        if (list.getFirst() == max) {
            return 0;
        } else {
            return list.size() - 1;
        }
    }
}