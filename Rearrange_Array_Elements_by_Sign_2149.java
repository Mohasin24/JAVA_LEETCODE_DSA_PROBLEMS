<<<<<<< HEAD
<<<<<<< HEAD
/* 
Problem Statement : 
You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should rearrange the elements of nums such that the modified array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

 

Example 1:

Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.  
Example 2:

Input: nums = [-1,1]
Output: [1,-1]
Explanation:
1 is the only positive integer and -1 the only negative integer in nums.
So nums is rearranged to [1,-1].
 

Constraints:

2 <= nums.length <= 2 * 105
nums.length is even
1 <= |nums[i]| <= 105
nums consists of equal number of positive and negative integers.

*/

import java.util.*;

public class Rearrange_Array_Elements_by_Sign_2149 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        
        System.out.println(Arrays.toString(sl.rearrangeArray(new int[] {3,1,-2,-5,2,-4})));
    }    
}

class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
        // return new array
        int ret[] = new int[nums.length];

        // two pointers for new array ret
        int j = 0,k = 1;

        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i]>=0)
            {   
                ret[j] = nums[i] ;
                j += 2;
            }
            else
            {
                ret[k] = nums[i] ;
                k += 2;
            }
        }

        return ret;
    }
=======
/* 
Problem Statement : 
You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should rearrange the elements of nums such that the modified array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

 

Example 1:

Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.  
Example 2:

Input: nums = [-1,1]
Output: [1,-1]
Explanation:
1 is the only positive integer and -1 the only negative integer in nums.
So nums is rearranged to [1,-1].
 

Constraints:

2 <= nums.length <= 2 * 105
nums.length is even
1 <= |nums[i]| <= 105
nums consists of equal number of positive and negative integers.

*/

import java.util.*;

public class Rearrange_Array_Elements_by_Sign_2149 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        
        System.out.println(Arrays.toString(sl.rearrangeArray(new int[] {3,1,-2,-5,2,-4})));
    }    
}

class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
        // return new array
        int ret[] = new int[nums.length];

        // two pointers for new array ret
        int j = 0,k = 1;

        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i]>=0)
            {   
                ret[j] = nums[i] ;
                j += 2;
            }
            else
            {
                ret[k] = nums[i] ;
                k += 2;
            }
        }

        return ret;
    }
>>>>>>> d2eb2e624dae8411fa218b7ffa0ff5d350aad689
=======
/* 
Problem Statement : 
You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should rearrange the elements of nums such that the modified array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

 

Example 1:

Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.  
Example 2:

Input: nums = [-1,1]
Output: [1,-1]
Explanation:
1 is the only positive integer and -1 the only negative integer in nums.
So nums is rearranged to [1,-1].
 

Constraints:

2 <= nums.length <= 2 * 105
nums.length is even
1 <= |nums[i]| <= 105
nums consists of equal number of positive and negative integers.

*/

import java.util.*;

public class Rearrange_Array_Elements_by_Sign_2149 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        
        System.out.println(Arrays.toString(sl.rearrangeArray(new int[] {3,1,-2,-5,2,-4})));
    }    
}

class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
        // return new array
        int ret[] = new int[nums.length];

        // two pointers for new array ret
        int j = 0,k = 1;

        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i]>=0)
            {   
                ret[j] = nums[i] ;
                j += 2;
            }
            else
            {
                ret[k] = nums[i] ;
                k += 2;
            }
        }

        return ret;
    }
>>>>>>> d2eb2e624dae8411fa218b7ffa0ff5d350aad689
}