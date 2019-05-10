import java.util.Set;

/*
 * @lc app=leetcode id=575 lang=java
 *
 * [575] Distribute Candies
 */
class Solution {
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for(int candy : candies) {
            set.add(candy);
        }
        return Math.min(candies.length/2, set.size());
    }
}

