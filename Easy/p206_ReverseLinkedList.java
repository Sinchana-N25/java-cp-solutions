// LeetCode 206: Reverse linked List
// Difficulty: Easy
// Link: https://leetcode.com/problems/reverse-linked-list/

package Easy;
//   Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 

public class p206_ReverseLinkedList {
    class Solution {
    public ListNode reverseList(ListNode head) { 
         ListNode current= head;
         ListNode previous=null;
         ListNode temp=null;
         while(current!=null)
         {  
            temp=current.next;
            current.next=previous;
            previous=current;
            current=temp;
         }
        return previous;
    }
}
}
