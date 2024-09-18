package inflearn.string;

import java.io.*;

public class Question_09 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] chars = br.readLine().toCharArray();
        StringBuffer sf = new StringBuffer();

        for (char aChar : chars) {
            if(Character.isDigit(aChar)) {
                sf.append(aChar);
            }
        }

        bw.write(Integer.parseInt(sf.toString()) + "");

        bw.flush();
    }
}
