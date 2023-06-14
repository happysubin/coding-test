package inflearn;

import java.io.*;
import java.util.*;

//학급 회장

/**
 * public class HashMapChapter {
 *     public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 *         int num = Integer.parseInt(br.readLine());
 *         String[] arr = br.readLine().split("");
 *         Map<String, Integer> map = new HashMap<>();
 *
 *
 *         for (String s : arr) {
 *             map.put(s, map.getOrDefault(s, 0) + 1);
 *         }
 *
 *
 *         int max = 0 ;
 *         String answer = "";
 *         for (String s : map.keySet()) {
 *             if(max <map.get(s)){
 *                 answer = s;
 *                 max = map.get(s);
 *             }
 *         }
 *
 *         bw.write(answer);
 *         bw.flush();
 *     }
 * }
 */


//아나 그램

/**
 * public class HashMapChapter {
 *     public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 *
 *         String[] arr1 = br.readLine().split("");
 *         Map<String, Integer> map1 = new HashMap<>();
 *
 *         String[] arr2 = br.readLine().split("");
 *         Map<String, Integer> map2 = new HashMap<>();
 *
 *         for (String s : arr1) {
 *             map1.put(s, map1.getOrDefault(s, 0) + 1);
 *         }
 *
 *         for (String s : arr2) {
 *             map2.put(s, map2.getOrDefault(s, 0) + 1);
 *         }
 *
 *         String answer = "YES";
 *         for (String s : map2.keySet()) {
 *             if(map2.get(s) != map1.get(s)) answer = "NO";
 *         }
 *
 *
 *         bw.write(answer);
 *         bw.flush();
 *     }
 * }
 */


//매출액 종류

/**
 * public class HashMapChapter {
 *     public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 *
 *         String[] str = br.readLine().split(" ");
 *         List<Integer> answer = new ArrayList<>();
 *         int len = Integer.parseInt(str[0]);
 *         int window = Integer.parseInt(str[1]);
 *         String[] arr = br.readLine().split(" ");
 *         Map<String, Integer> map = new HashMap<>();
 *
 *
 *         for (int i = 0; i < window; i++) {
 *             map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
 *         }
 *
 *         int lt = 0;
 *         answer.add(map.keySet().size());
 *         for (int i = window; i < arr.length; i++) {
 *             map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
 *             if(map.get(arr[lt]) <= 1){
 *                 map.remove(arr[lt]);
 *             }
 *             else{
 *                 map.put(arr[lt], map.get(arr[lt]) -1 );
 *             }
 *             lt++;
 *             //set.remove(arr[lt++]);
 *             answer.add(map.keySet().size());
 *         }
 *
 *         for (Integer integer : answer) {
 *             bw.write(integer + " ");
 *         }
 *         bw.flush();
 *     }
 * }
 */

//모든 아나그램 찾기

/**
 * public class HashMapChapter {
 *     public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 *
 *         String[] str = br.readLine().split(" ");
 *         List<Integer> answer = new ArrayList<>();
 *         int len = Integer.parseInt(str[0]);
 *         int window = Integer.parseInt(str[1]);
 *         String[] arr = br.readLine().split(" ");
 *         Map<String, Integer> map = new HashMap<>();
 *
 *
 *         for (int i = 0; i < window; i++) {
 *             map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
 *         }
 *
 *         int lt = 0;
 *         answer.add(map.keySet().size());
 *         for (int i = window; i < arr.length; i++) {
 *             map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
 *             if(map.get(arr[lt]) <= 1){
 *                 map.remove(arr[lt]);
 *             }
 *             else{
 *                 map.put(arr[lt], map.get(arr[lt]) -1 );
 *             }
 *             lt++;
 *             //set.remove(arr[lt++]);
 *             answer.add(map.keySet().size());
 *         }
 *
 *         for (Integer integer : answer) {
 *             bw.write(integer + " ");
 *         }
 *         bw.flush();
 *     }
 * }
 */

// K번째 큰 수

public class HashMapChapter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int len = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);

        String[] str = br.readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (String s : str) {
            list.add(Integer.parseInt(s));
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                for (int l = j + 1; l < list.size(); l++) {
                    set.add(list.get(i) + list.get(j) + list.get(l));
                }
            }
        }

        int cnt = 0;
        int answer = -1;
        for (Integer integer : set) {
            cnt ++;
            if(cnt == k){
                answer = integer;
            }
        }

        bw.write(answer + "\n");



        bw.flush();
    }
}
