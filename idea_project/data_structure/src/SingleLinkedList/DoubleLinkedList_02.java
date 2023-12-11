package SingleLinkedList;

import java.util.Iterator;

public class DoubleLinkedList_02 implements Iterable<Integer>{
    Node sentinel;

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p=sentinel.next;
            @Override
            public boolean hasNext() {
                return p!=sentinel;
            }

            @Override
            public Integer next() {
                int value=p.value;
                p=p.next;
                return value;
            }
        };
    }

    //双向循环链表带哨兵
    private static class Node{
        Node pre;
        Node next;
        int value;

        public Node(Node pre, Node next, int value) {
            this.pre = pre;
            this.next = next;
            this.value = value;
        }
    }

    public DoubleLinkedList_02() {
        Node sentinel = new Node(null, null, 666);
        sentinel.next=sentinel;
        sentinel.pre=sentinel;
    }
    public void addFirst(int value){
        Node a=sentinel;
        Node b=sentinel.next;
        Node added = new Node(a, b, value);
        a.next=added;
        b.pre=added;
    }
    public void addlast(int value){
        Node a=sentinel.pre;
        Node b=sentinel;
        Node added = new Node(a, b, value);
        a.next=added;
        b.pre=added;
    }
    public void removeFirst(){
        Node removed=sentinel.next;
        if(removed==sentinel)
            System.out.println("不能删除哨兵节点");
        Node a=sentinel;
        Node b=removed.next;
        a.next=b;
        b.pre=a;
    }
    public void removeLast(){
        Node removed=sentinel.pre;
        if(removed==sentinel)
            System.out.println("不能删除哨兵节点");
        Node a=removed.pre;
        Node b=sentinel;
        a.next=b;
        b.pre=a;
    }
    public void removeByvalue(int value){
        Node removed = findByvalue(value);
        if (removed==null)
            System.out.println("不用删除");
        Node a=removed.pre;
        Node b=removed.next;
        a.next=b;
        b.pre=a;
    }
    public Node findByvalue(int value){
        Node p=sentinel.next;
        while (p!=sentinel){
            if(p.value==value)
                return p;
            p=p.next;
        }
        return null;
    }


}
