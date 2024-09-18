package inflearn.twopointers;

import java.io.*;

public class Question06 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] temp = br.readLine().split(" ");
        int total = Integer.parseInt(temp[0]);
        int size = Integer.parseInt(temp[1]);

        String[] arr = br.readLine().split(" ");

        int answer = 0, cnt = 0, lt = 0;

        for(int rt = 0; rt < total; rt++){
            if(arr[rt].equals("0")) cnt++;
            while(cnt > size){
                if(arr[lt].equals("0")) cnt--;
                lt++;
            }
            answer=Math.max(answer, rt-lt+1);
        }


        bw.write(answer + "");
        bw.flush();
    }
}
