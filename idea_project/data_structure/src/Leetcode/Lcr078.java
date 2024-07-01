package Leetcode;

import java.util.PriorityQueue;

public class Lcr078 {
    //给定一个链表数组，每个链表都已经按升序排列。
    //请将所有链表合并到一个升序链表中，返回合并后的链表

     public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
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

    public  static ListNode mergeKLists(ListNode[] lists) {
        ListNode node=new ListNode();
        ListNode r=node;
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        for(int i=0;i<lists.length;i++) {
            priorityQueue.offer(lists[i].val);
        }
        while (!priorityQueue.isEmpty()){
            Integer temp=priorityQueue.poll();
            for(int i=0;i<lists.length;i++){
                if (lists[i]!=null&&lists[i].val==temp){
                    ListNode t=lists[i];
                    ListNode p=t.next;
                    lists[i]=p;
                    if (p!=null){
                        priorityQueue.offer(p.val);
                    }
                    t.next=null;
                    r.next=t;
                    r=t;
                }
            }
        }
        return node.next;
    }

    public static void main(String[] args) {
         ListNode[] lists=new ListNode[3];

         lists[0]=new ListNode(1,null);
         lists[0].next=new ListNode(4);
         lists[0].next.next=new ListNode(5);

         lists[1]=new ListNode(1,null);
         lists[1].next=new ListNode(3,null);
         lists[1].next.next=new ListNode(4,null);

         lists[2]=new ListNode(2,null);
         lists[2].next=new ListNode(6,null);


        for (int i = 0; i < lists.length; i++) {
            System.out.println(lists[i]);
        }
        ListNode listNode = mergeKLists(lists);
        System.out.println(listNode);
    }
}
