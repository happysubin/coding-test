package inflearn.recursive;

import java.io.*;

public class Question01 {

    static void recursive(int n) {
        if(n == 0 ) return;
        else {
            recursive(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        recursive(num);
    }
}
