/* 
Problem Statement :

Given an array A of n positive numbers. The task is to find the first Equilibrium Point in an array. 
Equilibrium Point in an array is a position such that the sum of elements before it is equal to 
the sum of elements after it.

Note: Retun the index of Equilibrium point. (1-based index)

Example 1:

Input: 
n = 5 
A[] = {1,3,5,2,2} 
Output: 3 
Explanation:  
equilibrium point is at position 3 
as elements before it (1+3) = 
elements after it (2+2). 

*/
import java.lang.*;
import java.util.*;

public class equilibrium_point
{
    public static void main(String arg[])
    {
        long A[] = {1,3,5,2,2};

        int iRet = equilibriumPoint(A, A.length);

        System.out.println(iRet);
    }

    public static int equilibriumPoint(long arr[], int n) 
    {   
        long totalSum = 0;
        long sumBefore = 0;

        for(int i = 0; i<arr.length; i++)
        {
            totalSum = totalSum + arr[i];
        }

        // substract the current array element from the total array element sum
        // at the equilibrium position the sumBefore and totalSum will become same
        for(int i = 0; i<arr.length; i++)
        {
            totalSum = totalSum - arr[i];

            if(totalSum == sumBefore)
            {
                return (i+1);
            }

            sumBefore = sumBefore + arr[i];
        }

        return -1;
    }    

}