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



//import java.io.*;
//import java.util.*;
//
//
//class Main {
//
//
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] temp = br.readLine().split(" ");
//
//        int x = Integer.parseInt(temp[0]);
//        int y = Integer.parseInt(temp[1]);
//
//        String[][] map = new String[x][y];
//
//        int wolf = 0;
//        int sheep = 0;
//
//        for (int i = 0; i < x; i++) {
//            String[] tmp = br.readLine().split("");
//            for (int j = 0; j < y; j++) {
//                map[i][j] = tmp[j];
//                if(tmp[j].equals("v")) wolf++;
//                else if(tmp[j].equals("o")) sheep++;
//            }
//        }
//
//        bfs(map, wolf, sheep);
//
//        br.close();
//    }
//
//    private static void bfs(String[][] map, int wolf, int sheep) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int[] arrX = {-1, 1, 0, 0};
//        int[] arrY = {0, 0, 1, -1};
//
//        boolean[][] visited = new boolean[map.length][map[0].length];
//        Queue<Position> queue = new LinkedList<>();
//
//        for (int i = 0; i < map.length; i++) {
//            for (int j = 0; j < map[0].length; j++) {
//                if(visited[i][j] || map[i][j].equals("#")) continue;
//
//                queue.offer(new Position(i, j));
//                visited[i][j] = true;
//
//                int wolfCnt = 0;
//                int sheepCnt = 0;
//
//                while(!queue.isEmpty()) {
//                    Position poll = queue.poll();
//
//                    if(map[poll.x][poll.y].equals("v")) wolfCnt++;
//                    else if(map[poll.x][poll.y].equals("o")) sheepCnt++;
//
//                    for (int k = 0; k < 4; k++) {
//                        int x = poll.x + arrX[k];
//                        int y = poll.y + arrY[k];
//
//                        if(x >= 0 && y >= 0 && x < map.length && y < map[0].length) {
//                            if(!visited[x][y] && !map[x][y].equals("#")) {
//                                visited[x][y] = true;
//                                queue.add(new Position(x, y));
//
//                                /**
//                                 * 큐에 새로운 위치를 넣을 때, 그 위치가 늑대인지 양인지를 확인하고 개수를 증가
//                                 * 큐에 넣을 때마다 그 위치가 늑대인지 양인지 확인하는데, 이때 문제가 발생할 수 있습니다.
//                                 * 예를 들어, 어떤 좌표가 여러 번 큐에 추가될 경우, 그 좌표에 있는 늑대나 양의 개수가 중복으로 세어질 수 있습니다.
//                                 * 또는 이미 큐에 있는 좌표에 대해 늑대나 양의 개수가 업데이트되기 전에 탐색이 끝나는 경우, 정확하게 개수가 반영되지 않을 수 있습니다.
//                                 *
//                                 *
//                                 * if(map[x][y].equals("v")) wolfCnt++;
//                                 * else if(map[x][y].equals("o")) sheepCnt++;
//                                 */
//                            }
//                        }
//                    }
//                }
//
//                if(sheepCnt == 0 || wolfCnt == 0);
//                else if(sheepCnt > wolfCnt) wolf -= wolfCnt;
//                else sheep -= sheepCnt;
//            }
//        }
//
//        bw.write(sheep + " " + wolf);
//
//        bw.flush();
//        bw.close();
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
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int x = Integer.parseInt(st.nextToken());
//        int y = Integer.parseInt(st.nextToken());
//
//
//        int[][] map = new int[x][y];
//
//        for (int i = 0; i < x; i++) {
//            char[] charArray = br.readLine().toCharArray();
//            for (int j = 0; j < y; j++) {
//                map[i][j] = Character.getNumericValue(charArray[j]);
//            }
//        }
//
//        int bfs = bfs(map);
//        System.out.println(bfs);
//
//        br.close();
//    }
//
//    private static int bfs(int[][] map) throws IOException {
//
//        int[] arrX = {-1, 1, 0, 0};
//        int[] arrY = {0, 0, 1, -1};
//
//        /**
//         * 2차원 배열로 사용하면 반례 등장.
//         * 벽을 부숴야 도착지에 도착할 수 있는 경우,
//         * 미리 앞에서 벽을 부순 다음 먼저 지나가서 방문 체크를 한 경우 앞에서 부수지 않고 돌아서온 경우 이미 가야하는 길쪽에 방문체크가 되어있어 움직일 수가 없다.
//         * 벽을 부순경우와 아닌경우 따로 체크를 해줘야함.
//         */
//        boolean[][][] visited = new boolean[map.length][map[0].length][2];
//        Queue<Position> queue = new LinkedList<>();
//
//        queue.add(new Position(0, 0, 1, false));
//        visited[0][0][0] = true;  //마지막 차원이 1이면 부순 세계꽌, 0이면 아직 안 부순 세계관
//
//        while(!queue.isEmpty()) {
//
//            Position poll = queue.poll();
//
//            if(poll.x ==  map.length - 1 && poll.y == map[0].length - 1) {
//                return poll.value;
//            }
//
//            for (int i = 0; i < 4; i++) {
//
//                int x = poll.x + arrX[i];
//                int y = poll.y + arrY[i];
//
//                if(x >= 0 && x < map.length & y >= 0 && y < map[0].length ) {
//
//                    if(!poll.destroyFlag) { //벽을 부순적이 없음
//
//                        //벽이야.
//                        if(map[x][y] == 1) {
//                            visited[x][y][1] = true;
//                            queue.add(new Position(x, y, poll.value + 1, true));
//                        }
//
//                        //벽이 아니야, 방문한적도 없엉.
//                        if(map[x][y] == 0 && !visited[x][y][0]) {
//                            visited[x][y][0] = true;
//                            queue.add(new Position(x, y, poll.value + 1, false));
//                        }
//                    }
//                    else { //부순적이 있음.
//
//                        //벽이라면 아무것도 못함.
//
//                        //벽이 아니고 방문한적이 없다면 그냥 진행.
//                        if(map[x][y] == 0 && !visited[x][y][1]) {
//                            visited[x][y][1] = true;
//                            queue.add(new Position(x, y, poll.value + 1, true));
//                        }
//                    }
//                }
//            }
//        }
//
//        return -1;
//    }
//
//
//    //아니면 나는 이미 부순 놈이라고 추가
//    static class Position {
//        int x;
//        int y;
//        int value;
//        boolean destroyFlag; //
//
//        public Position(int x, int y, int value, boolean destroyFlag) {
//            this.x = x;
//            this.y = y;
//            this.value = value;
//            this.destroyFlag = destroyFlag;
//        }
//    }
//}


