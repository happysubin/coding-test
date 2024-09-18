package inflearn.sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question08 {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] temp = br.readLine().split(" ");

        int num = Integer.parseInt(temp[0]);
        int goal = Integer.parseInt(temp[1]);

        String[] temp2 = br.readLine().split(" ");
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(temp2[i]);
        }

        Arrays.sort(arr);

        int lt = 0;
        int rt = num - 1;
        int mid = 0;
        while(lt <= rt) {
            mid = (lt + rt) / 2;
            if(goal == arr[mid]) {
                bw.write(mid + 1 + " ");
                break;
            }
            else if(goal > arr[mid]) {
                lt = mid + 1;
            }
            else {
                rt = mid - 1;
            }
        }

        bw.flush();
    }
}
