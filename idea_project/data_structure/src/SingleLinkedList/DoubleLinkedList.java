package SingleLinkedList;

import java.util.Iterator;

public class DoubleLinkedList implements Iterable<Integer>{
    //双哨兵
    Node head;
    Node tail;

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p=head.next;
            @Override
            public boolean hasNext() {
                return p!=tail;
            }

            @Override
            public Integer next() {
                int v= p.value;
                p=p.next;
                return v;
            }
        };
    }

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

    public DoubleLinkedList() {
        head =new Node(null,null,666);
        tail =new Node(null,null,888);
        head.next=tail;
        tail.pre=head;
    }
    private Node findnode(int index){
        int i=-1;
        for (Node p=head;p!=tail;p=p.next,i++){
            if(i==index)
                return p;
        }
        return null;
    }
    public void insert(int index,int value){
        Node pre = findnode(index - 1);
        if (pre==null)
            System.out.println("角标有误");
        Node next=pre.next;
        Node inserted = new Node(pre, next, value);
        pre.next=inserted;
        next.pre=inserted;
    }
    public void addFirst(int value){
        insert(0,value);
    }
    public void remove(int index){
        Node pre = findnode(index - 1);
        if (pre==null)
            System.out.println("角标错误");
        Node removed=pre.next;
        if (removed==tail)
            System.out.println("角标错误");
        Node next = findnode(index + 1);

        pre.next=next;
        next.pre=pre;
    }
    public void removeFirst(){
        remove(0);
    }
    public void addLast(int index){
        Node last=tail.pre;
        Node added = new Node(last, tail, index);
        last.next=added;
        tail.pre=added;
    }
    public void removeLast(){
        Node removed = tail.pre;
        Node pre=removed.pre;
        pre.next=tail;
        tail.pre=pre;
    }
}
