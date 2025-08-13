// LeetCode 326: Power of Three
// Difficulty: Easy
// Link: https://leetcode.com/problems/power-of-three

class Solution {
    public boolean isPowerOfThree(int n) {
        for(int i=0;i<20;i++)
        {
          if(Math.pow(3.0,i)==n)
          return true;
        }
        return false;
    }
}