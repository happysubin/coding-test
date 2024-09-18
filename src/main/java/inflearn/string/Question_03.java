package inflearn.string;

import java.io.*;

public class Question_03 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int max = arr[0].length();
        String result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i].length()) {
                max = arr[i].length();
                result = arr[i];
            }
        }

        bw.write(result);
        bw.flush();

    }
}
