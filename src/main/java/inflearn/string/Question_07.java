package inflearn.string;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Question_07 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().toUpperCase();

        if(new StringBuffer(str).reverse().toString().equals(str)) {
            bw.write("YES");
        }
        else {
            bw.write("NO");
        }

        bw.flush();
    }
}
