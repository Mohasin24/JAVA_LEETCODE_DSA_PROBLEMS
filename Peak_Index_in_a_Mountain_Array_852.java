<<<<<<< HEAD
<<<<<<< HEAD
/* 
Problem Statement :
An array arr a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

You must solve it in O(log(arr.length)) time complexity.

 

Example 1:

Input: arr = [0,1,0]
Output: 1
Example 2:

Input: arr = [0,2,1,0]
Output: 1
Example 3:

Input: arr = [0,10,5,2]
Output: 1
 

Constraints:

3 <= arr.length <= 105
0 <= arr[i] <= 106
arr is guaranteed to be a mountain array.
*/

public class Peak_Index_in_a_Mountain_Array_852 {
    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.peakIndexInMountainArray(new int[] { 0, 10, 5, 2 }));
    }
}

class Solution {
    public int peakIndexInMountainArray(int[] a) {
        int start = 0;
        int end = a.length;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (a[mid] > a[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}

class Solution2 {
    public int peakIndexInMountainArray(int[] arr) {
        int ans = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[ans] < arr[i]) {
                ans = i;
            } else {
                break;
            }
        }

        return ans;
    }
=======
/* 
Problem Statement :
An array arr a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

You must solve it in O(log(arr.length)) time complexity.

 

Example 1:

Input: arr = [0,1,0]
Output: 1
Example 2:

Input: arr = [0,2,1,0]
Output: 1
Example 3:

Input: arr = [0,10,5,2]
Output: 1
 

Constraints:

3 <= arr.length <= 105
0 <= arr[i] <= 106
arr is guaranteed to be a mountain array.
*/

public class Peak_Index_in_a_Mountain_Array_852 {
    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.peakIndexInMountainArray(new int[] { 0, 10, 5, 2 }));
    }
}

class Solution {
    public int peakIndexInMountainArray(int[] a) {
        int start = 0;
        int end = a.length;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (a[mid] > a[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}

class Solution2 {
    public int peakIndexInMountainArray(int[] arr) {
        int ans = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[ans] < arr[i]) {
                ans = i;
            } else {
                break;
            }
        }

        return ans;
    }
>>>>>>> d2eb2e624dae8411fa218b7ffa0ff5d350aad689
=======
/* 
Problem Statement :
An array arr a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

You must solve it in O(log(arr.length)) time complexity.

 

Example 1:

Input: arr = [0,1,0]
Output: 1
Example 2:

Input: arr = [0,2,1,0]
Output: 1
Example 3:

Input: arr = [0,10,5,2]
Output: 1
 

Constraints:

3 <= arr.length <= 105
0 <= arr[i] <= 106
arr is guaranteed to be a mountain array.
*/

public class Peak_Index_in_a_Mountain_Array_852 {
    public static void main(String[] args) {
        Solution sl = new Solution();

        System.out.println(sl.peakIndexInMountainArray(new int[] { 0, 10, 5, 2 }));
    }
}

class Solution {
    public int peakIndexInMountainArray(int[] a) {
        int start = 0;
        int end = a.length;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (a[mid] > a[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}

class Solution2 {
    public int peakIndexInMountainArray(int[] arr) {
        int ans = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[ans] < arr[i]) {
                ans = i;
            } else {
                break;
            }
        }

        return ans;
    }
>>>>>>> d2eb2e624dae8411fa218b7ffa0ff5d350aad689
}