package inflearn.recursive;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Question12 {

    static int n, m, answer=0;
    static int[][] graph;
    static int[] ch;
    static public void DFS(int v){
        if(v==n) answer++;
        else{
            for(int i=1; i<=n; i++){
                if(graph[v][i]==1 && ch[i]==0){
                    ch[i]=1;
                    DFS(i);
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        graph=new int[n+1][n+1];
        ch=new int[n+1];
        for(int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            graph[a][b]=1;
        }
        ch[1]=1;
        DFS(1);
        System.out.println(answer);
    }
}