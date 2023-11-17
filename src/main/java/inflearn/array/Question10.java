
package inflearn.array;

import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[][] arr = new int[num + 2][num + 2];

        for (int i = 1; i < num + 1; i++) {
            for (int j = 1; j < num + 1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int cnt = 0;

        for (int i = 1; i < num + 1; i++) {
            for (int j = 1; j < num + 1; j++) {
                int p = arr[i][j];
                if((p > arr[i + 1][j] ) &&
                        (p > arr[i][j + 1]) &&
                        (p > arr[i - 1][j]) &&
                        (p > arr[i][j - 1])) {
                    cnt++;
                }
            }
        }


        System.out.println(cnt);

    }
}
