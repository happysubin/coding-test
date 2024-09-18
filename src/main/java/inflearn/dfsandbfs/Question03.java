package inflearn.dfsandbfs;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Question03 {

    static int num;
    static int limitTime;
    static int max;
    static List<Problem> problems = new ArrayList<>();

    static class Problem {
        int score;
        int time;

        public Problem(int score, int time) {
            this.score = score;
            this.time = time;
        }
    }

    static void dfs(int cnt, int idx, int sum, int time) {
        if(cnt == num) {
            if(time <= limitTime) {
                max = Math.max(sum, max);
            }
            return;
        }

        dfs(cnt + 1, idx + 1, sum + problems.get(idx).score, time + problems.get(idx).time);
        dfs(cnt + 1, idx + 1, sum, time);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String temp = br.readLine();

        StringTokenizer st = new StringTokenizer(temp, " ");
        num = Integer.parseInt(st.nextToken());
        limitTime = Integer.parseInt(st.nextToken());


        for (int i = 0; i < num; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine(), " ");
            int score = Integer.parseInt(token.nextToken());
            int time = Integer.parseInt(token.nextToken());
            problems.add(new Problem(score, time));
        }

        dfs(0, 0, 0, 0);

        bw.write(max + " ");
        bw.flush();
    }
}
