// LeetCode 58: Length of Last Word
// Difficulty: Easy
// Link:https://leetcode.com/problems/length-of-last-word

package Easy;
public class p58_LengthOfLastWord{
class Solution {
    public int lengthOfLastWord(String s) {
    s=s.trim();
    String s1="";
    int len=s.length();
    for(int i=len-1;i>=0;i--)
    {
      char ch=s.charAt(i);
    if(Character.isLetter(ch))
    {
      s1+=ch;
      }
    else
    break;
    }
    return s1.length();
}
}
}