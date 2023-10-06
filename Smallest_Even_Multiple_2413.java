<<<<<<< HEAD
<<<<<<< HEAD
/* 
Problem Statement :
Given a positive integer n, return the smallest positive integer that is a 
multiple of both 2 and n.
 
Example 1:

Input: n = 5
Output: 10
Explanation: The smallest multiple of both 5 and 2 is 10.
Example 2:

Input: n = 6
Output: 6
Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number is 
a multiple of itself.
 
Constraints:

1 <= n <= 150
*/

import java.lang.*;

public class Smallest_Even_Multiple_2413 {
    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.smallestEvenMultiple(7));
    }
}

class Solution {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        } else {
            return (n * 2);
        }
    }
=======
/* 
Problem Statement :
Given a positive integer n, return the smallest positive integer that is a 
multiple of both 2 and n.
 
Example 1:

Input: n = 5
Output: 10
Explanation: The smallest multiple of both 5 and 2 is 10.
Example 2:

Input: n = 6
Output: 6
Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number is 
a multiple of itself.
 
Constraints:

1 <= n <= 150
*/

import java.lang.*;

public class Smallest_Even_Multiple_2413 {
    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.smallestEvenMultiple(7));
    }
}

class Solution {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        } else {
            return (n * 2);
        }
    }
>>>>>>> d2eb2e624dae8411fa218b7ffa0ff5d350aad689
=======
/* 
Problem Statement :
Given a positive integer n, return the smallest positive integer that is a 
multiple of both 2 and n.
 
Example 1:

Input: n = 5
Output: 10
Explanation: The smallest multiple of both 5 and 2 is 10.
Example 2:

Input: n = 6
Output: 6
Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number is 
a multiple of itself.
 
Constraints:

1 <= n <= 150
*/

import java.lang.*;

public class Smallest_Even_Multiple_2413 {
    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.smallestEvenMultiple(7));
    }
}

class Solution {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        } else {
            return (n * 2);
        }
    }
>>>>>>> d2eb2e624dae8411fa218b7ffa0ff5d350aad689
}