/*
Problem Statement : 
Given an integer n, return the number of prime numbers that are strictly less than n.

Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
Example 2:

Input: n = 0
Output: 0
Example 3:

Input: n = 1
Output: 0
 

Constraints:

0 <= n <= 5 * 106
*/

import java.util.Arrays;

public class _0204_Count_Primes
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();

        sl.countPrimes(25);
        
    }
}

// Complexity
// Time complexity: O(n * log(log(n)))
// Space complexity: O(n)

class Solution {
    public int countPrimes(int n) {
        // Handle the base case where n is less than 3
        if (n < 3) {
            return 0;
        }

        // Create a boolean array to track whether each number is prime or not
        boolean[] isPrime = new boolean[n + 1];

        // Iterate through numbers starting from 2 (the first prime)
        // up to the square root of n
        for (int i = 2; i * i < n; i++) {
            // If i is marked as not prime, it's not a prime number, so skip it
            if (!isPrime[i]) {
                // Mark all multiples of i as not prime
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        // Count the number of prime numbers
        int cnt = 0;
        for (int i = 2; i < n; i++) {
            // If a number is not marked as not prime, it's prime
            if (!isPrime[i]) {
                cnt++;
            }
        }

        return cnt;
    }
}