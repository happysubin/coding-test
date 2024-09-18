package inflearn.twopointers;

import java.io.*;

public class Question01 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num1 = Integer.parseInt(br.readLine());
        String[] arr1 = br.readLine().split(" ");

        int num2 = Integer.parseInt(br.readLine());
        String[] arr2 = br.readLine().split(" ");

        int[] result = new int[num1 + num2];

        int lt = 0;
        int rt = 0;

        int cnt = 0;

        while(lt < num1 & rt < num2) {
            int n1 = Integer.parseInt(arr1[lt]);
            int n2 = Integer.parseInt(arr2[rt]);
            if(n1 <= n2) {
                result[cnt++] = n1;
                lt++;
            }
            else {
                result[cnt++] = n2;
                rt++;
            }
        }

        if(lt < num1) {
            for (int i = lt; i < num1; i++) {
                result[cnt++] = Integer.parseInt(arr1[i]);
            }
        }

        else if (rt < num2) {
            for (int i = rt; i < num2; i++) {
                result[cnt++] = Integer.parseInt(arr2[i]);
            }
        }

        for (int i : result) {
            bw.write(i + " ");
        }
        bw.flush();
    }
}
