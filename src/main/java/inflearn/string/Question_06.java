package inflearn.string;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Question_06 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        List<Character> list = new ArrayList<>();

        char[] chars = br.readLine().toCharArray();

        for (Character aChar : chars) {
            if(!list.contains(aChar)) {
                list.add(aChar);
                bw.write(aChar);
            }
        }


        bw.flush();
    }
}
