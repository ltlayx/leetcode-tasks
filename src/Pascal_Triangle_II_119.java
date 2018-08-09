import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 *
 * Note that the row index starts from 0.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 3
 * Output: [1,3,3,1]
 */
public class Pascal_Triangle_II_119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>();
        if(rowIndex == 0){
            result.add(1);
            return result;
        }
        if(rowIndex == 1){
            result.add(1);
            result.add(1);
            return result;
        }
        List<Integer> lastRow = getRow(rowIndex - 1);
        result.add(1);
        for(int i = 1; i < rowIndex; i++){
            result.add(lastRow.get(i - 1) + lastRow.get(i));
        }
        result.add(1);
        return result;
    }
}
