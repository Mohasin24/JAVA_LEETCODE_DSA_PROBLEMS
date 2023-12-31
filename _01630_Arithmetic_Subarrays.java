/* 
Problem Statement :
A sequence of numbers is called arithmetic if it consists of at least two elements, and the difference between every two consecutive elements is the same. More formally, a sequence s is arithmetic if and only if s[i+1] - s[i] == s[1] - s[0] for all valid i.

For example, these are arithmetic sequences:

1, 3, 5, 7, 9
7, 7, 7, 7
3, -1, -5, -9
The following sequence is not arithmetic:

1, 1, 2, 5, 7
You are given an array of n integers, nums, and two arrays of m integers each, l and r, representing the m range queries, where the ith query is the range [l[i], r[i]]. All the arrays are 0-indexed.

Return a list of boolean elements answer, where answer[i] is true if the subarray nums[l[i]], nums[l[i]+1], ... , nums[r[i]] can be rearranged to form an arithmetic sequence, and false otherwise.

 

Example 1:

Input: nums = [4,6,5,9,3,7], l = [0,0,2], r = [2,3,5]
Output: [true,false,true]
Explanation:
In the 0th query, the subarray is [4,6,5]. This can be rearranged as [6,5,4], which is an arithmetic sequence.
In the 1st query, the subarray is [4,6,5,9]. This cannot be rearranged as an arithmetic sequence.
In the 2nd query, the subarray is [5,9,3,7]. This can be rearranged as [3,5,7,9], which is an arithmetic sequence.
Example 2:

Input: nums = [-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10], l = [0,1,6,4,8,7], r = [4,4,9,7,9,10]
Output: [false,true,false,false,true,true]
 

Constraints:

n == nums.length
m == l.length
m == r.length
2 <= n <= 500
1 <= m <= 500
0 <= l[i] < r[i] < n
-105 <= nums[i] <= 105
*/

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class _01630_Arithmetic_Subarrays 
{
    public static void main(String[] args)
    {
        Solution sl = new Solution();
        System.out.println(sl.checkArithmeticSubarrays(new int[] {-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10}, new int[] {0,1,6,4,8,7}, new int[] {4,4,9,7,9,10}));
    }    
}

// Complexity
// Time complexity: O(m * k * log(k)), where m is the number of ranges and k is the average length of the subarrays
// Space complexity: O(m * k)

class Solution {
     // Main method to check arithmetic subarrays
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) 
    {
        // Result list to store the answers for each subarray
        List<Boolean> result = new ArrayList<>();

        // Iterate through each subarray defined by l and r
        for(int i = 0; i < l.length; i++)
        {
            // Extract the current subarray from nums
            int subArr[] = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            
            // Sort the subarray to simplify arithmetic sequence check
            Arrays.sort(subArr);

            // Check if the subarray is an arithmetic sequence and add the result to the list
            result.add(checkSeq(subArr));
        }

        // Return the final list of results
        return result;
    }

    // Helper method to check if an array is an arithmetic sequence
    private boolean checkSeq(int[] subArr)
    {   
        // Calculate the common difference of the arithmetic sequence
        int n = subArr[1] - subArr[0];

        // Iterate through the subarray to check if it forms an arithmetic sequence
        for(int i = 2; i < subArr.length; i++)
        {
            // If the difference between consecutive elements is not equal to the common difference,
            // then the subarray is not an arithmetic sequence
            if(subArr[i] - subArr[i - 1] != n)
            {
                return false;
            }
        }
        
        // If all differences are equal, the subarray is an arithmetic sequence
        return true;
    }
}
