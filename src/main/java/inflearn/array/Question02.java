package inflearn.array;

import java.io.*;

public class Question02 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        int max = Integer.parseInt(arr[0]);
        int cnt = 1;

        for (int i = 1; i < num; i++) {
            if(max < Integer.parseInt(arr[i])) {
                max = Integer.parseInt(arr[i]);
                cnt++;
            }
        }

        bw.write(cnt + "");
        bw.flush();

    }
}
