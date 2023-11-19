package inflearn.twopointers;

import java.io.*;

public class Question04 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] temp = br.readLine().split(" ");

        int total = Integer.parseInt(temp[0]);
        int goal = Integer.parseInt(temp[1]);

        String[] temps = br.readLine().split(" ");
        int[] arr = new int[temps.length];

        for (int i = 0; i < temps.length; i++) {
            arr[i] = Integer.parseInt(temps[i]);
        }

        int lt = 0;
        int rt = 0;
        int result = 0;
        int cnt = 0;

        while(rt < arr.length) {
            result += arr[rt++];
            if(result == goal) cnt++;

            //초과한 경우 다음으로 넘어가면 조건문이 마무리 될 수 있다. 따라서 바로 내부에서 진행해줘야 한다.
            while(result >= goal) {
                result -= arr[lt++];
                if(result == goal) cnt++;
            }
        }

        bw.write(cnt + "");
        bw.flush();
    }
}
