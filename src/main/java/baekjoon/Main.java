package baekjoon;//import java.util.*;
//import java.io.*;
//
////바이러스
////public class Main{
////    public static void main(String[] args) throws IOException{
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
////        int node = Integer.parseInt(br.readLine());
////        int edge = Integer.parseInt(br.readLine());
////        int[][] graph = new int[node][node];
////        boolean[] visited = new boolean[node];
////
////        for(int i = 0; i < edge; i++){
////            String[] str = br.readLine().split(" ");
////            int x = Integer.parseInt(str[0]) - 1;
////            int y = Integer.parseInt(str[1]) - 1;
////            graph[x][y] = 1;
////            graph[y][x] = 1;
////        }
////
////        //bfs 시작
////        visited[0] = true;
////        Queue<Integer> queue = new LinkedList<>();
////        graph[0][0] = 1;
////        queue.add(0);
////        int cnt = 0;
////        while(!queue.isEmpty()){
////            Integer poll = queue.poll();
////            for(int i = 0; i < node; i++){
////                if(visited[i] == false && graph[poll][i] == 1){
////                    visited[i] = true;
////                    queue.add(i);
////                    cnt++;
////                }
////            }
////        }
////        bw.write(String.valueOf(cnt));
////        bw.flush();
////    }
////}
//
//import java.io.*;
//import java.util.*;
//
//import java.io.*;
//import java.util.*;
//
//
////단지 번호 붙이기
//public class Main{
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int size = Integer.parseInt(br.readLine()); //지도 길이
//        int[][] map = new int[size][size]; //전체 지도
//        boolean[][] visited = new boolean[size][size]; //방문 추적
//        int answer = 0;
//        List<Integer> result = new ArrayList<>();
//        for(int i = 0; i < size; i++){
//            String[] temp = br.readLine().split("");
//            for(int j = 0; j < temp.length; j++){
//                map[i][j] = Integer.parseInt(temp[j]);
//            }
//        }
//        //초기화 끝
//
//        //1번부터 출발해야함. 번호 끝까지 뒤진다/
//        for(int i = 0; i < size; i++){
//            for(int j = 0; j < size; j++){
//                if(map[i][j] == 1 & visited[i][j] == false){
//                    int num = bfs(map, visited, i ,j);
//                    result.add(num);
//                    answer++;
//                }
//            }
//        }
//
//        //출력
//        Collections.sort(result);
//        bw.write(String.valueOf(answer) + "\n");
//        for(Integer s : result){
//            bw.write(String.valueOf(s) + "\n");
//        }
//        bw.flush();
//    }
//
//    static private int bfs(int[][] map, boolean[][] visited, int x, int y){
//        int count = 0;
//        Queue<Position> queue = new LinkedList<>();
//        queue.add(new Position(x, y));
//        visited[x][y] = true;
//
//
//        while(!queue.isEmpty()){
//            Position poll = queue.poll();
//            count++;
//            int tx = poll.x;
//            int ty = poll.y;
//
//            //위쪽
//            if(tx + 1 < map.length && map[tx + 1][ty] == 1 && visited[tx + 1][ty] == false){
//                queue.add(new Position(tx + 1, ty));
//                visited[tx + 1][ty] = true; //이걸 넣어줘야 경우의 수가 줄어든다.!! 매우 중요
//            }
//            //오른쪽
//            if(ty + 1 < map.length && map[tx][ty + 1] == 1 && visited[tx][ty + 1] == false){
//                queue.add(new Position(tx, ty + 1));
//                visited[tx][ty + 1] = true;
//            }
//            //아래쪽
//            if(tx - 1 >= 0 && map[tx - 1][ty] == 1 && visited[tx - 1][ty] == false){
//                queue.add(new Position(tx - 1, ty));
//                visited[tx - 1][ty] = true;
//
//            }
//            //왼쪽
//            if(ty - 1 >= 0 && map[tx][ty - 1] == 1 && visited[tx][ty - 1] == false){
//                queue.add(new Position(tx, ty - 1));
//                visited[tx][ty - 1] = true;
//            }
//        }
//        return count;
//    }
//
//    static class Position{
//        int x;
//        int y;
//
//        public Position(int x, int y){
//            this.x = x;
//            this.y = y;
//        }
//    }
//}
//
//
//
//

