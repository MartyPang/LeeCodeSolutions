/*
 * @lc app=leetcode id=860 lang=java
 *
 * [860] Lemonade Change
 */
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] money = new int[2];
        for(int i = 0; i < bills.length; ++i) {
            if(bills[i] - 5 == 0) {
                money[0]++;
            }
            else if(bills[i] - 5 == 5) {
                if(money[0] == 0) return false;
                money[0]--;
                money[1]++;
            }
            else {
                if(money[1] == 0) {
                    if(money[0] < 3) return false;
                    money[0] -= 3;
                }
                else {
                    if(money[0] == 0) return false;
                    money[1]--;
                    money[0]--;
                }
            }
        }
        return true;
    }
}

