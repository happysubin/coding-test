package inflearn.recursive;

import java.io.*;

public class Question06 {


    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int cnt = 1;
        visited = new boolean[num + 1];
        dfs(num, cnt);
    }

    private static void dfs(int num, int cnt) {
        if(cnt == num + 1) {
            for (int i = 1; i <= num; i++) {
                if(visited[i] == true){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        else {
            visited[cnt] = true;
            dfs(num, cnt + 1);
            visited[cnt] = false;
            dfs(num, cnt + 1);
        }
    }

}
