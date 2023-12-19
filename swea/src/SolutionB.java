import java.util.*;

class Solution {
    public int[] solution(int[][] edges) {
        int[] answer = {};
        Map<Integer, Set<Integer>> outgoing = new HashMap<>();
        Map<Integer, Set<Integer>> incoming = new HashMap<>();

        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];

            if (!outgoing.containsKey(a)) {
                outgoing.put(a, new HashSet<>());
            }

            if (!incoming.containsKey(b)) {
                incoming.put(b, new HashSet<>());
            }

            outgoing.get(a).add(b);
            incoming.get(b).add(a);
        }


        return answer;
    }
}