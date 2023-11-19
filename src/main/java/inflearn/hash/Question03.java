package inflearn.hash;

import java.io.*;
import java.util.*;

public class Question03 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] temp = br.readLine().split(" ");
        int total = Integer.parseInt(temp[0]);
        int size = Integer.parseInt(temp[1]);

        String[] arr = br.readLine().split(" ");

        Map<String, Integer> map = new HashMap<>();


        for (int i = 0; i < size; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        int rt = size;

        bw.write(map.size() + " ");

        for (; rt < total; rt++) {
            //삭제
            if(map.get(arr[lt]) >= 2) {
                map.put(arr[lt], map.get(arr[lt]) -1);
            }
            else {
                map.remove(arr[lt]);
            }

            lt++;

            //추가
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);

            bw.write(map.size() + " ");
        }

        bw.flush();
    }
}
