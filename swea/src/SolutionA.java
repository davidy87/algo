import java.util.*;

class SolutionA {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int N = friends.length;
        int[][] giftRecord = new int[N][N];
        Map<String, Integer> giftScore = new HashMap<>();

        for (String gift : gifts) {
            String[] splited = gift.split(" ");
            String A = splited[0];
            String B = splited[1];

            giftScore.put(A, giftScore.getOrDefault(A, 0) + 1);
            giftScore.put(B, giftScore.getOrDefault(B, 0) - 1);
        }

        for (int i = 0; i < N; i++) {
            for (String gift : gifts) {
                String[] splited = gift.split(" ");
                String A = splited[0];
                String B = splited[1];

                if (friends[i].equals(A)) {
                    for (int j = 0; j < N; j++) {
                        if (friends[j].equals(B)) {
                            giftRecord[i][j] += 1;
                        }
                    }
                }
            }
        }

        int[] numGifts = new int[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (giftRecord[i][j] > giftRecord[j][i]) {
                    numGifts[i] += 1;
                } else if (giftRecord[i][j] == giftRecord[j][i]) {
                    if (giftScore.getOrDefault(friends[i], 0) > giftScore.getOrDefault(friends[j], 0)) {
                        numGifts[i] += 1;
                    }
                }
            }
        }

        Arrays.sort(numGifts);

        return numGifts[N - 1];
    }
}