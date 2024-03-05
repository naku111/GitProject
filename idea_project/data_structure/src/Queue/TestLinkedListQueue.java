package Queue;

public class TestLinkedListQueue {
    public static void main(String[] args) {
        LinkedListQueue<Integer> queue=new LinkedListQueue<Integer>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        for (Integer a:queue){
            System.out.println(a);
        }
        System.out.println(queue);
    }
}
