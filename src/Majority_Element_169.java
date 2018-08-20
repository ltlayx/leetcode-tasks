import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * <p>
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: [3,2,3]
 * Output: 3
 * Example 2:
 * <p>
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */
public class Majority_Element_169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> countNums = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (countNums.keySet().contains(num)) {
                int count = countNums.get(num);
                countNums.put(num, ++count);
            } else {
                countNums.put(num, 1);
            }
        }

        int maxCount = -1;
        int result = -1;
        for (Map.Entry<Integer, Integer> entry : countNums.entrySet()) {
            if (entry.getValue() > maxCount) {
                result = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return result;
    }
}
