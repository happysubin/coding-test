package inflearn.string;

import java.io.*;

public class Question_05 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] arr = br.readLine().toCharArray();

        int lt = 0;
        int rt =arr.length - 1;

        while(lt < rt) {

            if(Character.isAlphabetic(arr[lt]) & Character.isAlphabetic(arr[rt])) {
                char c = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = c;
                lt++;
                rt--;
            }

            if (!Character.isAlphabetic(arr[lt])) {
                lt++;
            }

            if (!Character.isAlphabetic(arr[rt])) {
                rt--;
            }

        }

        for (char c : arr) {
            bw.write(c);
        }

        bw.flush();
    }
}
