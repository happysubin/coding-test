package inflearn.dingcodingco.chapter01;

import java.util.Arrays;
import java.util.List;

public class Example1_9 {


    static void solution(List<Integer> list) {

        int result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(result * list.get(i) > result + list.get(i)) {
                result *= list.get(i);
            }
            else result += list.get(i);
        }

        System.out.println("result = " + result);
    }

    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(0, 3, 5, 6, 1, 2, 4);
        List<Integer> list = Arrays.asList(1, 1, 1, 3, 3, 2, 5);

        solution(list);
    }
}
