package inflearn.sort;

import java.io.*;
import java.util.Arrays;

public class Question06 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");
        int[] arr = new int[num];
        int[] arr2 = new int [num];


        for (int i = 0; i < num; i++) {
            int e = Integer.parseInt(temp[i]);
            arr[i] = e;
            arr2[i] = e;
        }

        Arrays.sort(arr);

        for (int i = 0; i < num; i++) {
            if(arr[i] != arr2[i]) {
                bw.write(i + 1 + " ");
            }
        }
        bw.flush();
    }
}
