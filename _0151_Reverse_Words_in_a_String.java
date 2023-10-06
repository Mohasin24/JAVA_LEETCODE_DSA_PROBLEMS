/* 
Problem Statement :

Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 

Constraints:

1 <= s.length <= 104
s contains English letters (upper-case and lower-case), digits, and spaces ' '.
There is at least one word in s.
 
*/

import java.util.Stack;
public class _0151_Reverse_Words_in_a_String 
{
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.reverseWords("the sky is blue"));
    }    
}

class Solution 
{
   public String reverseWords(String s) 
    {
        String[] arr = s.split(" +");
        StringBuilder sb = new StringBuilder();

        for(int i = arr.length-1; i>=0; i--)
        {
            sb.append(arr[i] + " ");
        }

        return sb.toString().trim();
    }
}

class Solution1
{
   public String reverseWords(String s) 
    {
        Stack<String> st = new Stack<>();
        String t = "";

        for(int i = 0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c==' ')
            {
                if(!t.equals(""))
                {
                    st.push(t);
                    t="";
                }
            }
            else if(c!=' ')
            {
                t = t+c;
            }
    
        }
        st.push(t);
        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty())
        {
            sb.append(st.pop()).append(" ");
        }
       
        return sb.toString().trim();
    }
}