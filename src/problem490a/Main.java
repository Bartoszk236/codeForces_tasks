package src.problem490a;
//https://codeforces.com/problemset/problem/490/A
//44:38 - time of solution

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, scanner.nextInt());
        }
        printIndex(solve(map));
    }

    public static List<List<Integer>> solve(HashMap<Integer, Integer> map) {
        int one = 0, two = 0, three = 0;
        List<Integer> countOfTeams = new ArrayList<>();
        List<Integer> oneListIndex = new ArrayList<>();
        List<Integer> twoListIndex = new ArrayList<>();
        List<Integer> threeListIndex = new ArrayList<>();
        for (int i = 1; i <= map.size(); i++) {
            if (map.containsKey(i)) {
                int value = map.get(i);
                if (value == 1) {
                    one++;
                    oneListIndex.add(i);
                }
                if (value == 2) {
                    two++;
                    twoListIndex.add(i);
                }
                if (value == 3) {
                    three++;
                    threeListIndex.add(i);
                }
            }
        }
        countOfTeams.add(Math.min(one, Math.min(two, three)));
        return new ArrayList<>(Arrays.asList(oneListIndex, twoListIndex, threeListIndex, countOfTeams));
    }

    public static void printIndex(List<List<Integer>> lists) {
        int min = lists.get(3).getFirst();
        System.out.println(min);
        for (int i = 0; i < min; i++) {
            System.out.print(lists.get(0).get(i) + " ");
            System.out.print(lists.get(1).get(i) + " ");
            System.out.print(lists.get(2).get(i) + "\n");
        }
    }
}