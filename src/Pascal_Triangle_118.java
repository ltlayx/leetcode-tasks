import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 5
 * Output:
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */
public class Pascal_Triangle_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(numRows == 0) return result;
        result.add(new ArrayList<Integer>());
        result.get(0).add(1);
        for(int i = 1; i < numRows; i++){
            result.add(new ArrayList<Integer>());
            int lineNum = i + 1;
            result.get(i).add(1);
            for(int j = 1; j <= lineNum - 2; j++){
                result.get(i).add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
            result.get(i).add(1);
        }
        return result;
    }
}
