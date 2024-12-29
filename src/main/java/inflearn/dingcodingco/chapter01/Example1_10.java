package inflearn.dingcodingco.chapter01;

import java.util.*;

public class Example1_10 {

    static void solution(String str) {

        String[] arr = str.split("");
        Map<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        List<String> list = new ArrayList(map.keySet());
        Collections.sort(list);

        for (String s : list) {
            Integer i = map.get(s);
            if(i == 1) {
                System.out.println("s = " + s);
                break;
            }
        }

    }

    public static void main(String[] args) {

        var str = "ababcde";
        solution(str);
    }
}
