package inflearn.stackandqueue;

import java.io.*;
import java.util.Stack;

public class Question02 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split("");

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            String now = arr[i];
            if(!now.equals(")")) {
                stack.push(now);
            }
            else {
                while (!stack.pop().equals("("));
//                while(!stack.peek().equals("(")) {
//                    stack.pop();
//                }
//                stack.pop();
            }
        }

        StringBuffer sf = new StringBuffer();
        while(!stack.isEmpty()) {
            sf.append(stack.pop());
        }

        bw.write(sf.reverse().toString());
        bw.flush();
    }
}