//import java.io.*;
//import java.util.*;
//
//
//class Main {
//
//
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String[] arr = br.readLine().split(" ");
//        int start = Integer.parseInt(arr[0]);
//        int end = Integer.parseInt(arr[1]);
//
//        boolean[] visited = new boolean[100001];
//        Queue<Position> queue = new LinkedList<>();
//
//        queue.add(new Position(start, 0));
//        visited[start] = true;
//
//        while(!queue.isEmpty()) {
//            Position poll = queue.poll();
//
//            if(poll.x == end) {
//                bw.write(poll.cnt + "");
//                break;
//            }
//
//            if(poll.x - 1 >= 0 && poll.x - 1 < 100001 && !visited[poll.x - 1]) {
//                visited[poll.x - 1] = true;
//                queue.add(new Position(poll.x - 1, poll.cnt + 1));
//            }
//
//            if(poll.x + 1 >= 0 && poll.x + 1 < 100001 && !visited[poll.x + 1]) {
//                visited[poll.x + 1] = true;
//                queue.add(new Position(poll.x + 1, poll.cnt + 1));
//            }
//
//            if(poll.x * 2 >= 0 && poll.x * 2 < 100001 && !visited[poll.x * 2]) {
//                visited[poll.x * 2] = true;
//                queue.add(new Position(poll.x * 2, poll.cnt + 1));
//            }
//        }
//
//        bw.flush();
//    }
//
//
//
//    static class Position{
//        int x;
//
//        int cnt;
//
//        public Position(int x, int cnt) {
//            this.x = x;
//            this.cnt = cnt;
//        }
//    }
//}


