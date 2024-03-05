package Queue;

import java.util.Iterator;

public class LinkedListQueue<E> implements Queue<E>,Iterable<E>{
    //结点定义
    private static class Node<E>{
        E value;
        Node<E> next;

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    Node<E> head=new Node<E>(null,null);
    Node<E> tail=head;



    public LinkedListQueue(){
        tail.next=head;
    }
    @Override
    public boolean offer(E value) {
        Node<E> add =new Node<>(value,head);
        tail.next=add;
        tail=add;
        return true;
    }

    @Override
    public E poll() {
        if(isEmpty())
            return null;
        Node<E> p=head.next;
        E i=p.value;
        head.next=p.next;
        if(p==tail)
            tail=head;
        return i;
    }

    @Override
    public E peek() {
        if(isEmpty())
            return null;
        return head.next.value;
    }

    @Override
    public boolean isEmpty() {
        return head==tail;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> p=head.next;
            @Override
            public boolean hasNext() {

                return p!=head;
            }

            @Override
            public E next() {
                E value=p.value;
                p=p.next;
                return value;
            }
        };
    }
}
