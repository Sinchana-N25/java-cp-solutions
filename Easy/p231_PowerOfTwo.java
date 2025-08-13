// LeetCode 231: Power of Two
// Difficulty: Easy
// Link: https://leetcode.com/problems/power-of-two

public class p231_PowerOfTwo {
    class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n>0 && (1073741824%n==0));
    }
}
}
