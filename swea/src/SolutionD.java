import java.util.*;

class Solution {
    public int solution(int coin, int[] cards) {
        int n = cards.length;

        List<Integer> owned = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n / 3; i++) {
            owned.add(cards[i]);
        }

        for (int i = n / 3; i < n; i++) {
            queue.offer(cards[i]);
        }

        int round = 1;

        while (!queue.isEmpty() && !owned.isEmpty()) {
            int card1 = queue.poll();
            int card2 = queue.poll();

            List<Integer> temp = new LinkedList<>(owned);

            if (card1 + card2 <= n + 1 && coin >= 2) {
                owned.add(card1);
                owned.add(card2);
                coin -= 2;
            } else {
                for (int c : temp) {
                    if (c + card1 == n + 1 && coin > 0) {
                        owned.add(card1);
                        coin--;
                    } else if (c + card2 == n + 1 && coin > 0) {
                        owned.add(card2);
                        coin--;
                    }
                }
            }

            int min = n + 1;

            for (int i = 0; i < owned.size() - 1; i++) {
                for (int j = i + 1; j < owned.size(); j++) {
                    if (owned.get(i) + owned.get(j) == n + 1) {
                        min = Math.min(owned.get(i), min);
                    }
                }
            }

            if (min < n + 1) {
                owned.remove(Integer.valueOf(min));
                owned.remove(Integer.valueOf(n + 1 - min));
                round++;
            } else {
                break;
            }
        }

        return round;
    }
}