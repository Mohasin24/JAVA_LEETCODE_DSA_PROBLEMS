/* 
Problem Statement :
Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and next is a pointer/reference to the next node.
If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.

Implement the MyLinkedList class:

MyLinkedList() Initializes the MyLinkedList object.
int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
void addAtHead(int val) Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
void addAtTail(int val) Append a node of value val as the last element of the linked list.
void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list. If index equals the length of the linked list, the node will be appended to the end of the linked list. If index is greater than the length, the node will not be inserted.
void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.
 

Example 1:

Input
["MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get"]
[[], [1], [3], [1, 2], [1], [1], [1]]
Output
[null, null, null, null, 2, null, 3]

Explanation
MyLinkedList myLinkedList = new MyLinkedList();
myLinkedList.addAtHead(1);
myLinkedList.addAtTail(3);
myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
myLinkedList.get(1);              // return 2
myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
myLinkedList.get(1);              // return 3
 

Constraints:

0 <= index, val <= 1000
Please do not use the built-in LinkedList library.
At most 2000 calls will be made to get, addAtHead, addAtTail, addAtIndex and deleteAtIndex.

*/

public class _0707_Design_Linked_List 
{
    public static void main(String[] args) 
    {
        MyLinkedList ll = new MyLinkedList();
        
        // ["MyLinkedList","addAtHead","addAtHead","addAtHead","addAtIndex","deleteAtIndex","addAtHead","addAtTail","get","addAtHead","addAtIndex","addAtHead"]
// [[],[7],[2],[1],[3,0],[2],[6],[4],[4],[4],[5,0],[6]]
        
        
        ll.addAtHead(10);
        ll.addAtIndex(0, 10);
        

        ll.display();
        System.out.println(ll.size());
    }    
}

class MyLinkedList 
{
    private int len = 0;

    private class Node
    {
        public int val; 
        public Node next;

        public Node(int val)
        {
            this.val = val;
            this.next = null;
            len++;
        }
    }

    private Node head;
    private Node tail;

    public MyLinkedList() 
    {
        this.head = null;
        this.tail = null;    
    }
    
    public int get(int index) 
    {
        Node temp = this.head;

        for(int i = 0; i<index; i++)
        {
            temp = temp.next;
        }

        return temp.val;
    }
    
    public void addAtHead(int val) 
    {
        Node temp = new Node(val);

        if(head == null)
        {
            head = temp;
            tail = head;
        }    
        else
        {
            temp.next = head;
            head = temp;
        }
    }
    
    public void addAtTail(int val) 
    {
        Node temp = new Node(val);

        if(tail == null) 
        {
            tail = temp;
            head = temp;
        }
        else
        {
            tail.next = temp;
            tail = temp;
        }
    }
    
    public void addAtIndex(int index, int val) 
    {
        if(head == null || index<0)
        {
            return;
        }
        
        if(index == 0)
        {
            addAtHead(val);
            return;
        }
        else if(index >= len)
        {
            addAtTail(val);
            return;
        }    
        else
        {
            Node curr = new Node(val);
            Node temp = this.head;

            for(int i = 0; i<index-1; i++)
            {
                temp = temp.next;
            }

            curr.next = temp.next;
            temp.next = curr;
           
        }
    }
    
    public void deleteAtIndex(int index) 
    {
        if(head == null || index>=len)
        {
            return;
        }

        if(index == 0)
        {
            head = head.next;
        }    
        else
        {
            Node temp = this.head;

            for(int i = 0; i<index-1; i++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;
        }

        len--;
    }

    public int size()
    {
        return len;
    }

    public void display()
    {
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
