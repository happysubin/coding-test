package inflearn.string;

import java.io.*;

public class Question_12 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sf = new StringBuffer();

        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();

        str = str.replace("#","1");
        str = str.replace("*","0");


        int j = 0;
        for (int i = 0; i < num; i++) {
            int n = Integer.parseInt(str.substring(j, j + 7), 2);
            j+=7;
            bw.write((char) n );
        }

        bw.flush();
    }
}
