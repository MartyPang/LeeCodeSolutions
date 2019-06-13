import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;

/*
 * @lc app=leetcode id=788 lang=java
 *
 * [788] Rotated Digits
 */
class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    public int rotatedDigits(int N) {
        map.put(0, 0);
        map.put(1, 1);
        map.put(8, 8);
        map.put(2, 5);
        map.put(5, 2);
        map.put(6, 9);
        map.put(9, 6);

        int cnt = 0;
        for(int i = 2; i <= N; ++i) {
            int r = rotate(i);
            if(r != -1 && r != i) cnt++;
        }
        return cnt;
    }

    private int rotate(int num) {
        int digit = 1;
        int res = 0;
        while(num != 0) {
            int tail = num % 10;
            if(map.containsKey(tail)) {
                res += map.get(tail)*digit;
                digit *= 10;
                num /= 10;
            }
            else return -1;
        }
        return res;
    }
}

