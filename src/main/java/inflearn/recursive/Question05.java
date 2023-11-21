package inflearn.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question05 {


    static Node root;

    static class Node{
        int data;
        Node lt, rt;
        public Node(int val) {
            data=val;
            lt=rt=null;
        }
    }

    public static void main(String[] args) throws IOException {
        root=new Node(1);
        root.lt=new Node(2);
        root.rt=new Node(3);
        root.lt.lt=new Node(4);
        root.lt.rt=new Node(5);
        root.rt.lt=new Node(6);
        root.rt.rt=new Node(7);
        DFS(root);
    }

    private static void DFS(Node root) {
        if(root == null) {
            return;
        }
        else {
            DFS(root.lt);
            System.out.print(root.data + " ");
            DFS(root.rt);
        }
    }
}
