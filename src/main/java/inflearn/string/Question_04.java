package inflearn.string;

import java.io.*;

public class Question_04 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            String result = new StringBuffer(str).reverse().toString();
            bw.write(result + "\n");
        }
        bw.flush();
    }
}
