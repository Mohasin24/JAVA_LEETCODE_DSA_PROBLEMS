/* 
Problem Statement :
Given an integer number n, return the difference between the product of its digits 
and the sum of its digits.
 

Example 1:

Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15
Example 2:

Input: n = 4421
Output: 21
Explanation: 
Product of digits = 4 * 4 * 2 * 1 = 32 
Sum of digits = 4 + 4 + 2 + 1 = 11 
Result = 32 - 11 = 21
*/

public class diff_prod_sum 
{
    public static void main(String arg[])
    {
        int N = 234;

        int iRet = subtractProductAndSum(N);

        System.out.println(iRet);
    }
    public static int subtractProductAndSum(int n) 
    {
        int sum = 0;
        int prod = 1;
        int diff = 0;

        int remainder = 0;

        while(n>0)
        {   
            remainder = n%10;

            sum = sum + remainder;
            prod = prod * remainder;

            n = n/10;
        }    

        diff = prod - sum;
        return diff;
    }    
}
