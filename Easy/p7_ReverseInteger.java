// LeetCode 7: Reverse Integer
// Difficulty: Medium
// Link: https://leetcode.com/problems/reverse-integer/

package Easy;
public class p7_ReverseInteger {
    class Solution {
    public int reverse(int x) {
        int d, r = 0;
        int x1 = x;  
        while (x1 != 0) {
            d = x1 % 10;
            x1 = x1 / 10;
            double check = r * 10.0 + d;
            if (check <= -Math.pow(2, 31) || check >= Math.pow(2, 31) - 1) {
                return 0;
            }
            r = r * 10 + d;
        }
        return r;
    }
}
}
