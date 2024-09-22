package leetCode.easy;

import java.util.*;

public class HighFive {
    public int[][] highFive(int[][] items) {
        // TreeMap - Sorts by keys in ascending order
        TreeMap<Integer, PriorityQueue<Integer>> studentScores = new TreeMap<>();
        for (int[] item : items) {
            if (!studentScores.containsKey(item[0])) {
                // PriorityQueue - min heap to only track top 5 scores
                studentScores.put(item[0], new PriorityQueue<>());
            }
            PriorityQueue<Integer> scores = studentScores.get(item[0]);
            scores.offer(item[1]);
            if (scores.size() > 5) {
                scores.poll();
            }
            studentScores.put(item[0], scores);
        }
        ArrayList<int[]> resultList = new ArrayList<>();
        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : studentScores.entrySet()) {
            int id = entry.getKey();
            PriorityQueue<Integer> scores = entry.getValue();
            int sum = 0;
            int avg = 0;
            while (!scores.isEmpty()) {
                sum += scores.poll();
            }
            avg = Math.floorDiv(sum, 5);
            resultList.add(new int[] { id, avg });
        }
        // Convert the list to a 2D array and return
        return resultList.toArray(new int[resultList.size()][]);
    }
}
