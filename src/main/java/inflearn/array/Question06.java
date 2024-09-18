package inflearn.array;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Question06 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");
        List<String> list = new ArrayList<>();

        for (String s : temp) {
            StringBuffer sf = new StringBuffer(s);
            String str = sf.reverse().toString();
            list.add(str);
        }

        for (String str : list) {
            Integer n = Integer.parseInt(str);
            for (int i = 2; i <= n; i++) {
                if(n % i == 0) {
                    if(i == n ){
                        bw.write(n + " ");
                    }
                    else break;
                }
            }
        }

        bw.flush();
    }
}
