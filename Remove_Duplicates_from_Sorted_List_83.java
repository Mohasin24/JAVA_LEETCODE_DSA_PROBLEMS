/* 
Problem Statement :
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

Example 1:


Input: head = [1,1,2]
Output: [1,2]
Example 2:


Input: head = [1,1,2,3,3]
Output: [1,2,3]
 

Constraints:

The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.
*/

public class Remove_Duplicates_from_Sorted_List_83 
{

    public static void display(ListNode head)
    {
        ListNode temp = head;

        while(temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(1);
        ListNode a3 = new ListNode(2);
        ListNode a4 = new ListNode(3);
        ListNode a5 = new ListNode(3);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;

        Solution sl = new Solution();
        
        display(sl.deleteDuplicates(a1));
    }    
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) 
    {
        ListNode temp = head;

        while(temp != null)    
        {
            if(temp.next != null && temp.val == temp.next.val)
            {
                temp.next = temp.next.next;
            }
            else
            {
                temp = temp.next;
            }
        }

        return head;
    }
}

class ListNode 
{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}