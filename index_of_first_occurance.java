/* 
Problem Statement :
Given two strings needle and haystack, return the index of the first occurrence of 
needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.

*/

import java.lang.*;

public class index_of_first_occurance 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();

        int iRet = sl.strStr("sabutsa", "sad");

        System.out.println(iRet);
    }
}

class Solution {
    public int strStr(String h, String n) 
    {
        int index = 0;
        int j = 0;
        boolean check = false;

        for(int i = 0; i<h.length(); i++)
        {   

            if((h.charAt(i)==n.charAt(j)) && j<n.length())
            {
                index = i-j;
                System.out.println("j : " +  n.charAt(j));
                System.out.println("i : " +  h.charAt(i));
                j++;


                
                // if(j==n.length())
                // {
                //     break;
                // }
                
            }
            else if(j!=n.length()-1 && i==h.length()-1)
            {
                System.out.println("else if");
                check = false;
                // return -1;
            }
            else
            {
                j = 0;
                check = false;
            }

            
        }

        if(j<n.length()-1)
        {
            return -1;
        }
        return index;
    }
}