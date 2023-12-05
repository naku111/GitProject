package SingleLinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);

        linkedList.loop01(value->{
            System.out.println(value);
        });

        System.out.println("===============");

        linkedList.loop02(value->{
            System.out.println(value);
        });

        System.out.println("===============");

        for (Integer list:
             linkedList) {
            System.out.println(list);
        }

        linkedList.addLast(5);
        linkedList.addLast(6);
        linkedList.addLast(7);
        linkedList.addLast(8);
        linkedList.addLast(9);
        System.out.println("===============");
        for (Integer list:
                linkedList) {
            System.out.println(list);
        }
    }
}
