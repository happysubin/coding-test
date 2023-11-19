package inflearn.hash;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Question04 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] total = br.readLine().split("");
        String[] unit = br.readLine().split("");

        Map<String, Integer> totalMap = new HashMap<>();
        Map<String, Integer> unitMap = new HashMap<>();

        int cnt = 0;

        for (String s : unit) {
            unitMap.put(s, unitMap.getOrDefault(s, 0) + 1);
        }

        for (int i = 0; i < unit.length; i++) {
            totalMap.put(total[i], totalMap.getOrDefault(total[i], 0) + 1);
        }


        cnt = compare(totalMap, unitMap, cnt);

        int rt = unit.length;
        int lt = 0;

        for (; rt < total.length; rt++) {

            if(totalMap.get(total[lt]) > 1) {
                totalMap.put(total[lt], totalMap.get(total[lt]) - 1);
            }

            else {
                totalMap.remove(total[lt]);
            }

            lt++;
            totalMap.put(total[rt], totalMap.getOrDefault(total[rt], 0) + 1);

            cnt = compare(totalMap, unitMap, cnt);
        }


        bw.write(cnt + "");

        bw.flush();
    }

    private static int compare(Map<String, Integer> totalMap, Map<String, Integer> unitMap, int cnt) {
        boolean flag = true;
        for (String s : unitMap.keySet()) {
            if(!unitMap.get(s).equals(totalMap.get(s))) {
                flag = false;
            }
        }

        if(flag) {
            cnt++;
        }
        return cnt;
    }
}
