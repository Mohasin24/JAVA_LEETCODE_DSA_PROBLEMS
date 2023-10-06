/* 
Problem Statement :
Given a binary array nums, you should delete one element from it.

Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.

 

Example 1:

Input: nums = [1,1,0,1]
Output: 3
Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
Example 2:

Input: nums = [0,1,1,1,0,1,1,0,1]
Output: 5
Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
Example 3:

Input: nums = [1,1,1]
Output: 2
Explanation: You must delete one element.
 

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
*/

public class Longest_Subarray_of_1_After_Deleting_One_Element_1493 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        
        System.out.println(sl.longestSubarray(new int[] {0,1,1,1,0,1,1,0,1}));
    }    
}

class Solution {
    public int longestSubarray(int[] nums) 
    {
        int left = 0, right = 0;
        int zeroCnt = 0, winSize = 0;

        while(right < nums.length)    
        {
            if(nums[right] == 0)
            {
               zeroCnt++; 
            }

            right++;

            while(zeroCnt > 1)
            {
                if(nums[left] == 0)
                {
                    zeroCnt--;
                }
                left++;
            }

            int currSize = right - left;

            winSize = currSize>winSize? winSize = currSize : winSize;
        }
        return winSize - 1;
    }
}