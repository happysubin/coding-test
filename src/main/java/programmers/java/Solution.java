package programmers.java;


//24.09.19 - 타겟 넘버
class Solution {

    static boolean[] visited;
    static int result = 0;

    public void dfs(int[] numbers, int target, int now, int cnt) {

        if(cnt == numbers.length) {
            if(target == now) {
                result++;
                return;
            }
            return;
        }

        dfs(numbers, target, now + numbers[cnt], cnt + 1);
        dfs(numbers, target, now - numbers[cnt], cnt + 1);

    }

    public int solution(int[] numbers, int target) {
        visited = new boolean[numbers.length];
        dfs(numbers, target, 0, 0);
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{1, 1, 1, 1, 1};
        int target = 3;
        int solution1 = solution.solution(arr, target);
        System.out.println("solution1 = " + solution1);
    }
}