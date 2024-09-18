package inflearn.stackandqueue;

import java.io.*;
import java.util.Stack;

public class Question05 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split("");
        Stack<String> stack = new Stack<>();


        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            String now = arr[i];
            if(now.equals("(")) {
                stack.push(now);
            }
            else {
                stack.pop();
                if(arr[i - 1].equals("(")){
                    answer += stack.size();

                }
                else {
                    answer++;
                }
            }
        }

        bw.write(answer+ "\n");
        bw.flush();
    }
}
