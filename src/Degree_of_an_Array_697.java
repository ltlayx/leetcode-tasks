import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.
 *
 * Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.
 *
 * Example 1:
 * Input: [1, 2, 2, 3, 1]
 * Output: 2
 * Explanation:
 * The input array has a degree of 2 because both elements 1 and 2 appear twice.
 * Of the subarrays that have the same degree:
 * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 * The shortest length is 2. So return 2.
 * Example 2:
 * Input: [1,2,2,3,1,4,2]
 * Output: 6
 * Note:
 *
 * nums.length will be between 1 and 50,000.
 * nums[i] will be an integer between 0 and 49,999.
 */

public class Degree_of_an_Array_697 {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> left = new HashMap();
        Map<Integer, Integer> right = new HashMap();
        Map<Integer, Integer> counts = new HashMap();

        for(int i = 0; i < nums.length; i++){
            if(left.get(nums[i]) == null){
                left.put(nums[i], i);
            }
            right.put(nums[i], i);
            if(counts.get(nums[i]) == null){
                counts.put(nums[i], 1);
            }else {
                counts.put(nums[i], counts.get(nums[i]) + 1);
            }
        }

        int length = nums.length;
        int maxDegree = Collections.max(counts.values());
        for(int i : counts.keySet()){
            if(counts.get(i) == maxDegree){
                length = Math.min(length, right.get(i) - left.get(i) + 1);
            }
        }
        return length;
    }
}
