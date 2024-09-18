package inflearn.dfsandbfs;

import java.io.*;

import java.util.StringTokenizer;

public class Question02 {

    static int limit = 0;
    static int num = 0;
    static int[] arr;
    static int max = 0;

    static void dfs(int cnt, int idx, int sum) {
        if(cnt == num) {
            if(sum < limit){
                max = Math.max(sum, max);
            }
            return;
        }
        dfs(cnt + 1, idx + 1, sum + arr[idx]);
        dfs(cnt + 1, idx + 1, sum);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringTokenizer tokenizer = new StringTokenizer(str, " ");

        limit = Integer.parseInt(tokenizer.nextToken());
        num = Integer.parseInt(tokenizer.nextToken());
        arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dfs(0, 0, 0);

        System.out.println(max);
        bw.flush();
    }
}
