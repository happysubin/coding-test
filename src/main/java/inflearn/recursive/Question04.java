package inflearn.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Question04 {


    static int[] arr;

    static int recursive(int n) {
        if(n == 1) {
            return arr[n] = 1;
        }
        else if(n == 2) {
            return arr[n] = 1;
        }
        else {
            int i = recursive(n - 1) + recursive(n - 2);
            return arr[n] = i;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        arr = new int[num + 1];
        recursive(num);

        for (int i = 1; i <= num; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
