/**
 * Given an integer n, return the number of trailing zeroes in n!.
 * <p>
 * Example 1:
 * <p>
 * Input: 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero.
 * Example 2:
 * <p>
 * Input: 5
 * Output: 1
 * Explanation: 5! = 120, one trailing zero.
 */
public class Factorial_Trailing_Zeroes_172 {
    public int trailingZeroes(int n) {
        int i = n;
        int result = 0;
        while (i > 0) {
            i = i / 5;
            result += i;
        }
        return result;
    }
}
