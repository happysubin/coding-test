
package inflearn.array;

import java.util.*;

public class Question12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int studentCount = sc.nextInt();
        int testCount = sc.nextInt();

        int[][] arr = new int[testCount][studentCount];

        for (int i = 0; i < testCount; i++) {
            for (int j = 0; j < studentCount; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        Map<Integer, Set<Integer>> map = new HashMap<>();

        for (int i = 1; i <= studentCount; i++) {
            map.put(i, new HashSet<>());
            for (int j = 1; j <= studentCount; j++) {
                if(i != j) {
                    Set<Integer> set = map.get(i);
                    set.add(j);
                }
            }
        }

        for (int i = 0; i < testCount; i++) {
            for (int j = studentCount - 1; j >= 0; j--) {
                int standard = arr[i][j]; //1등 부터
                for (int k = j; k >= 0; k--) {
                    int compare = arr[i][k]; //비교할 사람들
                    Set<Integer> set = map.get(standard);
                    set.remove(compare);
                }
            }
        }

        int cnt = 0;
        for (Integer key : map.keySet()) {
            Set<Integer> set = map.get(key);
            cnt += set.size();
        }
        System.out.println(cnt);
    }
}
