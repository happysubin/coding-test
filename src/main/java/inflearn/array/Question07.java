package inflearn.array;

import java.io.*;

public class Question07 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        int score = 0;
        int result = 0;

        for (int i = 0; i < num; i++) {
            if(arr[i].equals("1")) {
                score++;
                result += score;
            }
            else {
                score = 0;
            }
        }

        bw.write(result + "");
        bw.flush();
    }
}
