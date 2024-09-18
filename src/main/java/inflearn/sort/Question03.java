package inflearn.sort;

import java.io.*;

public class Question03 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] temp = br.readLine().split(" ");
        int[] arr = new int[temp.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }

        for (int i = 1; i < arr.length; i++) {
            int target = arr[i];

            int j = i - 1;
            while(j >= 0 & target < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = target;
        }

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + " ");
        }
        bw.flush();
    }
}
