package inflearn.sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Question05 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i].equals(arr[i + 1])) {
                bw.write("D");
                bw.flush();
                return;
            }
        }

        bw.write("U");
        bw.flush();
    }
}
