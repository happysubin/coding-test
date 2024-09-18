package inflearn.twopointers;

import java.io.*;

public class Question05 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int result = 0;
        int cnt = 0;

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = i;
        }

        int lt = 0;
        int rt = 0;
        for (; rt < num; rt++) {
            result += arr[rt];
            if (result == num) cnt++;
            while (result > num) {
                result -= arr[lt++];
                if (result == num) cnt++;
            }
        }

        bw.write(cnt + "");
        bw.flush();
    }
}
