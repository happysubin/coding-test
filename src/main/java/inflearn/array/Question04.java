package inflearn.array;

import java.io.*;

public class Question04 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int[] answer = new int[num];

        for (int i = 0; i < num; i++) {
            if(i == 0 | i == 1) {
                answer[i] = 1;
            }
            else {
                answer[i] = answer[i - 2] + answer[i - 1];
            }
        }

        for (int i : answer) {
            bw.write(i + " ");
        }


        bw.flush();
    }
}
