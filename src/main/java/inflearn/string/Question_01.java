package inflearn.string;

import java.io.*;
import java.util.*;

public class Question_01 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 0;

        String[] str = br.readLine().toLowerCase().split("");
        String c = br.readLine().toLowerCase();

        for(String s : str) {
            if(s.equals(c)) cnt++;
        }


        bw.write(String.valueOf(cnt));
        bw.flush();

    }
}
