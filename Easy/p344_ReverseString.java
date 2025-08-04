// LeetCode 344: Reverse String
// Difficulty: Easy
// Link:https://leetcode.com/problems/reverse-string/description/

package Easy;

public class p344_ReverseString {
    class Solution {
    public void reverseString(char[] s) {
        int len=s.length;
        int j=len-1;
        int i=0;
        while(i<j)
        {
            char temp=s[j];
            s[j]=s[i];
            s[i]=temp;
            i++;
            j--;
        }
        System.out.println(s);
    }
}
}
