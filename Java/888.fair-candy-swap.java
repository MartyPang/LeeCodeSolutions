import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=888 lang=java
 *
 * [888] Fair Candy Swap
 */
class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        //Set<Integer> seta = new HashSet<>();
        Set<Integer> setb = new HashSet<>();
        int suma = 0, sumb = 0;
        for(int a : A) {
            //seta.add(a);
            suma += a;
        }
        for(int b : B) {
            setb.add(b);
            sumb += b;
        }
        int diff = (suma - sumb) / 2;
        int[] ans = new int[2];
        for(int a : A) {
            if(setb.contains(a-diff)) {
                ans[0] = a;
                ans[1] = a-diff;
                break;
            }
        }
        return ans;
    }
}

