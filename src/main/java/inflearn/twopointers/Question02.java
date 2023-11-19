package inflearn.twopointers;

import java.io.*;

public class Question02 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] temp = br.readLine().split(" ");
        int total = Integer.parseInt(temp[0]);
        int size = Integer.parseInt(temp[1]);

        String[] tempArr = br.readLine().split(" ");
        int[] arr = new int[total];

        for (int i = 0; i < total; i++) {
            arr[i] = Integer.parseInt(tempArr[i]);
        }

        int result = 0;
        int max = 0;
        for (int i = 0; i < size; i++) {
            result += arr[i];
        };

        max = result;

        for (int i = 0; i < total - size; i++) {
            int sum = result - arr[i] + arr[i + size];
            max = Math.max(sum, max);
            result = sum;
        }

        bw.write(max + "");
        bw.flush();
    }
}
