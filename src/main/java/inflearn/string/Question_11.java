package inflearn.string;

import java.io.*;

public class Question_11 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sf = new StringBuffer();

        String str = br.readLine() + "|";
        String[] arr = str.split("");

        int cnt = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i].equals(arr[i + 1])) {
                cnt++;
            }
            else {
                sf.append(arr[i]);
                if(cnt != 1) {
                    sf.append(cnt);
                }
                cnt = 1;
            }
        }

        bw.write(sf.toString());

        bw.flush();
    }
}
