// LeetCode 2264: Largest 3-Same-Digit Number in String
// Difficulty: Easy
// Link: https://leetcode.com/problems/largest-3-same-digit-number-in-string

class Solution {
    public String largestGoodInteger(String num) {
        for(int i=9;i>=0;i--)
        {
            String s=String.valueOf(i);
            s=s.repeat(3);
            if(num.contains(s))
              return s;
        }
        return "";
    }
}