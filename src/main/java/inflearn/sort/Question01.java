package inflearn.sort;

import java.io.*;

public class Question01 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] temp = br.readLine().split(" ");
        int[] arr = new int[temp.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[min] > arr[j]) {
                    min = arr[j];
                }
            }

            if(min != i) {
                int t = arr[i];
                arr[i] = arr[min];
                arr[min] = t;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + "");
        }
        bw.flush();
    }
}
