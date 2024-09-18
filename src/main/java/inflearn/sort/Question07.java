package inflearn.sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question07 {


    static class Position implements Comparable<Position> {

        private int x;
        private int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Position o) {
            if(o.x == this.x) {
                return this.y - o.y;
            }
            else {
                return this.x - o.x;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        List<Position> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String[] arr = br.readLine().split(" ");
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);

            list.add(new Position(x, y));
        }

        Collections.sort(list);


        for (Position p : list) {
            bw.write(p.x + " " + p.y + "\n");
        }

        bw.flush();
    }
}
