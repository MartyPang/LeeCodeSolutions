import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
/*
 * @lc app=leetcode id=599 lang=java
 *
 * [599] Minimum Index Sum of Two Lists
 */
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < list1.length; ++i) {
            map.put(list1[i], i);
        }
        int minIndex = 3000;
        List<String> res = new ArrayList<>();
        for(int i = 0; i < list2.length; ++i) {
            if(map.containsKey(list2[i])) {
                if(map.get(list2[i]) + i < minIndex) {
                    res.clear();
                    res.add(list2[i]);
                    minIndex = map.get(list2[i]) + i;
                }
                else if(map.get(list2[i]) + i == minIndex) {
                    res.add(list2[i]);
                }
            }
        }
        return res.toArray(new String[0]);
    }
}

