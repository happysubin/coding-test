package inflearn.string;

import java.io.*;

public class Question_10 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String[] arr = br.readLine().split(" ");

        String[] words = arr[0].split("");
        String word = arr[1];

        int[] result = new int[words.length];

        Integer distance = 1000; //문자열 길이는 100을 넘지 않음.

        for (int i = 0; i < words.length; i++) {
            if(words[i].equals(word)) {
                distance = 0;
            }
            else {
                distance++;
            }
            result[i] =  distance;
        }

        distance = 1000; //문자열 길이는 100을 넘지 않음.


        for (int i = words.length - 1; i >= 0; i--) {

            if(words[i].equals(word)) {
                distance = 0;
            }

            else {
                distance++;
            }

            if (result[i] > distance) {
                result[i] = distance;
            }

        }


        for (int i : result) {
            System.out.print(i + " ");
        }

        bw.flush();
    }
}
