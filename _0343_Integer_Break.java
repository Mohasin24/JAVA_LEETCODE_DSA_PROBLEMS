/* 
Problem Statement :
Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers.

Return the maximum product you can get.

 

Example 1:

Input: n = 2
Output: 1
Explanation: 2 = 1 + 1, 1 × 1 = 1.
Example 2:

Input: n = 10
Output: 36
Explanation: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36.
 

Constraints:

2 <= n <= 58
*/

public class _0343_Integer_Break
{
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.integerBreak(58));
    }
}

class Solution {
    public int integerBreak(int n) 
    {
        // Base cases: If n is 2 or 3, return (n-1) as per problem requirements.
        if (n == 2 || n == 3) {
            return (n - 1);
        }

        // Initialize a result variable to 1.
        int res = 1;

        // Keep removing parts of size 3 while n is greater than 4.
        while (n > 4)
        {
            // Subtract 3 from n to break it into a part of size 3.
            n -= 3;

            // Multiply the result by 3, as part of size 3 is being added.
            res *= 3; // Keep multiplying 3 to res
        }
    
        // Multiply the remaining n with the result to get the final product.
        return (n * res);
    }
}
