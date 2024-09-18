package inflearn.recursive;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;


public class Question08 {

    static boolean visited[] = new boolean[10001];


    static class Position {
        private int cnt = 0;
        private int position = 0;
        public Position(int cnt, int position) {
            this.cnt = cnt;
            this.position = position;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] temp = br.readLine().split(" ");
        int now = Integer.parseInt(temp[0]);
        int goal = Integer.parseInt(temp[1]);

        Queue<Position> queue = new LinkedList<>();
        queue.offer(new Position(0, now));

        int[] move = {-1, 1, 5};

        while(!queue.isEmpty()) {
            Position poll = queue.poll();
            if(poll.position == goal) {
                bw.write(poll.cnt + "");
                break;
            }
            for (int i = 0; i < move.length; i++) {
                if(poll.position >= 1 && poll.position <= 10001 && !visited[poll.position + move[i]]) {
                    queue.add(new Position(poll.cnt + 1, poll.position + move[i]));
                    visited[poll.position + move[i]] = true;
                }
            }
        }

        bw.flush();
    }
}
