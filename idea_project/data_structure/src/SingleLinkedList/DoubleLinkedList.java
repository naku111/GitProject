package SingleLinkedList;

public class DoubleLinkedList {
    Node head;
    Node tail;
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
        this.head =new Node(null,null,666);
        this.tail =new Node(null,null,888);
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
}
