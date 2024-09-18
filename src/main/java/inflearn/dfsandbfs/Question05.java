package inflearn.dfsandbfs;

import java.io.*;
import java.util.*;

public class Question05 {

    static int num;
    static int[] move;

    static class Situation {
        int cnt;
        int nowPrice;

        public Situation(int cnt, int nowPrice) {
            this.cnt = cnt;
            this.nowPrice = nowPrice;
        }
    }

    static void bfs(int total) {
        Queue<Situation> queue = new LinkedList<>();

        queue.offer(new Situation(0, total));
        while(!queue.isEmpty()) {
            Situation poll = queue.poll();
            if(poll.nowPrice == 0) {
                System.out.println(poll.cnt);
                return;
            }
            for (int i = 0; i < move.length; i++) {
                queue.offer(new Situation(poll.cnt + 1, poll.nowPrice - move[i]));
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        num = Integer.parseInt(br.readLine());
        move = new int[num];

        String temp = br.readLine();
        StringTokenizer st = new StringTokenizer(temp, " ");

        for (int i = 0; i < num; i++) {
            int n = Integer.parseInt(st.nextToken());
            move[i] = n;
        }

        int total = Integer.parseInt(br.readLine());

        bfs(total);

        bw.flush();
    }
}
