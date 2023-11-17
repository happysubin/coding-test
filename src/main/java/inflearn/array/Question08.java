package inflearn.array;

import java.io.*;

public class Question08 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] answer = new int[num];

        for (int i = 0; i < num; i++) {
            int p1 = Integer.parseInt(arr[i]);
            int cnt = num;
            for (int j = 0; j < num; j++) {
                int p2 = Integer.parseInt(arr[j]);
                if(p1 >= p2) {
                    cnt--;
                }
            }
            answer[i] = cnt + 1; //자기 자신은 제외
        }

        for (int i : answer) {
            bw.write(i + " ");
        }
        bw.flush();
    }
}
