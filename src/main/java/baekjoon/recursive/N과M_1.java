package baekjoon.recursive;

import java.io.*;
import java.util.*;


public class N과M_1 {

    static int[] storage;
    static boolean[] visited;
    static BufferedWriter bw;
    static int total;
    static int limit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        total = Integer.parseInt(st.nextToken()); //전체 숫자
        limit = Integer.parseInt(st.nextToken()); //몇 개 출력할지

        storage = new int[limit];
        visited = new boolean[total];

        dfs(0);

        bw.flush();
    }

    static void dfs(int idx) throws IOException {
        if(idx == limit) {
            for (int i = 0; i < limit; i++) {
                bw.write(storage[i] + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = 0; i < total; i++) {
            if(!visited[i]) {
                visited[i] = true;
                storage[idx] = i + 1;
                dfs(idx + 1);
                visited[i] = false;
            }
//            storage[idx] = arr[i];
//            dfs(idx + 1);
//            storage[idx] = 0;
        }
    }
}
