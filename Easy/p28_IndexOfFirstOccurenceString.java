// LeetCode 28: Find the Index of the First Occurrence in a String
// Difficulty: Easy
// Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

package Easy;

public class p28_IndexOfFirstOccurenceString {
    class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle))
        {
          return haystack.indexOf(needle);
        }
        else
        return -1;
    }
}
}
