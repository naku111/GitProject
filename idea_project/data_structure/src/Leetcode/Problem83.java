package Leetcode;
public class Problem83 {
    //删除排序链表的重复元素
     public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if(head==null||head.next==null) return head;
            ListNode h=head;
            ListNode p=head;
            ListNode p1=head.next;

            while(p!=null&&p1!=null){
                if(p.val==p1.val){
                    ListNode l=p1.next;
                    p.next=l;
                    p1=l;
                }
                else{
                    p=p.next;
                    p1=p1.next;
                }
            }
            return h;
        }
    }
}
