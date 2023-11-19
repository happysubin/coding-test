package inflearn.hash;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Question02 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] chars1 = br.readLine().toCharArray();
        char[] chars2 = br.readLine().toCharArray();

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (Character c : chars1) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (Character c : chars2) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }


        for (Character c : chars1) {
            if(map1.get(c) != map2.get(c)) {
                bw.write("NO");
                bw.flush();
                return;
            }
        }


        bw.write("YES");
        bw.flush();
    }
}
