package baekjoon.recursive;

import java.io.*;
import java.util.StringTokenizer;

public class N과M_2 {

    static boolean[] visited;
    static int[] arr;
    static int num;
    static int total;
    static BufferedWriter bw;

    static void dfs(int idx, int cnt) throws IOException {
        if(num == cnt) {
            for (int i : arr) {
                if(i != 0 ) {
                    bw.write(i + " ");
                }
            }
            bw.write("\n");
            return;
        }

        for (int i = idx; i <= total; i++) {
            arr[cnt] = i;
            dfs(i + 1, cnt + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token = new StringTokenizer(br.readLine(), " ");

        total = Integer.parseInt(token.nextToken());
        num = Integer.parseInt(token.nextToken());
        arr = new int[total];
        visited = new boolean[total];

        dfs(1, 0);

        bw.flush();
    }
}