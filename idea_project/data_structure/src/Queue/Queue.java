package Queue;

public interface Queue<E>{
    boolean offer(E value);//向队尾插入元素

    E poll();//从队头获取元素元素，并移除

    E peek();//从队头获取元素元素，并移除

    boolean isEmpty();//判断队是否为空

}
