import java.util.Deque;
import java.util.LinkedList;

public class _0239_Sliding_Window_Maximum {
    
}


class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int resultIndex = 0;
        
        Deque<Integer> deque = new LinkedList<>(); // Store indices
        
        for (int i = 0; i < n; i++) {
            // Remove elements that are out of the current window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }
            
            // Remove smaller elements as they are not candidates for maximum
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            
            deque.offerLast(i); // Add the current index to the deque
            
            // The front element of the deque is the maximum in the current window
            if (i >= k - 1) {
                result[resultIndex++] = nums[deque.peekFirst()];
            }
        }
        
        return result;
    }
}
