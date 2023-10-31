/* 
Problem Statement :
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

 

Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
 

Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104
*/
public class _0011_Container_With_Most_Water
{
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }    
}

class Solution {
    public int maxArea(int[] height) {
        int i = 0;               // Initialize the left pointer.
        int j = height.length-1; // Initialize the right pointer.
        int maxArea = 0;         // Initialize the maximum area.

        while(i < j) {
            int w = j - i;        // Calculate the width between the two pointers.
            int h = Math.min(height[i], height[j]); // Calculate the height, which is the minimum of the two heights.
            int area = w * h;     // Calculate the current area.

            maxArea = Math.max(area, maxArea); // Update the maximum area.

            if (height[i] < height[j]) {
                i++; // Move the left pointer to the right, hoping to find a taller wall.
            } else {
                j--; // Move the right pointer to the left, hoping to find a taller wall.
            }
        }

        return maxArea; // Return the maximum area found.
    }
}
