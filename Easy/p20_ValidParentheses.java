// LeetCode 20: Valid Parentheses
// Difficulty: Easy
// Link: https://leetcode.com/problems/valid-parentheses/

import java.util.ArrayDeque;
import java.util.Deque;
public class p20_ValidParentheses {
    class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int len = s.length();
        if(len%2==0)
        {
           for(int i=0;i<len;i++)
           {
            char ch = s.charAt(i);
              if((ch=='(')||(ch=='[')||(ch=='{'))
                stack.push(ch);
              else if((ch==')')||(ch==']')||(ch=='}'))
              {
                if(stack.isEmpty())
                return false;
                char top = stack.peek();
                switch(ch)
                {
                    case ')': if(top=='(')
                                stack.pop();
                               else
                                return false;
                              break;
                    case ']': if(top=='[')
                                stack.pop();
                               else
                                return false;
                              break;
                    case '}': if(top=='{')
                                stack.pop();
                               else
                                return false;
                              break;
                }
              }
           }
           if(stack.isEmpty()==true)
           return true;
           else
           return false;
        }
        else
        {
            return false;
        }
    }
}
}
