// LeetCode 1323: Maximum 69 Number
// Difficulty: Easy
// Link: https://leetcode.com/problems/maximum-69-number

class Solution {
    public int maximum69Number (int num) {
        String str = Integer.toString(num);
        StringBuilder sb = new StringBuilder();
        boolean replaced = false;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch=='6' && !replaced)
            {
            sb.append('9');
            replaced = true;
            }
            else
            sb.append(ch);
        }
        str = sb.toString();
        num = Integer.parseInt(str);
        return num;
    }
}