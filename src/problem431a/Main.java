package src.problem431a;
//https://codeforces.com/problemset/problem/431/A
//~25:00 - time of solution

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            list.add(scanner.nextInt());
        }
        scanner.nextLine();
        String game = scanner.nextLine();
        System.out.println(solve(list, game));
    }

    public static int solve(List<Integer> list, String game) {
        int result = 0;
        Set<Integer> set = new HashSet<>(list);
        if (set.size() == 1 && set.contains(0)) return result;
        for (int i = 0; i < game.length(); i++) {
            result += list.get(Integer.parseInt(game.charAt(i) + "") - 1);
        }
        return result;
    }
}