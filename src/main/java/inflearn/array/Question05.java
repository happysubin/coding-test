package inflearn.array;

import java.io.*;

public class Question05 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int[] visited = new int[num + 1];

        for (int i = 2; i <= num; i++) {
            if(i * i < num) {
                for (int j = i; j <= num; j = j + i) {
                    if(i == j && visited[j] != 2) visited[j] = 1;
                    else visited[j] = 2;
                }
            }
            else break;
        }

        int cnt =0;
        for(int i = 2; i < num + 1 ; i++){
            if(visited[i]!=2) cnt++;
        }

        bw.write(cnt + "");
        bw.flush();
    }
}
