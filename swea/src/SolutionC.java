import java.sql.SQLOutput;
import java.util.*;

class Solution {
    private static boolean[] visited;

    public int[] solution(int[][] dice) {
        int[] answer = {};
        int N = dice.length;
        visited = new boolean[N];

        List<int[]> ADiceList = new ArrayList<>();
        List<int[]> BDiceList = new ArrayList<>();

        for (int i = 0; i < N - 1; i++) {
            int[] pick = new int[n]
            for (int j = i + 1; j < N; j++) {
                List<Integer> ADice = new ArrayList<>();
                ADice.add(i);
                ADice.add(j);
                ADiceList.add(ADice);
            }
        }

        System.out.println(ADiceList.size());

        for (List<Integer> ADice : ADiceList) {
            for (int a : ADice) {
                System.out.print(a + " ");
            }
            System.out.println();
        }

//        for (List<Integer> ADice : ADiceList) {
//            List<Integer> BDice = new ArrayList<>();
//
//            for (int b = 0; b < N; b++) {
//                if (!ADice.contains(b)) {
//                    BDice.add(b);
//                }
//            }
//
//            BDiceList.add(BDice);
//        }
//
//        int[][] result = new int[6][6];
//
//        for (int i = 0; i < ADiceList.size(); i++) {
//            List<Integer> ADice = ADiceList.get(i);
//            List<Integer> BDice = BDiceList.get(i);
//
//            for (int j = 0; j < ADice.size(); j++) {
//                int[] a = dice[ADice.get(j)];
//                int[] b = dice[BDice.get(j)];
//
////                System.out.println(Arrays.toString(a));
////                System.out.println(Arrays.toString(b));
//
//                for (int r = 0; r < 6; r++) {
//                    for (int c = 0; c < 6; c++) {
//                        if (a[r] > b[c]) {
//                            result[r][c] += 1;
//                        }
//                    }
//                }
//            }
//        }

//        for (int[] r : result) {
//            System.out.println(Arrays.toString(r));
//        }

        return answer;
    }
}
