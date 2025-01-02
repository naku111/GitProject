package Leetcode;

import java.util.Iterator;

public class Problem707 {
    //设计链表
    //单链表
    public static class MyLinkedList implements Iterable<Integer>{

        Node head;

        @Override
        public Iterator<Integer> iterator() {
            return new Iterator<Integer>() {
                Node p=head.next;
                @Override
                public boolean hasNext() {
                    return p!=null;
                }

                @Override
                public Integer next() {
                    int val=p.val;
                    p=p.next;
                    return val;
                }
            };
        }

        private static class Node{
            int val;
            Node next;
            public Node(int val,Node next){
                this.val=val;
                this.next=next;
            }
        }

        public MyLinkedList() {
            head=new Node(666,null);
        }

        public int get(int index) {
            if(index<0){
                return -1;
            }
            Node p=head;
            int i=-1;
            while (i<index&&p!=null){
                p=p.next;
                i++;
            }
            if(p==null){
                return -1;
            }else return p.val;

        }

        public void addAtHead(int val) {
            head.next=new Node(val,head.next);
        }

        public void addAtTail(int val) {
            Node p=head;
            while (p.next!=null){
                p=p.next;
            }
            p.next=new Node(val,null);
        }

        public void addAtIndex(int index, int val) {
            if (index < 0) return; // index 无效

            int i = -1;
            Node cur = head;
            Node pre = null; // 保存上一个节点

            while (i < index && cur != null) {
                pre = cur;
                cur = cur.next;
                i++;
            }

            if (i == index) { // 插入位置合法
                Node newNode = new Node(val, cur);
                pre.next = newNode;
            } else if (cur == null && i == index) { // 插入到末尾
                pre.next = new Node(val, null);
            }
        }


        public void deleteAtIndex(int index) {
            if (index < 0) return; // index 无效

            int i = -1;
            Node cur = head;
            Node pre = null; // 保存上一个节点

            while (i < index && cur != null) {
                pre = cur;
                cur = cur.next;
                i++;
            }

            if (cur == null) return; // index 无效

            // 删除节点
            if (pre != null) {
                pre.next = cur.next;
            }
        }

    }
    //双向链表
    public static class MyLinkedList_1 {
        class ListNode {
            int val;
            ListNode next,prev;
            ListNode(int x) {val = x;}
        }

        int size;
        ListNode head,tail;//Sentinel node

        /** Initialize your data structure here. */
        public MyLinkedList_1() {
            size = 0;
            head = new ListNode(0);
            tail = new ListNode(0);
            head.next = tail;
            tail.prev = head;
        }

        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        public int get(int index) {
            if(index < 0 || index >= size){return -1;}
            ListNode cur = head;

            // 通过判断 index < (size - 1) / 2 来决定是从头结点还是尾节点遍历，提高效率
            if(index < (size - 1) / 2){
                for(int i = 0; i <= index; i++){
                    cur = cur.next;
                }
            }else{
                cur = tail;
                for(int i = 0; i <= size - index - 1; i++){
                    cur = cur.prev;
                }
            }
            return cur.val;
        }

        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {
            ListNode cur = head;
            ListNode newNode = new ListNode(val);
            newNode.next = cur.next;
            cur.next.prev = newNode;
            cur.next = newNode;
            newNode.prev = cur;
            size++;
        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            ListNode cur = tail;
            ListNode newNode = new ListNode(val);
            newNode.next = tail;
            newNode.prev = cur.prev;
            cur.prev.next = newNode;
            cur.prev = newNode;
            size++;
        }

        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {
            if(index > size){return;}
            if(index < 0){index = 0;}
            ListNode cur = head;
            for(int i = 0; i < index; i++){
                cur = cur.next;
            }
            ListNode newNode = new ListNode(val);
            newNode.next = cur.next;
            cur.next.prev = newNode;
            newNode.prev = cur;
            cur.next = newNode;
            size++;
        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
            if(index >= size || index < 0){return;}
            ListNode cur = head;
            for(int i = 0; i < index; i++){
                cur = cur.next;
            }
            cur.next.next.prev = cur;
            cur.next = cur.next.next;
            size--;
        }
    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
public static void main(String[] args) {
    MyLinkedList myLinkedList = new MyLinkedList();
    myLinkedList.addAtHead(7);
    myLinkedList.addAtTail(2);
    myLinkedList.addAtTail(1);
    for (Integer a:
            myLinkedList) {
        System.out.println(a);

    }
    System.out.println("=================");
    myLinkedList.addAtIndex(3, 0);
    for (Integer a:
            myLinkedList) {
        System.out.println(a);

    }// 链表变为 1->2->3
    System.out.println("=================");
    myLinkedList.deleteAtIndex(2);
    myLinkedList.addAtHead(6);
    myLinkedList.addAtTail(4);
    System.out.println(myLinkedList.get(4));
    for (Integer a:
         myLinkedList) {
        System.out.println(a);

    }
}
}
