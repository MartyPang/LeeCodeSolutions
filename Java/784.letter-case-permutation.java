import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode id=784 lang=java
 *
 * [784] Letter Case Permutation
 */
class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> res = new ArrayList<>();
        res.add(S);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < S.length(); ++i) {
            if(Character.isLetter(S.charAt(i))) {
                char r;
                if(Character.isLowerCase(S.charAt(i))) r = Character.toUpperCase(S.charAt(i));
                else r = Character.toLowerCase(S.charAt(i));
                int size = res.size();
                for(int j = 0; j < size; ++j) {
                    String s = res.get(j);
                    sb.delete(0, sb.length());
                    sb.append(s);
                    sb.replace(i, i+1, r+"");
                    res.add(sb.toString());
                }
            }
        }
        Collections.sort(res);
        Collections.reverse(res);
        return res;
    }
}

