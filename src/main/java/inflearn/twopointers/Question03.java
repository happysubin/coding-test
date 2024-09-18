package inflearn.twopointers;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question03 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num1 = Integer.parseInt(br.readLine());
        String[] strArr1 = br.readLine().split(" ");
        int[] arr1 = new int[num1];
        for (int i = 0; i < strArr1.length; i++) {
            arr1[i] = Integer.parseInt(strArr1[i]);
        }

        int num2 = Integer.parseInt(br.readLine());
        String[] strArr2 = br.readLine().split(" ");
        int[] arr2 = new int[num2];
        for (int i = 0; i < strArr2.length; i++) {
            arr2[i] = Integer.parseInt(strArr2[i]);
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int lt = 0;
        int rt = 0;

        List<Integer> result = new ArrayList<>();

        while(lt < num1 & rt < num2) {

            if(arr1[lt] < arr2[rt]) {
                lt++;
            }
            else if(arr1[lt] > arr2[rt]) {
                rt++;
            }

            else {
                result.add(arr1[lt]);
                lt++;
                rt++;
            }
        }

        for (Integer integer : result) {
            bw.write(integer + " ");
        }

        bw.flush();
    }
}
