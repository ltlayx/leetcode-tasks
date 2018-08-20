/**
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 * <p>
 * For example:
 * <p>
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 * ...
 * Example 1:
 * <p>
 * Input: 1
 * Output: "A"
 * Example 2:
 * <p>
 * Input: 28
 * Output: "AB"
 * Example 3:
 * <p>
 * Input: 701
 * Output: "ZY"
 */
public class Excel_Sheet_Column_Title_168 {
    public String convertToTitle(int n) {
        StringBuffer result = new StringBuffer();
        while (n > 0) {
            n--;
            char current = (char) (n % 26 + (int) 'A');
            result.append(current);
            n = n / 26;
        }
        return new StringBuffer(result).reverse().toString();
    }
}
