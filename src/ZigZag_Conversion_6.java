import java.util.ArrayList;
import java.util.List;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string s, int numRows);
 * Example 1:
 *
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 *
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 *
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 */
public class ZigZag_Conversion_6 {
    public String convert(String s, int numRows) {
        int length = s.length();
        if(length == 0 || numRows == 1) return s;
        int cycle = length / (numRows * 2 - 2) + 1;
        List<List<String>> lines = new ArrayList<List<String>>();
        for(int i = 0; i < numRows; i++){
            lines.add(new ArrayList<String>());
        }
        int count = 0;
        for(int i = 0; i < cycle; i++){
            for(int j = 0; j < numRows; j++){
                if(count == length) break;
                int index = i * (numRows * 2 - 2) + j;
                int temp = (numRows * 2 - 2) * (1 + 2 * i);
                if(j == 0 || j == numRows - 1){
                    lines.get(j).add(s.substring(index, index + 1));
                    count++;
                }
                else{
                    lines.get(j).add(s.substring(index, index + 1));
                    count++;
                    if(temp - index + 1 <= length){
                        lines.get(j).add(s.substring(temp - index, temp - index + 1));
                        count++;
                    }
                }
            }
        }
        String result = "";
        for(int i = 0; i < lines.size(); i++){
            for(int j = 0; j < lines.get(i).size(); j++){
                result += lines.get(i).get(j);
            }
        }
        return result;
    }
}
