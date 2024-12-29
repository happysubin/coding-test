package programmers.java;


//24.09.19 - 타겟 넘버
//class Solution {
//
//    static boolean[] visited;
//    static int result = 0;
//
//    public void dfs(int[] numbers, int target, int now, int cnt) {
//
//        if(cnt == numbers.length) {
//            if(target == now) {
//                result++;
//                return;
//            }
//            return;
//        }
//
//        dfs(numbers, target, now + numbers[cnt], cnt + 1);
//        dfs(numbers, target, now - numbers[cnt], cnt + 1);
//
//    }
//
//    public int solution(int[] numbers, int target) {
//        visited = new boolean[numbers.length];
//        dfs(numbers, target, 0, 0);
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int[] arr = new int[]{1, 1, 1, 1, 1};
//        int target = 3;
//        int solution1 = solution.solution(arr, target);
//        System.out.println("solution1 = " + solution1);
//    }
//}


import java.util.LinkedList;
import java.util.Queue;

class Solution {


    class Position {
        int x;
        int y;
        int cnt;

        public Position(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }


    public int solution(int[][] maps) {
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        Queue<Position> queue = new LinkedList<>();
        int[] arrX = new int[]{1, -1 , 0, 0};
        int[] arrY = new int[]{0, 0, 1, -1};

        queue.add(new Position(0, 0, 1));
        visited[0][0] = true;

        while(!queue.isEmpty()) {

            Position poll = queue.poll();

            for (int i = 0; i < arrX.length; i++) {
                int x = poll.x + arrX[i];
                int y = poll.y + arrY[i];
                if(x >= 0 && y >= 0 && x < maps.length && y < maps[0].length && maps[x][y] == 1) {
                    if(!visited[x][y]) {
                        visited[x][y] = true;
                        queue.add(new Position(x, y, poll.cnt + 1));
                    }
                }
            }

            if(poll.x == maps.length - 1 && poll.y == maps[0].length - 1) {
                return poll.cnt;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr = new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        int solution1 = solution.solution(arr);
        System.out.println("solution1 = " + solution1);
    }
}