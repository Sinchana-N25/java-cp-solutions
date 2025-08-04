// LeetCode 485: Max Consecutive Ones
// Difficulty: Easy
// Link: https://leetcode.com/problems/max-consecutive-ones/
package Easy;
public class p485_MaxConsecutiveOnes{
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
          int most=0;
          int i,j=0;
          for(i=0;i<nums.length;i++)
        {
           if(nums[i]==1)
           {
            j++;
           }
        else if(nums[i]==0)
        { 
            if(j>most)
            {
            most=j;
            }
            j=0;
        }
        }
        return Math.max(j,most);
}
}
}