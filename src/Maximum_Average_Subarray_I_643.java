/**
 *Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value.
 *
 * Example 1:
 * Input: [1,12,-5,-6,50,3], k = 4
 * Output: 12.75
 * Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 * Note:
 * 1 <= k <= n <= 30,000.
 * Elements of the given array will be in the range [-10,000, 10,000].
 */


public class Maximum_Average_Subarray_I_643 {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length == 1)
            return 1.0 * nums[0] / k;
        int i = 0;
        double maxAve = Integer.MIN_VALUE;
        long sum = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            if (j - i == k - 1) {
                if (maxAve < 1.0 * sum / k) {
                    maxAve = 1.0 * sum / k;
                }
                sum -= nums[i];
                i++;
            }
        }
        return maxAve;
    }
}


