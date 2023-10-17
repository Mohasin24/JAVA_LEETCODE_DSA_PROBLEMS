/* 
Problem Statement :
Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is 
the smallest in lexicographical order
 among all possible results.

 

Example 1:

Input: s = "bcabc"
Output: "abc"
Example 2:

Input: s = "cbacdcbc"
Output: "acdb"
 

Constraints:

1 <= s.length <= 104
s consists of lowercase English letters
*/

import java.util.Stack;

public class _0316_Remove_Duplicate_Letters
{
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.removeDuplicateLetters("cbacdcbc"));   
    }
}

class Solution {
    public String removeDuplicateLetters(String s) {
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
