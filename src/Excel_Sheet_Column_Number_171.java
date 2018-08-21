/**
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * <p>
 * For example:
 * <p>
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * Example 1:
 * <p>
 * Input: "A"
 * Output: 1
 * Example 2:
 * <p>
 * Input: "AB"
 * Output: 28
 * Example 3:
 * <p>
 * Input: "ZY"
 * Output: 701
 */
public class Excel_Sheet_Column_Number_171 {
    public int titleToNumber(String s) {
        char[] s_char = s.toCharArray();
        int result = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            int current = (int)(s_char[i]) - 65 + 1;
            result += current * (int)Math.pow(26, s.length() - i - 1);
        }
        return result;
    }
}
