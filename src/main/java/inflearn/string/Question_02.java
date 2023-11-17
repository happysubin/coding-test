package inflearn.string;

import java.io.*;

public class Question_02 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        StringBuffer sf = new StringBuffer("");

        for(Character c : str.toCharArray()) {
            if(Character.isUpperCase(c)) {
                sf.append(Character.toLowerCase(c));
            }
            else {
                sf.append(Character.toUpperCase(c));
            }
        }

        bw.write(sf.toString());
        bw.flush();

    }
}
