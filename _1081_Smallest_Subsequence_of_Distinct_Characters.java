/* 
Problem Statement :
Given a string s, return the 
lexicographically smallest
 
subsequence
 of s that contains all the distinct characters of s exactly once.

 

Example 1:

Input: s = "bcabc"
Output: "abc"
Example 2:

Input: s = "cbacdcbc"
Output: "acdb"
 

Constraints:

1 <= s.length <= 1000
s consists of lowercase English letters.
*/

import java.util.Stack;

public class _1081_Smallest_Subsequence_of_Distinct_Characters 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        System.out.println(sl.smallestSubsequence("cbacdcbc"));   
    }   
}

class Solution {
    public String smallestSubsequence(String s) 
    {
         // Create an array to store the last occurrence index of each lowercase letter
        int[] lastOcc = new int[26];

        // Populate the lastOcc array with the last occurrence index of each character in 's'
        for (int i = 0; i < s.length(); i++) {
            lastOcc[s.charAt(i) - 'a'] = i;
        }

        Stack<Character> st = new Stack<>();
        // Create a boolean array to track whether a character has been seen
        boolean[] seen = new boolean[26];

        // Iterate through the characters in the input string 's'
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            // Skip the character if it has already been seen
            if (seen[curr - 'a']) {
                continue;
            }

            // Check if there are characters on the stack that should be removed
            while (!st.isEmpty() && curr < st.peek() && i < lastOcc[st.peek() - 'a']) {
                char c = st.pop();
                seen[c - 'a'] = false;
            }

            // Push the current character onto the stack
            st.push(curr);
            seen[curr - 'a'] = true;
        }

        // Create a StringBuilder to build the result string
        StringBuilder sb = new StringBuilder();

        // Pop characters from the stack and append them to the StringBuilder
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        // Reverse the StringBuilder to get the correct order of characters
        return sb.reverse().toString();
    }
}