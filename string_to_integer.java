/* 
Problem Statement :
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer 
(similar to C/C++'s atoi function).

The algorithm for myAtoi(string s) is as follows:

Read in and ignore any leading whitespace.
Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character 
in if it is either. This determines if the final result is negative or positive respectively. Assume 
the result is positive if neither is present. Read in next the characters until the next non-digit 
character or the end of the input is reached. The rest of the string is ignored.
Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, 
then the integer is 0. Change the sign as necessary (from step 2).
If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer 
so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, 
and integers greater than 231 - 1 should be clamped to 231 - 1.
Return the integer as the final result.
Note:

Only the space character ' ' is considered a whitespace character.
Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
 

Example 1:

Input: s = "42"
Output: 42
Explanation: The underlined characters are what is read in, the caret is the current reader position.
Step 1: "42" (no characters read because there is no leading whitespace)
         ^
Step 2: "42" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "42" ("42" is read in)
           ^
The parsed integer is 42.
Since 42 is in the range [-231, 231 - 1], the final result is 42.
Example 2:

Input: s = "   -42"
Output: -42
Explanation:
Step 1: "   -42" (leading whitespace is read and ignored)
            ^
Step 2: "   -42" ('-' is read, so the result should be negative)
             ^
Step 3: "   -42" ("42" is read in)
               ^
The parsed integer is -42.
Since -42 is in the range [-231, 231 - 1], the final result is -42.
Example 3:

Input: s = "4193 with words"
Output: 4193
Explanation:
Step 1: "4193 with words" (no characters read because there is no leading whitespace)
         ^
Step 2: "4193 with words" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "4193 with words" ("4193" is read in; reading stops because the next character is a non-digit)
             ^
The parsed integer is 4193.
Since 4193 is in the range [-231, 231 - 1], the final result is 4193.
 

Constraints:

0 <= s.length <= 200
s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'.
*/

import java.lang.*;

public class string_to_integer 
{
    public static void main(String arg[])   
    {   
        Solution sl = new Solution();
        System.out.println(sl.myAtoi("hello worls 775808"));
    }
}

class Solution {
    public int myAtoi(String str) {

        if (str.length() == 0) {
            return 0;
        }

        int index = 0;

        // skipping white spaces
        while (index < str.length() && str.charAt(index) == ' ') {
            ++index;
        }

        System.out.println(index);

        boolean isNegative = false;

        // to handle sign cases
        if (index < str.length()) {

            if (str.charAt(index) == '-') {
                isNegative = true;
                ++index;
            } else if (str.charAt(index) == '+') {
                ++index;
            }

        }

        int result = 0;

        // converting digit(in character form) to integer form
        // iterate until non-digit character is not found or we can say iterate till
        // found character is a digit
        while (index < str.length() && (str.charAt(index)>='0' && str.charAt(index)<='9')) {

            /*
             * str.charAt(index) - '0' is to convert the char digit into int digit eg: '5' -
             * '0' --> 5
             * or else it will store the ASCII value of 5 i.e. 53,
             * so we do 53(ASCII of 5) - 48(ASCII of 0(zero)) to get 5 as int
             */
            int digit = str.charAt(index) - '0';

            // to avoid integer overflow
            if (result > (Integer.MAX_VALUE / 10) || (result == (Integer.MAX_VALUE / 10) && digit > 7)) 
            {
                if(isNegative)    
                {
                    return Integer.MIN_VALUE;
                }
                else
                {
                    return Integer.MAX_VALUE;
                }
              
            }

            // adding digits at their desired place-value
            result = (result * 10) + digit;

            ++index;
        }

        return isNegative ? -result : result;
    }

}