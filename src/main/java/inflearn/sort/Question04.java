package inflearn.sort;

import java.io.*;
import java.util.*;

public class Question04 {


    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        List<String> cache = new ArrayList<>(cacheSize);

        for (int i = 0; i < cities.length; i++) {

            //캐시에 없다면 +5
            String city = cities[i].toLowerCase(Locale.ROOT);

            if(!cache.contains(city)) {

                //캐시 사이즈를 초과하려한다면
                if(cacheSize > 0 && cache.size() == cacheSize) {
                    cache.remove(cacheSize - 1);
                }

                if(cacheSize > 0 ){
                    cache.add(0, city);
                }

                answer += 5;
            }

            //캐시에 존재함. lru를 사용해 젤 위로 올림.
            else {
                cache.remove(city);
                answer += 1;
                cache.add(0, city);
            }

        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] cities = {"NewYork", "newyork"};
        int cacheSize = 0;
        int solution = new Question04().solution(cacheSize, cities);

        bw.write(solution + "");
        bw.flush();
    }
}
