import java.util.*;

class Solution1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < N; i++) {
                pq.offer(sc.nextInt());
            }

            Deque<Integer> stack = new ArrayDeque<>();
            int sum = 0;

            while (!pq.isEmpty()) {
                int cur = pq.poll();

                if (stack.isEmpty() || stack.getLast() == cur) {
                    stack.offerLast(cur);
                } else {
                    sum += stack.pollLast();
                }
            }

            while (!stack.isEmpty()) {
                sum += stack.pollLast();
            }

            System.out.println("#" + t + " " + sum);
        }
    }
}