//import java.io.*;
//import java.util.*;
//
//
//class Main {
//
//
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int num = Integer.parseInt(br.readLine());
//        int[][] map = new int[num][num];
//        for (int i = 0; i < num; i++) {
//            String[] temp = br.readLine().split(" ");
//            for (int j = 0; j < num; j++) {
//                map[i][j] = Integer.parseInt(temp[j]);
//            }
//        }
//
//        int[] arrX = {-1, 1, 0, 0};
//        int[] arrY = {0, 0, 1, -1};
//
//
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 2; i <= 100; i++) {
//
//            boolean[][] visited = new boolean[num][num];
//
//            int result = 0;
//
//            for (int j = 0; j < num; j++) {
//                for (int k = 0; k < num; k++) {
//
//                    if(map[j][k] <= i || visited[j][k]) continue;
//
//                    Queue<Position> queue = new LinkedList<>();
//                    queue.add(new Position(j, k));
//                    visited[j][k] = true;
//
//                    while(!queue.isEmpty()) {
//                        Position poll = queue.poll();
//
//                        for (int l = 0; l < arrX.length; l++) {
//                            int x = poll.x + arrX[l];
//                            int y = poll.y + arrY[l];
//                            if(x >= 0 && y >= 0 && x < num && y < num &&  map[x][y] > i) { //수위보다 높음
//                                if(!visited[x][y]) {
//                                    visited[x][y] = true;
//                                    queue.add(new Position(x, y));
//                                }
//                            }
//                        }
//                    }
//                    result++;
//                }
//            }
//
//            max = Math.max(max, result);
//        }
//
//        bw.write(max + "");
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//
//    static class Position {
//        int x;
//        int y;
//
//        public Position(int x, int y) {
//            this.x = x;
//            this.y = y;
//        }
//    }
//}


//import java.io.*;
//import java.util.*;
//
//
//class Main {
//
//
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String[] temp = br.readLine().split(" ");
//        int x = Integer.parseInt(temp[0]);
//        int y = Integer.parseInt(temp[1]);
//
//        int[][] map = new int[x][y];
//        for (int i = 0; i < x; i++) {
//            String[] tmp = br.readLine().split(" ");
//            for (int j = 0; j < y; j++) {
//                map[i][j] = Integer.parseInt(tmp[j]);
//            }
//        }
//
//        int[] arrX = {-1, 1, 0, 0};
//        int[] arrY = {0, 0, 1, -1};
//
//
//        int max = Integer.MIN_VALUE;
//        int cnt = 0;
//
//        boolean[][] visited = new boolean[x][y];
//        Queue<Position> queue = new LinkedList<>();
//
//
//        for (int i = 0; i < x; i++) {
//            for (int j = 0; j < y; j++) {
//
//                if(visited[i][j] || map[i][j] == 0) continue;
//
//                visited[i][j] = true;
//                queue.add(new Position(i, j));
//                int size = 1;
//
//
//                while(!queue.isEmpty()) {
//                    Position poll = queue.poll();
//
//                    //방문했거나 0이면 색칠 시작 X
//
//                    for (int k = 0; k < 4; k++) {
//                        int px = poll.x + arrX[k];
//                        int py = poll.y + arrY[k];
//
//                        if(px >= 0 && py >= 0 && px < x && py < y && map[px][py] == 1) {
//                            if(!visited[px][py]) {
//                                visited[px][py] = true;
//                                size++;
//                                queue.add(new Position(px, py));
//                            }
//                        }
//                    }
//                    max = Math.max(max, size);
//                }
//                cnt++;
//            }
//        }
//
//        bw.write(cnt + "\n");
//        bw.write(max + "\n");
//
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//
//    static class Position {
//        int x;
//        int y;
//
//        public Position(int x, int y) {
//            this.x = x;
//            this.y = y;
//        }
//    }
//}

//
//import java.io.*;
//import java.util.*;
//
//
//class Main {
//
//
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String temp = br.readLine();
//        int num = Integer.parseInt(temp);
//
//        String[][] map = new String[num][num];
//        String[][] wMap = new String[num][num];
//
//        for (int i = 0; i < num; i++) {
//            String[] tmp = br.readLine().split("");
//            for (int j = 0; j < num; j++) {
//                map[i][j] = tmp[j];
//
//                if(tmp[j].equals("B")) {
//                    wMap[i][j] = "B";
//                }
//                else wMap[i][j] = "R";
//            }
//        }
//
//        int result = bfs(map);
//        int wResult = bfs(wMap);
//
//        bw.write(result + " " + wResult);
//        bw.flush();
//        bw.close();
//        br.close();
//    }
//
//    private static int bfs(String[][] map) {
//
//        int result = 0;
//        int[] arrX = {-1, 1, 0, 0};
//        int[] arrY = {0, 0, 1, -1};
//
//        boolean[][] visited = new boolean[map.length][map.length];
//        Queue<Position> queue = new LinkedList<>();
//
//        for (int i = 0; i < map.length; i++) {
//            for (int j = 0; j < map.length; j++) {
//                if(visited[i][j]) continue;
//
//                queue.offer(new Position(i, j, map[i][j]));
//                visited[i][j] = true;
//
//                while(!queue.isEmpty()) {
//                    Position poll = queue.poll();
//
//                    for (int k = 0; k < 4; k++) {
//                        int x = poll.x + arrX[k];
//                        int y = poll.y + arrY[k];
//
//                        if(x >=0 && y >= 0 && x < map.length && y < map.length) {
//                            if(!visited[x][y] && poll.value.equals(map[x][y])) {
//                                visited[x][y] = true;
//                                queue.add(new Position(x, y, poll.value));
//                            }
//                        }
//
//                    }
//                }
//
//                result++;
//
//            }
//        }
//
//        return result;
//    }
//
//    static class Position {
//        int x;
//        int y;
//        String value;
//
//        public Position(int x, int y, String value) {
//            this.x = x;
//            this.y = y;
//            this.value = value;
//        }
//    }
//}



import java.io.*;
import java.util.*;


class Main {


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] temp = br.readLine().split(" ");

        int x = Integer.parseInt(temp[0]);
        int y = Integer.parseInt(temp[1]);

        String[][] map = new String[x][y];

        int wolf = 0;
        int sheep = 0;

        for (int i = 0; i < x; i++) {
            String[] tmp = br.readLine().split("");
            for (int j = 0; j < y; j++) {
                map[i][j] = tmp[j];
                if(tmp[j].equals("v")) wolf++;
                else if(tmp[j].equals("o")) sheep++;
            }
        }

        bfs(map, wolf, sheep);

        br.close();
    }

    private static void bfs(String[][] map, int wolf, int sheep) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arrX = {-1, 1, 0, 0};
        int[] arrY = {0, 0, 1, -1};

        boolean[][] visited = new boolean[map.length][map[0].length];
        Queue<Position> queue = new LinkedList<>();

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if(visited[i][j] || map[i][j].equals("#")) continue;

                queue.offer(new Position(i, j));
                visited[i][j] = true;

                int wolfCnt = 0;
                int sheepCnt = 0;

                while(!queue.isEmpty()) {
                    Position poll = queue.poll();

                    if(map[poll.x][poll.y].equals("v")) wolfCnt++;
                    else if(map[poll.x][poll.y].equals("o")) sheepCnt++;

                    for (int k = 0; k < 4; k++) {
                        int x = poll.x + arrX[k];
                        int y = poll.y + arrY[k];

                        if(x >= 0 && y >= 0 && x < map.length && y < map[0].length) {
                            if(!visited[x][y] && !map[x][y].equals("#")) {
                                visited[x][y] = true;
                                queue.add(new Position(x, y));

                                /**
                                 * 큐에 새로운 위치를 넣을 때, 그 위치가 늑대인지 양인지를 확인하고 개수를 증가
                                 * 큐에 넣을 때마다 그 위치가 늑대인지 양인지 확인하는데, 이때 문제가 발생할 수 있습니다.
                                 * 예를 들어, 어떤 좌표가 여러 번 큐에 추가될 경우, 그 좌표에 있는 늑대나 양의 개수가 중복으로 세어질 수 있습니다.
                                 * 또는 이미 큐에 있는 좌표에 대해 늑대나 양의 개수가 업데이트되기 전에 탐색이 끝나는 경우, 정확하게 개수가 반영되지 않을 수 있습니다.
                                 *
                                 *
                                 * if(map[x][y].equals("v")) wolfCnt++;
                                 * else if(map[x][y].equals("o")) sheepCnt++;
                                 */
                            }
                        }
                    }
                }

                if(sheepCnt == 0 || wolfCnt == 0);
                else if(sheepCnt > wolfCnt) wolf -= wolfCnt;
                else sheep -= sheepCnt;
            }
        }

        bw.write(sheep + " " + wolf);

        bw.flush();
        bw.close();
    }

    static class Position {
        int x;
        int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}