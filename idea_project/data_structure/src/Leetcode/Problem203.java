package Leetcode;
public class Problem203 {
    //移除链表元素
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)  return null;
        ListNode p=new ListNode(666,null);
        p.next=head;
        ListNode pre=p;
        ListNode cur=p.next;
        while(cur!=null){
            if(cur.val==val){
                pre.next=cur.next;
                cur=pre.next;
            }else{
                pre=pre.next;
                cur=cur.next;
            }
        }
        // if(cur.val==val&&cur.next==null)
        //     pre.next=null;
        return p.next;
    }
}
