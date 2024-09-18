package inflearn.sort;

import java.io.*;
import java.util.Arrays;

public class Question09 {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] temp = br.readLine().split(" ");

        int total = Integer.parseInt(temp[0]);
        int goal = Integer.parseInt(temp[1]);

        String[] temp2 = br.readLine().split(" ");

        int[] arr = new int[total];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(temp2[i]);
        }


        Arrays.sort(arr);

        int lt = arr[arr.length - 1];
        int rt = 0;
        int answer = 0;
        for (int i : arr) {
            rt += i;
        }

        while(lt <= rt) {
            int mid = (lt + rt) / 2;
            if(count(arr, mid) <= goal) {
                answer =  mid;
                rt = mid - 1;
            }
            else {
                lt = mid + 1;
            }
        }

        bw.write(answer + "");
        bw.flush();
    }

    private static int count(int[] arr, int capacity) {
        int cnt = 1, sum = 0;
        for (int x: arr){
            if(sum + x > capacity){
                cnt++;
                sum = x;
            }
            else sum += x;
        }

        return cnt;
    }
}
