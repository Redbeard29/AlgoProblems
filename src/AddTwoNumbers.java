import java.util.LinkedList;

public class AddTwoNumbers {
    /*
    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
    order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list
    that matches the pattern above (digits in reverse order). You may assume the two numbers do not contain any leading
    zeros, unless the number is exactly equal to 0.

    Ex 1:
    Input: l1 = [2, 4, 3], l2 = [5, 6, 4]
    Output: [7, 0, 8]
    Explanation: 342 + 465 = 807

    Ex 2:
    Input: l1 = [0], l2 = [0]
    Output: [0]

    Ex 3:
    Input: l1 = [9, 9, 9, 9, 9, 9, 9], l2 = [9, 9, 9, 9]
    Output: [8, 9, 9, 9, 0, 0, 0, 1]
     */


    /*
    Approach - reverse the linked list, then convert to an array if need be, and join the values to create num1. Do the same
    for num2, then add them together to get sum. Finally, if it's still a linked list, reverse it. If it's an array,
    loop through the array backwards, adding each element as the value of a linked list node.
     */
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next){this.val = val; this.next = next;}
    }

    public static void main(String[] args){

    }

}
