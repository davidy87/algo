import java.io.FileInputStream;
import java.util.*;

public class Solution2 {
    public static void main(String[] args) throws Exception {
        (new FileInputStream("./src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            Set<Integer> set = new HashSet<>();

            for (int i = 0; i < N; i++) {
                set.add(sc.nextInt());
            }

            System.out.println("#" + t + " " + (set.size() - 2));
        }
    }
}
