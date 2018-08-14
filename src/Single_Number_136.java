import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 */
public class Single_Number_136 {
    public int singleNumber(int[] nums) {
        Set<Integer> numsSet = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(numsSet.contains(nums[i])){
                numsSet.remove(nums[i]);
            }else {
                numsSet.add(nums[i]);
            }
        }
        Iterator<Integer> iter = numsSet.iterator();
        return iter.next();
    }
}
