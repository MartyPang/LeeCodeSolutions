import java.util.LinkedList;

/*
 * @lc app=leetcode id=905 lang=java
 *
 * [905] Sort Array By Parity
 */
class Solution {
    public int[] sortArrayByParity(int[] A) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int a : A) {
            if(a %2 == 0) list.addFirst(a);
            else list.addLast(a);
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); ++i) res[i] = list.get(i);
        return res;
    }
}

