import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * <p>
 * Note:
 * <p>
 * The solution set must not contain duplicate triplets.
 * <p>
 * Example:
 * <p>
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 * <p>
 * A solution set is:
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 */
public class Three_Sum_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        // 先排序，排序的作用是可以使用双指针来查找两个数的和
        Arrays.sort(nums);
        // 创建结果对象
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        // i从1开始到n-2，原因是长度为3
        for (int i = 0; i < nums.length - 2; i++) {
            while (i > 0 && nums[i] == nums[i - 1] && i < nums.length - 2)//因为已经排好序了，所以对于当前i去掉重复的连续几个数
                i++;
            // 第i个数的相反数
            int reverse = (-1) * nums[i];
            int p = i + 1;
            int q = nums.length - 1;
            // 用双指针找结果
            while (p < q) {
                // 找到了
                if (nums[p] + nums[q] == reverse) {
                    // 添加结果
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[p]);
                    list.add(nums[q]);
                    // if(!result.contains(list))
                    result.add(list);
                    while (p < q && nums[p] == nums[p + 1])//因为已经排好序了，所以对于当前p去掉重复的连续几个数
                        p++;
                    while (p < q && nums[q] == nums[q - 1])//因为已经排好序了，所以对于当前q去掉重复的连续几个数
                        q--;
                    p++;
                    q--;
                } else if (nums[p] + nums[q] < reverse) {
                    p++;
                } else {
                    q--;
                }
            }
        }
        return result;
    }
}
