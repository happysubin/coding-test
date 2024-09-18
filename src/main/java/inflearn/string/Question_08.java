package inflearn.string;

import java.io.*;

public class Question_08 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] chars = br.readLine().toCharArray();
        StringBuffer sf = new StringBuffer();

        for (char aChar : chars) {
            if(Character.isAlphabetic(aChar)) {
                sf.append(Character.toLowerCase(aChar));
            }
        }

        String str = sf.toString();
        String reverse = sf.reverse().toString();

        if(str.equals(reverse)) {
            bw.write("YES");
        }

        else {
            bw.write("NO");
        }

        bw.flush();
    }
}
