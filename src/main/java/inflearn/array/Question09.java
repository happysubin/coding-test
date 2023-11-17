package inflearn.array;

import java.util.Scanner;

public class Question09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[][] arr = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = 0;

        for (int i = 0; i < num; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < num; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }

            max = Math.max(sum1, max);
            max = Math.max(sum2, max);
        }

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < num; i++) {
            sum1 += arr[i][i];
            sum2 += arr[num - 1 -i][i];
        }

        max = Math.max(sum1, max);
        max = Math.max(sum2, max);

        System.out.println(max);

    }
}
