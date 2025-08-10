// LeetCode 1295: Find Numbers with Even Number of Digits
// Difficulty: Easy
// Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class p1295_EvenNumberOfDigits {
    class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        String str="";
       for(int i=0;i<nums.length;i++)
        {
            str= Integer.toString(nums[i]);
            if(str.length()%2==0)
            {
                count++;
            }
        };
        return count;
    }
}
}