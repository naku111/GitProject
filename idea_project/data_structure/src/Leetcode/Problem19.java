package Leetcode;
public class Problem19 {
    //删除链表的倒数第 N 个结点
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)  return null;
        ListNode p=new ListNode(666,head);
        ListNode fast=p;
        ListNode slow=p;
        while(n>0){
            n--;
            fast=fast.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return p.next;
    }
}
