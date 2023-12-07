package DynamicArray;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class DynamicArray01 implements Iterable<Integer>{
    private int size=0;
    private int capacity=10;
    private int[] array;
    public void addLast(int e){
        check();
        array[size]=e;
        size++;
    }
    public void add(int index, int e){
        check();
        if(index>=0 && index<size){
            System.arraycopy(array,index,array,index+1,size-index);
            array[index]=e;
            size++;
        } else if (index==size) {
            addLast(e);
        } else if (index<0) {
            System.out.println("角标错误！");
        }
    }

    private void check() {
        if(size==0)
            array=new int[capacity];
        else if(size==capacity){
            capacity+=capacity >> 1;
            int[] newarray=new int[capacity];
            System.arraycopy(array,0,newarray,0,size);
            array=newarray;
        }
    }

    public int remove(int index){
        int temp=array[index];
        if (index<size-1){
            for (int i=index+1;i<size;i++){
                array[i-1]=array[i];
            }
        }
        size--;
        return temp;
    }
    public int get(int index){
        return array[index];
    }
    public int length(){
        return size;
    }

    //遍历方式一：遍历要执行的操作
    public void forEach01(Consumer<Integer> consumer){
        for (int i = 0; i < size; i++) {
            consumer.accept(array[i]);
        }
    }

    //遍历方式二：迭代器遍历
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
             int i=0;
            @Override
            public boolean hasNext() {
                return i<size;
            }

            @Override
            public Integer next() {
                return array[i++];
            }
        };
    }
    //遍历方式三：输入流
    public IntStream stream(){
        return IntStream.of(Arrays.copyOfRange(array,0,size));
    }

}
