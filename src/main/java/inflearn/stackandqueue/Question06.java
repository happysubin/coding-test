package inflearn.stackandqueue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Question06 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] temp = br.readLine().split(" ");

        int total = Integer.parseInt(temp[0]);
        int index = Integer.parseInt(temp[1]);

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= total ; i++) {
            queue.offer(i);
        }

        int cnt = 1;

        while(queue.size() != 1) {
            if(cnt == index) {
                queue.poll();
                cnt = 1;
            }
            else {
                Integer poll = queue.poll();
                queue.offer(poll);
                cnt++;
            }
        }

        bw.write(queue.poll() + "");
        bw.flush();
    }
}
