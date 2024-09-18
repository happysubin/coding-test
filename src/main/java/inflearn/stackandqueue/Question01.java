package inflearn.stackandqueue;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Question01 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split("");

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            String now = arr[i];
            if(now.equals("(")) stack.push(now);
            else {
                if(stack.isEmpty()) {
                    bw.write("NO");
                    bw.flush();
                    return;
                }
                else stack.pop();
            }
        }
        if(!stack.isEmpty()) {
            bw.write("NO");
        }
        else {
            bw.write("YES");
        }

        bw.flush();
    }
}
