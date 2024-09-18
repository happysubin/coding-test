package inflearn.stackandqueue;

import java.io.*;
import java.util.Stack;

public class Question04 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split("");
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            String now = arr[i];
            if(arr[i].equals("+")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num1 + num2);
            }
            else if(now.equals("-")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 - num1);
            }
            else if(now.equals("*")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num1 * num2);
            }
            else if(now.equals("/")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num1 / num2);
            }
            else {
                stack.push(Integer.parseInt(now));
            }

        }

        bw.write(stack.pop() + "");
        bw.flush();
    }
}
