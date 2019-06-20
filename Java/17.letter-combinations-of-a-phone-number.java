import java.util.List;
import java.util.ArrayList;
/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits == null || digits.length() == 0 || digits.indexOf("1") >= 0) return res;

        StringBuilder sb = new StringBuilder();
        backtrace(res, sb, 0, digits);
        return res;
    }

    private void backtrace(List<String> res, StringBuilder phone, int level, String digits) {
        // a valid phone
        if(level == digits.length()) {
            res.add(phone.toString());
        }
        else {
            int cnt = (digits.charAt(level) == '9' || digits.charAt(level) == '7') ? 4 : 3;
            int start;
            if(digits.charAt(level) == '8') {
                start = 19;
            } else if (digits.charAt(level) == '9') {
                start = 22;
            } else {
                start = (Integer.parseInt(digits.substring(level, level+1)) - 2) * 3;
            }
            for(int i = 0; i < cnt; i++) {
                char c = (char)('a' + start + i);
                phone.append(c);
                backtrace(res, phone, level+1, digits);
                phone.deleteCharAt(phone.length() - 1);
            }
        }
    }
}