import java.io.*;
import java.util.*;


class Main {

    static int goal = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] t = br.readLine().split(" ");

        int y = Integer.parseInt(t[0]);
        int x = Integer.parseInt(t[1]);

        int[][] map = new int[x][y];

        goal = 0;  // 익어야 하는 토마토 수

        int minus = 0;  // 빈 칸의 수
        int plus = 0;   // 처음에 익어있는 토마토 수

        for (int i = 0; i < x; i++) {
            String[] tempArray = br.readLine().split(" ");
            for (int j = 0; j < y; j++) {
                map[i][j] = Integer.parseInt(tempArray[j]);
                if (map[i][j] == -1) {
                    minus++;  // 빈 칸이면 goal에서 제외
                } else if (map[i][j] == 1) {
                    plus++;   // 처음에 익어있는 토마토
                } else {
                    goal++;   // 익어야 하는 토마토(0인 칸)
                }
            }
        }

        if(minus + plus == x * y) { //원래 할게 없는 경우
            System.out.println(0);
            return;
        }

        int bfs = bfs(map);
        System.out.println(bfs);

        br.close();
    }

    private static int bfs(int[][] map) {

        int[] arrX = {-1, 1, 0, 0};
        int[] arrY = {0, 0, 1, -1};

        int cnt = 0;
        Queue<Position> queue = new LinkedList<>();

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if(map[i][j] == 1) {
                    queue.add(new Position(i, j, 0));
                }
            }
        }

        int maxDays = 0;

        while(!queue.isEmpty()) {

            Position poll = queue.poll();
            maxDays = poll.day;  // BFS이므로 마지막에 갱신된 값이 최종 일수

            if (cnt == goal)  return poll.day;  // 걸린 일수 반환}
            //위 와 같은 코드가 들어가면 안되는 이유
            /**
             * 6 4
             * 0 0 0 0 0 0
             * 0 0 0 0 0 0
             * 0 0 0 0 0 0
             * 0 0 0 0 0 1
             *
             * 에서 위 코드가 들어가면 0,0은 8일차에 완성되는데 7일차에 return을 해버림.
             *
             * 그럼 왜 if (cnt == goal)이 잘못된 것인가?
             * 문제의 핵심: BFS의 동시성
             * BFS는 동시에 여러 방향으로 확장됩니다.
             * 즉, 같은 날에 여러 토마토들이 동시에 익을 수 있습니다. 하지만, cnt == goal 조건을 중간에 검사하고 바로 반환하게 되면,
             * 현재 날에 익어야 할 모든 토마토들이 완전히 처리되기 전에 BFS가 종료될 수 있습니다.
             *
             * 좀 더 구체적으로, BFS가 한 번의 탐색(하나의 poll)에서 큐에 있는 토마토들을 차례로 꺼내어 다음 상태로 확장하는 동안,
             * 아직 익어야 할 다른 토마토가 남아 있을 수 있습니다.
             * 이때 모든 탐색이 끝난 후에야 poll.day가 정확한 값을 반환할 수 있기 때문에, 중간에 cnt == goal 조건을 체크하고 종료하면 결과가 왜곡됩니다.
             */

            for (int i = 0; i < 4; i++) {

                int x = poll.x + arrX[i];
                int y = poll.y + arrY[i];

                if(x >= 0 && x < map.length & y >= 0 && y < map[0].length ) {
                    if(map[x][y] == 0) { //방문한적 없는 안익은 토마토가 존재
                        queue.add(new Position(x, y, poll.day + 1));
                        map[x][y] = 1;
                        cnt++;
                    }
                }
            }
        }

        if (cnt == goal) {
            return maxDays;  // 걸린 일수 반환
        } else {
            return -1;  // 모두 익지 못한 경우
        }
    }


    static class Position {

        int x;
        int y;
        int day;

        public Position(int x, int y, int day) {
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }
}