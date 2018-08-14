/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 *
 * Input: "race a car"
 * Output: false
 */
public class Valid_Palindrome_125 {
    public boolean isPalindrome(String s) {
        /**
         * If I know how to use regular expression, I can short the code with
         * char[] filterLists = String removeOther = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
         */
        String lowerCase = s.toLowerCase();
        char[] lists = lowerCase.toCharArray();
        char[] filterLists = new char[lists.length];
        int count = 0;
        for(int i = 0; i < lists.length; i++){
            if(((int)lists[i] >= 48 && (int)lists[i] <= 57)
                    || ((int)lists[i] >= 97 && (int)lists[i] <= 122)){
                filterLists[count] = lists[i];
                count++;
            }
        }
        if(count == 0)
            return true;
        int p = 0;
        int q = count - 1;
        while(p <= q){
            if(filterLists[p] == filterLists[q]){
                p++;
                q--;
            }else
                return false;
        }
        return true;
    }
}
