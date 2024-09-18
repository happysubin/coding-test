package inflearn.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question02 {

    static void recursive(int n) {
        if(n == 0) return;
        else {
            recursive(n / 2);
            System.out.print(n%2 + "");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        recursive(num);
    }
}
