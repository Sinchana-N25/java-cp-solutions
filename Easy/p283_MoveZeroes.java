// LeetCode 283: Move Zeroes
// Difficulty: Easy
// Link: https://leetcode.com/problems/move-zeroes/

package Easy;
import java.util.*;
public class p283_MoveZeroes {

     class Solution {
    public void moveZeroes(int[] nums) {
        int pos=0;
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]!=0)
          {
            nums[pos]=nums[i];
            pos++;
          }
        }
        for(int i=pos;i<nums.length;i++)
        {
            nums[i]=0;
        }
        System.out.println(nums);
    }
}
}
