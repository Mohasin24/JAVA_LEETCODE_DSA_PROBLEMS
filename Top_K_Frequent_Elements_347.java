/* 
Problem Statement :
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.
 

Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Top_K_Frequent_Elements_347 
{
    public static void main(String[] args) 
    {
        Solution sl = new Solution();
        System.out.println(Arrays.toString(sl.topKFrequent(new int[] {1,2}, 2)));
    }    
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i<nums.length; i++)    
        {
            if(hm.containsKey(nums[i]))
            {   
                hm.put(nums[i], hm.get(nums[i])+1);
            }
            else
            {
                hm.put(nums[i], 1);
            }
        }

        System.out.println(hm);
        ArrayList<Integer> al = new ArrayList<>();
        for(Integer x : hm.keySet())
        {
            if(hm.get(x) <= k)
            {
                System.out.println(x);
                al.add(x);
            }
        }

        int[] arr = new int[al.size()];

        for(int i = 0; i<al.size(); i++)
        {
            arr[i] = al.get(i);
        }

        return arr;
    }
}
