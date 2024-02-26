package Leetcode;

public class Problem206 {
    //反转单链表
    //反转单链表
    //反转单链表
    
    
    
    public static class ListNode {
     int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) {
          this.val = val;
      }
     ListNode(int val, ListNode next) {
          this.val = val; this.next = next;
      }

        @Override
        public String toString() {
            return val + "->"+next;
        }
    }
    public static ListNode reverseList1(ListNode head) {
        //新建带有头节点的链表,头插法插入
        if(head==null)  return null;
        ListNode p=head;
        ListNode h=new ListNode(666,null);
        while(p!=null){
            h.next=new ListNode(p.val,h.next);
            p=p.next;
        }
        return h.next;
        /*
        不带头节点
        if(head==null)  return null;
        ListNode p=head;
        ListNode h=new ListNode();
        while(p!=null){
            h=new ListNode(p.val,h);
            p=p.next;
        }
        return h;
        * */
    }

    public static ListNode reverseList2(ListNode head) {
        //递归
        if (head == null || head.next == null) {
            return head;
        }
        ListNode last = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

        public static ListNode reverseList3(ListNode head) {
        //以1为轴,每次挪第二个节点
        if(head==null||head.next==null)  return head;
        ListNode o1=head;//1结点
        ListNode o2=head.next;//相对的第二个结点
        ListNode n1=o1;//新的头指针
        while(o2!=null){
            o1.next=o2.next;//将第二个结点孤立出来
            o2.next=n1;//将结点插在新的头部
            n1=o2;//头指针更新
            o2=o1.next;//第二个结点更新
        }
        return n1;
    }
    public static ListNode reverseList4(ListNode head) {
        //每次挪走原链表第一个节点
        if(head==null||head.next==null)  return head;
        ListNode n1=null;
        while(head!=null){
            ListNode o2=head.next;//找到下一个结点位置
            head.next=n1;//将第一个结点插在头部
            n1=head;
            head=o2;
        }
        return n1;
    }

    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(5, null);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);
        System.out.println(listNode1);
        ListNode listNodeA = reverseList1(listNode1);
        System.out.println("==========");
        System.out.println(listNodeA);
        ListNode listNodeB = reverseList2(listNodeA);
        System.out.println("==========");
        System.out.println(listNodeB);
        ListNode listNodeC = reverseList3(listNodeB);
        System.out.println("==========");
        System.out.println(listNodeC);
        ListNode listNodeD = reverseList4(listNodeC);
        System.out.println("==========");
        System.out.println(listNodeD);
    }
}
