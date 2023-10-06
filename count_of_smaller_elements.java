/* 
Problem Statement :
Given an sorted array A of size N. Find number of elements which are less than or 
equal to given element X.

Example 1:

Input:
N = 6
A[] = {1, 2, 4, 5, 8, 10}
X = 9
Output:
5
*/

import java.lang.*;
import java.util.*;

public class count_of_smaller_elements 
{
    public static void main(String arg[])    
    {
        long A[] = {1, 2, 4, 5, 8, 10};

        long elem = 8;

        long iRet = countOfElements(A, A.length, elem);

        System.out.println(iRet);
    }
    public static long countOfElements(long arr[], long n, long x)
    {
        long count = 0;
        
        for(int i = 0; i<n; i++)
        {
            if(arr[i]<=x)
            {
                count++;
            }
        }
        
        return  count;
        
    }

}
