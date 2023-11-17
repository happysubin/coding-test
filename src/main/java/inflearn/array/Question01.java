package inflearn.array;

import java.io.*;

public class Question01 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        bw.write(arr[0] + " ");
        for (int i = 1; i < num; i++) {
            if(Integer.parseInt(arr[i - 1]) < Integer.parseInt(arr[i])) {
                bw.write(arr[i] + " ");
            }
        }

        bw.flush();

    }
}
