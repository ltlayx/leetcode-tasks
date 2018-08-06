/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Note: Given n will be a positive integer.
 *
 * Example 1:
 *
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 *
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */
public class Climbing_Stairs_70 {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return recuClimb(n, memo);
    }

    public int recuClimb(int n, int[] memo){
        if(n == 1 || n == 2){
            return n;
        }
        if(memo[n] != 0){
            return memo[n];
        }
        int steps = 0;
        if(memo[n - 1] != 0){
            steps += memo[n - 1];
        }else{
            steps += recuClimb(n - 1, memo);
        }
        if(memo[n - 2] != 0){
            steps += memo[n - 2];
        }else{
            steps += recuClimb(n - 2, memo);
        }
        memo[n] = steps;
        return steps;
    }
}
