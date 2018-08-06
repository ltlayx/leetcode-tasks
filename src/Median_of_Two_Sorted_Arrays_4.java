/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 *
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *
 * You may assume nums1 and nums2 cannot be both empty.
 *
 * Example 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * The median is 2.0
 * Example 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * The median is (2 + 3)/2 = 2.5
 */

public class Median_of_Two_Sorted_Arrays_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        boolean ifOdd = ((nums1.length + nums2.length) % 2 == 1) ? true : false;
        int[] sortNums = new int[(nums1.length + nums2.length) / 2 + 1];
        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < sortNums.length; i++) {
            if (p1 == nums1.length) {
                sortNums[i] = nums2[p2];
                p2++;
                continue;
            }
            if (p2 == nums2.length) {
                sortNums[i] = nums1[p1];
                p1++;
                continue;
            }
            if (nums1[p1] < nums2[p2]) {
                sortNums[i] = nums1[p1];
                p1++;
            } else {
                sortNums[i] = nums2[p2];
                p2++;
            }
        }
        double result = 0.0;
        if (ifOdd) {
            result = sortNums[sortNums.length - 1];
        } else {
            result = 1.0 * (sortNums[sortNums.length - 1] + sortNums[sortNums.length - 2]) / 2;
        }
        return result;
    }
}
