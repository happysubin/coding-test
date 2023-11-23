package inflearn.dfsandbfs;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Question01 {

    static boolean[] visited;
    static int[] arr;
    static HashMap<Integer, Integer> map = new HashMap<>();

    static int num;

    static void dfs(int idx, int cnt) {
        List<Integer> list = new ArrayList<>();
        if(cnt == num ) {
            int sum = 0;
            for (int i = 0; i < num; i++) {
                if(visited[i]) {
                    sum += arr[i];
                    list.add(arr[i]);
                }
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            System.out.println("list = " + list);
            return;
        }

        visited[idx] = true;
        dfs(idx + 1, cnt + 1);
        visited[idx] = false;
        dfs(idx + 1, cnt + 1);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        num = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");

        arr = new int[num];
        visited = new boolean[num];

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }


        dfs(0, 0);


        System.out.println("map = " + map);
        for (Integer key : map.keySet()) {
            if(map.get(key) > 1) {
                bw.write("YES");
                bw.flush();
                return;
            }
        }

        bw.write("NO");
        bw.flush();
    }
}
