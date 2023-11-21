package inflearn.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question03 {

    static int factorial(int n) {
        if(n == 1) return 1;
        else {
            return n * factorial(n - 1) ;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int result = factorial(num);
        System.out.println("factorial = " + result);
    }
}
