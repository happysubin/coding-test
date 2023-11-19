package inflearn.hash;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Question01 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        Integer num = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split("");

        Map<String, Integer> map = new HashMap<>();

        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int max = 0;
        String result = null;
        for (String s : map.keySet()) {
            if(max < map.get(s)) {
                max = map.get(s);
                result = s;
            }
        }

        bw.write(result);
        bw.flush();
    }
}
