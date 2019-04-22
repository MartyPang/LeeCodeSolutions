/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 *
 * https://leetcode.com/problems/reverse-vowels-of-a-string/description/
 *
 * algorithms
 * Easy (40.86%)
 * Total Accepted:    150.3K
 * Total Submissions: 364.7K
 * Testcase Example:  '"hello"'
 *
 * Write a function that takes a string as input and reverse only the vowels of
 * a string.
 * 
 * Example 1:
 * 
 * 
 * Input: "hello"
 * Output: "holle"
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "leetcode"
 * Output: "leotcede"
 * 
 * 
 * Note:
 * The vowels does not include the letter "y".
 * 
 * 
 * 
 */
class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int p = 0, q = c.length-1;
        while(p < q) {
            while(p < q && !isVowel(c[p])) ++p;
            while(p <q && !isVowel(c[q])) --q;
            char tmp = c[p];
            c[p] = c[q];
            c[q] = tmp;
            ++p;
            --q;
        }
        return new String(c);
    }

    public static boolean isVowel(char a){
	    switch(a){
	         case ('a') : return true;
	         case ('e') : return true;
	         case ('i') : return true;
	         case ('o') : return true;
	         case ('u') : return true;
	         case ('A') : return true;
	         case ('E') : return true;
	         case ('I') : return true;
	         case ('O') : return true;
	         case ('U') : return true;
	         default : return false;
	    }
    }
}

