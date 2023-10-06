<<<<<<< HEAD
<<<<<<< HEAD
/* 
Problem Statement :
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.

 

Example 1:

Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11
Example 2:

Input: nums = [1,2,3]
Output: -1
Explanation:
There is no index that satisfies the conditions in the problem statement.
Example 3:

Input: nums = [2,1,-1]
Output: 0
Explanation:
The pivot index is 0.
Left sum = 0 (no elements to the left of index 0)
Right sum = nums[1] + nums[2] = 1 + -1 = 0
*/

public class _0724_Find_Pivot_Index 
{
    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.pivotIndex(new int[] {1,7,3,6,5,6}));
    }    
}

class Solution {
    public int pivotIndex(int[] nums) 
    {
        int n = nums.length;
        int lSum = 0;
        int rtSum = 0;

        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        for(int i = 0; i<n; i++)
        {
            lSum += nums[i];
            rtSum += nums[n-i-1];

            leftSum[i] = lSum;
            rightSum[n-i-1] = rtSum;
        }

        for(int i = 0; i<n; i++)
        {
            if(leftSum[i]==rightSum[i])
            {
                return i;
            }
        }
        return -1;

    }
=======
/* 
Problem Statement :
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.

 

Example 1:

Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11
Example 2:

Input: nums = [1,2,3]
Output: -1
Explanation:
There is no index that satisfies the conditions in the problem statement.
Example 3:

Input: nums = [2,1,-1]
Output: 0
Explanation:
The pivot index is 0.
Left sum = 0 (no elements to the left of index 0)
Right sum = nums[1] + nums[2] = 1 + -1 = 0
*/

public class _0724_Find_Pivot_Index 
{
    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.pivotIndex(new int[] {1,7,3,6,5,6}));
    }    
}

class Solution {
    public int pivotIndex(int[] nums) 
    {
        int n = nums.length;
        int lSum = 0;
        int rtSum = 0;

        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        for(int i = 0; i<n; i++)
        {
            lSum += nums[i];
            rtSum += nums[n-i-1];

            leftSum[i] = lSum;
            rightSum[n-i-1] = rtSum;
        }

        for(int i = 0; i<n; i++)
        {
            if(leftSum[i]==rightSum[i])
            {
                return i;
            }
        }
        return -1;

    }
>>>>>>> d2eb2e624dae8411fa218b7ffa0ff5d350aad689
=======
/* 
Problem Statement :
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.

 

Example 1:

Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11
Example 2:

Input: nums = [1,2,3]
Output: -1
Explanation:
There is no index that satisfies the conditions in the problem statement.
Example 3:

Input: nums = [2,1,-1]
Output: 0
Explanation:
The pivot index is 0.
Left sum = 0 (no elements to the left of index 0)
Right sum = nums[1] + nums[2] = 1 + -1 = 0
*/

public class _0724_Find_Pivot_Index 
{
    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.pivotIndex(new int[] {1,7,3,6,5,6}));
    }    
}

class Solution {
    public int pivotIndex(int[] nums) 
    {
        int n = nums.length;
        int lSum = 0;
        int rtSum = 0;

        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        for(int i = 0; i<n; i++)
        {
            lSum += nums[i];
            rtSum += nums[n-i-1];

            leftSum[i] = lSum;
            rightSum[n-i-1] = rtSum;
        }

        for(int i = 0; i<n; i++)
        {
            if(leftSum[i]==rightSum[i])
            {
                return i;
            }
        }
        return -1;

    }
>>>>>>> d2eb2e624dae8411fa218b7ffa0ff5d350aad689
}