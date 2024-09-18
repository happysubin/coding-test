package inflearn.stackandqueue;

import java.io.*;
import java.util.*;

public class Question08 {

    static class Patient{
        private final int idx;
        private final int score;

        public Patient(int idx, int score) {
            this.idx = idx;
            this.score = score;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);

        String[] temp2 = br.readLine().split(" ");

        List<Patient> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new Patient(i, Integer.parseInt(temp2[i])));
        }

        boolean flag = true;

        int cnt = 0;

        while(true) {
            Patient patient = list.remove(0);
            for (int i = 0; i < list.size(); i++) {
                Patient compare = list.get(i);
                if(compare.score > patient.score) {
                    list.add(patient);
                    flag = false;
                    break;
                }
            }

            if(flag) {
                cnt++;
                if(patient.idx == m) {
                    bw.write(cnt + "");
                    break;
                }
            }
            flag = true;
        }
        bw.flush();
    }
}
