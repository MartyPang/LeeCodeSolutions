/*
 * @lc app=leetcode id=605 lang=java
 *
 * [605] Can Place Flowers
 */
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 0) return false;
        if(n == 0) return true;
        if(flowerbed.length == 1) return flowerbed[0] == 0 && n <= 1;
        int available = 0;
        for(int i = 0; i < flowerbed.length; ++i) {
            if(i == 0) {
                if(flowerbed[i] == 0 && flowerbed[i+1] != 1) {
                    available++;
                    flowerbed[i] = 1;
                }
                
            }
            else if(i == flowerbed.length - 1) {
                if(flowerbed[i] == 0 && flowerbed[i-1] != 1) available++;
            }
            else {
               if(flowerbed[i] != 1 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                    available++;
                    flowerbed[i] = 1;
                } 
            } 
        }
        return available >= n;
    }
}

