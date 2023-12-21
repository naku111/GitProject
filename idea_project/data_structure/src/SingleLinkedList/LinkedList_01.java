package SingleLinkedList;

import java.util.Iterator;
import java.util.function.Consumer;

public class LinkedList_01 implements Iterable<Integer>{
    Node head=null;

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p=head;
            @Override
            public boolean hasNext() {
                return p!=null;
            }

            @Override
            public Integer next() {
                int v=p.value;
                p=p.next;
                return v;
            }
        };
    }

    private static class Node{
        int value;
        Node next;
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void addFirst(int value){
//        if(head==null)
//            head=new Node(value,null);
//        else
//            head=new Node(value,head);
        head=new Node(value,head);
    }

    public void loop01(Consumer<Integer> consumer){
        Node p=head;
        while (p!=null){
            consumer.accept(p.value);
            p=p.next;
        }
    }
    public void loop02(Consumer<Integer> consumer){
        for (Node p=head;p!=null;p=p.next){
            consumer.accept(p.value);
        }
    }
    private Node findLast(){
        Node p=head;
        while (p.next!=null){
            p=p.next;
        }
        return p;
    }

    public void addLast(int value){
        Node last=findLast();
        if (last==null){
            addFirst(value);
        }
        else
            last.next=new Node(value,null);
    }
    private Node findNode(int index){
        int i=0;
        for(Node p=head;p!=null;p=p.next,i++){
            if(i==index){
                return p;
            }
        }
        return null;
    }
    public int get(int index){
        Node node = findNode(index);
        if (node==null){
            throw new IllegalArgumentException(
                    String.format("index [%d] 不合法%n",index)
            );
        }
        return node.value;
    }
    public void insert(int index,int value){
        if (index==0){
            addFirst(value);
            return;
        }
        Node node = findNode(index - 1);
        if (node==null){
            throw new IllegalArgumentException(
                    String.format("index [%d] 不合法%n",index));
        }
        node.next=new Node(value,node.next);
    }
    public void removeFirst(){
        if (head==null){
            System.out.println("链表为空！");
        }
        Node p=head.next;
        head=p;
    }
    public void remove(int index){
        if (index==0){
            removeFirst();
        }
        Node node = findNode(index - 1);
        if(node==null){
            throw new IllegalArgumentException(
                    String.format("index [%d] 不合法%n",index));
        }
        Node removed=node.next;
        if(removed==null){
            System.out.println("位置非法");
        }
        node.next=removed.next;
    }
}
