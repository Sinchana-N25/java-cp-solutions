// LeetCode 258: Add Digits
// Difficulty: Easy
// Link: https://leetcode.com/problems/add-digits/

public class p258_AddDigits {
    class Solution {
    public int addDigits(int num) {
       if(num<10)
        return num;
       else
       {
       if(num%9==0)
        return 9;
       else
        return num%9;
       }
}
}
}
