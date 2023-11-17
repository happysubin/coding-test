
package inflearn.array;

import java.util.*;

public class Question11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[][] arr = new int[num][5];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        Map<Integer, List<Integer>> check = new HashMap<>();

        for (int i = 0; i < num; i++) {
            check.put(i, new ArrayList());
        }

        for (int i = 0; i < 5; i++) { //1학년부터 5학년까지
            for (int j = 0; j < num; j++) {
                int nowStudent = arr[j][i]; //현재 기준 학생
                for (int k = 0; k < num; k++) { //비교할 학생
                    if(nowStudent == arr[k][i]) { //같은 반이였다.
                        List<Integer> list = check.get(j); // 여러번 같은 반인지 중복 체크
                        if(!list.contains(k)) {
                            list.add(k);
                        }
                    }
                }
            }
        }
        int max = 0;
        int result = 0;
        for (Integer key : check.keySet()) {
            List<Integer> list = check.get(key);
            if(list.size() > max) {
                max = Math.max(list.size(), max);
                result = key + 1;
            }
        }

        System.out.println(result);
    }
}
