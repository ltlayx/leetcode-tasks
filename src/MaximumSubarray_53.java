/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * Example:
 *
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 */


public class MaximumSubarray_53 {
    public int maxSubArray(int[] nums) {
        return maxSub(nums, 0, nums.length - 1);
    }

    private int findCrossMax(int[] nums, int i, int j, int mid){
        int leftMax = Integer.MIN_VALUE;
        int leftSum = 0;
        for(int p = mid; p >= i; p--){
            leftSum += nums[p];
            if(leftSum > leftMax){
                leftMax = leftSum;
            }
        }
        int rightMax = Integer.MIN_VALUE;
        int rightSum = 0;
        for(int q = mid + 1; q <= j; q++){
            rightSum += nums[q];
            if(rightSum > rightMax){
                rightMax = rightSum;
            }
        }
        return leftMax+rightMax;
    }

    private int maxSub(int[] nums, int i, int j){
        if(i==j){
            return nums[i];
        }
        int mid = (i + j) / 2;
        int crossMax = findCrossMax(nums, i, j, mid);
        int leftMax = maxSub(nums, i, mid);
        int rightMax = maxSub(nums, mid + 1, j);
        return Math.max(Math.max(crossMax, leftMax), rightMax);
    }
}
