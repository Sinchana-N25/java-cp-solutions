// LeetCode 9: Palindrome Number
// Difficulty: Easy
// Link: https://leetcode.com/problems/palindrome-number/

package Easy;
public class p9_PalindromeNumber {
    class Solution {
    public boolean isPalindrome(int x) {
        int d,r=0;
        int x1=x;
        if(x1<0)
        {
            return false;
        }
        else if(x1>0)
        {
        while(x1>0)
        {
            d=x1%10;
            x1=x1/10;
            r=r*10+d;
        }
        if(x==r)
        {
            return true;
        }
        else
        {
            return false;
        }
        }
        else
        {
            return true;
        }
    }
}
}
