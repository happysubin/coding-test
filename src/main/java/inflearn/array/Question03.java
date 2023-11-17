package inflearn.array;

import java.io.*;

public class Question03 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String[] aArr = br.readLine().split(" ");
        String[] bArr = br.readLine().split(" ");


        for (int i = 0; i < num; i++) {
            //a가 이긴 경우


            if((aArr[i].equals("1") & bArr[i].equals("3")) |
                    (aArr[i].equals("2") & bArr[i].equals("1")) |
                    (aArr[i].equals("3") & bArr[i].equals("2"))) {
                bw.write("A\n");
            }
            else if ((bArr[i].equals("1") & aArr[i].equals("3")) |
                    (bArr[i].equals("2") & aArr[i].equals("1")) |
                    (bArr[i].equals("3") & aArr[i].equals("2"))) {
                bw.write("B\n");
            }
            else {
                bw.write("D\n");
            }
        }

        bw.flush();
    }
}
