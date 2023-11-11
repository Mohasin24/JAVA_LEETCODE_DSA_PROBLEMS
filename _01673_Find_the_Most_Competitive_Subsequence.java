/* 
Problem Statement :
Given an integer array nums and a positive integer k, return the most competitive subsequence of nums of size k.

An array's subsequence is a resulting sequence obtained by erasing some (possibly zero) elements from the array.

We define that a subsequence a is more competitive than a subsequence b (of the same length) if in the first position where a and b differ, subsequence a has a number less than the corresponding number in b. For example, [1,3,4] is more competitive than [1,3,5] because the first position they differ is at the final number, and 4 is less than 5.

 

Example 1:

Input: nums = [3,5,2,6], k = 2
Output: [2,6]
Explanation: Among the set of every possible subsequence: {[3,5], [3,2], [3,6], [5,2], [5,6], [2,6]}, [2,6] is the most competitive.
Example 2:

Input: nums = [2,4,3,3,5,4,9,6], k = 4
Output: [2,3,3,4]
 

Constraints:

1 <= nums.length <= 105
0 <= nums[i] <= 109
1 <= k <= nums.length
*/

import java.util.Arrays;
import java.util.Stack;

public class _01673_Find_the_Most_Competitive_Subsequence 
{
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(Arrays.toString(sl.mostCompetitive(new int[]{2,4,3,3,5,4,9,6}, 4)));
    }    
}


class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        // Create a stack to track the most competitive elements
        Stack<Integer> stack = new Stack<>();

        // Iterate through the given array
        for (int i = 0; i < nums.length; i++) {
            // While the stack is not empty, the current element is smaller than the top of the stack,
            // and the remaining elements in the stack and the array are sufficient to form a subsequence of length k
            while (!stack.isEmpty() && stack.peek() > nums[i] && stack.size() - 1 + nums.length - i >= k) {
                // Pop elements from the stack until a suitable position is found
                stack.pop();
            }

            // If the stack size is less than k, add the current element to the stack
            if (stack.size() < k) {
                stack.push(nums[i]);
            }
        }

        // Build the result array from the elements in the stack
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage
        int[] nums = {3, 5, 2, 6};
        int k = 2;
        int[] result = solution.mostCompetitive(nums, k);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
