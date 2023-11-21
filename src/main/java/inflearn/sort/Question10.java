package inflearn.sort;

import java.io.*;
import java.util.Arrays;

public class Question10 {
    public static int count(int[] arr, int dist){
        int cnt=1;//최소 말 한마리를 배치
        int ep=arr[0];//제일 작은 왼쪽 좌표에 배치
        for(int i=0;i<arr.length;i++){
            if(arr[i]-ep>=dist){
                cnt++;
                ep=arr[i];
            }
        }
        return cnt;
    }
    public static int solution(int len,int num, int[] arr) {
        int lt=1; //말 사이의 최소 거리는 1
        int rt=arr[len-1]-arr[0]; //최댓값은 맨 처음 좌표와 맨 마지막 좌표의 차이
        int answer=0;

        Arrays.sort(arr);

        while(lt<=rt){
            int mid=(lt+rt)/2; //mid가 DVD의 용량
            if(count(arr,mid)>=num){
                answer=mid;
                lt=mid+1;
            }
            else rt=mid-1;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr=br.readLine().split(" ");
        int len=Integer.parseInt(arr[0]);
        int num=Integer.parseInt(arr[1]);
        String[] str=br.readLine().split(" ");
        int[] list=new int[len];
        int j=0;
        for(String x: str){
            list[j++]=Integer.parseInt(x);
        }

        System.out.println(solution(len,num,list));
    }
}