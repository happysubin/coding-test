package programmers.java;

import baekjoon.Hash;

import java.util.*;


//완주하지 못한 선수

/*
public class Hashs {

    static public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for (String s : participant) {
            map.put(s, map.getOrDefault(s,0)+1);
        }

        for (String s : completion) {
            map.put(s, map.getOrDefault(s,0)-1);
        }

        for (String s : map.keySet()) {
            if(map.get(s) !=0){
                answer = s;
            }
        }
        return answer;
    }



    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println( solution(participant,completion));
    }
}


 */

/*
//해시 전화번호 목록
public class Hashs {

    static public boolean solution(String[] phone_book) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String number : phone_book) hashMap.put(number, 0);
        for (String key : hashMap.keySet())
            for (int j = 1; j <= key.length() - 1; j++)
                if (hashMap.containsKey(key.substring(0, j))) return false;
        return true;

    }

    public static void main(String[] args) {
        String[] arr1 = {"119", "97674223", "1195524421"};
        String[] arr2 = {"123", "456", "789"};
        System.out.println(solution(arr1));
    }
}

 */
/*
public class Hashs {

    static public int solution(String[][] clothes) {
        int answer = 1;
        Map<String ,List<String>> map = new HashMap<>() ;
        for(int i = 0; i < clothes.length; i++){
            if(map.get(clothes[i][1]) == null){
                    map.put(clothes[i][1], new ArrayList<>());
            }
            map.get(clothes[i][1]).add(clothes[i][0]);
        }

        for (String s : map.keySet()) {
            answer *= map.get(s).size() + 1;
        }


        return answer - 1;
    }

    public static void main(String[] args) {
        String[][] arr1 = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(arr1));
    }
}

 */

import java.util.*;
//폰켓몬 24.9.18

//class Hashs {
//    public int solution(int[] nums) {
//        int max = nums.length / 2; // 6이 들어오면 3마리를 남김
//
//        Set<Integer> set = new HashSet<>();
//
//        for (int j = 0; j < nums.length; j++) {
//            set.add(nums[j]);
//        }
//
//        if(set.size() > max) return max;
//        else return set.size();
//    }
//
//    public static void main(String[] args) {
//        Hashs hashs = new Hashs();
//        int[] arr = {3,1,2,3};
//        hashs.solution(arr);
//    }
//}

//public class Hashs {
//
//    public String solution(String[] participant, String[] completion) {
//        Map<String, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < participant.length; i++) {
//            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
//        }
//
//        for (int i = 0; i < completion.length; i++) {
//            Integer value = map.get(completion[i]);
//            if(value != 1) map.put(completion[i], value - 1);
//            else map.remove(completion[i]);
//        }
//
//        Set<String> keySet = map.keySet();
//        String result = "";
//        for (String s : keySet) {
//            result = s;
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Hashs hashs = new Hashs();
//        String[] arr = {"leo", "kiki", "eden"};
//        String[] arr2 = {"eden", "kiki"};
//
//        String solution = hashs.solution(arr, arr2);
//        System.out.println("solution = " + solution);
//    }
//}

public class Hashs {

    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if(phone_book[i + 1].startsWith(phone_book[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Hashs hashs = new Hashs();
        String[] arr = {"119", "97674223", "1195524421"};

        boolean solution = hashs.solution(arr);
        System.out.println("solution = " + solution);
    }
}

