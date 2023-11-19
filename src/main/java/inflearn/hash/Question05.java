package inflearn.hash;

import java.io.*;
import java.util.*;

public class Question05 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] temp = br.readLine().split(" ");

        int total = Integer.parseInt(temp[0]);
        int idx = Integer.parseInt(temp[1]);

        String[] temp2 = br.readLine().split(" ");

        int[] arr = new int[temp2.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(temp2[i]);
        }

        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                for (int k = j + 1; k < total; k++) {
                    int num = arr[i] + arr[j] + arr[k];
                    set.add(num);
                }
            }
        }

        int cnt = 0;
        for(int i: set){
            cnt++;
            if(cnt == idx) {
                bw.write(i + "");
                bw.flush();
                return;
            };
        }

        bw.write("-1");
        bw.flush();
    }
}
