package inflearn.stackandqueue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Question07 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String[] seq = br.readLine().split("");
        String[] list = br.readLine().split("");

        Queue<String> queue = new LinkedList<>();

        for (int i = 0; i < seq.length; i++) {
            queue.add(seq[i]);
        }

        for (String s : list) {
            if(!queue.isEmpty() && queue.peek().equals(s)) {
                queue.poll();
            }
        }

        if(queue.isEmpty()) bw.write("YES");
        else bw.write("NO");

        bw.flush();
    }
}
