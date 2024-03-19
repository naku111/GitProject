package Heapify;

import java.util.Arrays;
//大顶堆
public class MaxHeap {
    public int[] array;
    private int size;

    public MaxHeap(int[] array) {
        this.array = array;
        this.size = array.length;
        heapify();
    }

    public void heapify(){
        //建堆：先找到最后一个非叶子节点，自后往前挨个下潜，直到符合大顶堆的特性
        int i=size/2-1;//公式
        for(int j=i;j>=0;j--){
            down(j);
        }
    }
    public void down(int parent){
        //下潜
        int left=2*parent+1;
        int right=left+1;
        int max=parent;
        if(left<size&&array[left]>array[max]){
            max=left;
        }
        if(right<size&&array[right]>array[max]){
            max=right;
        }
        if(max!=parent){
            swap(max,parent);
            down(max);
        }

    }
    public void swap(int i,int j){

        int t;
        t=array[i];
        array[i]=array[j];
        array[j]=t;
    }
    public int peek(){
        //返回堆顶元素
        return array[0];
    }
    public int poll(){
        //删除堆顶元素

        //首先交换数组首位置和末尾位置的元素，然后删除末尾元素并调整大顶堆
        swap(0,size-1);
        int t=array[size-1];
        size--;
        down(0);
        return t;
    }
    public int poll(int i){
        //删除指定索引元素

        //首先交换数组首位置和末尾位置的元素，然后删除末尾元素并调整大顶堆
        swap(i,size-1);
        int t=array[size-1];
        size--;
        down(i);
        return t;
    }
    public void replaced(int replaced){
        //替换堆顶元素
        array[0]=replaced;
        down(0);
    }
    public boolean offer(int offered){
        //往堆尾添加元素
        if(size==array.length){
            return false;
        }
        up(offered);
        size++;
        return true;
    }
    public void up(int offered){
        //上浮
        int child=size;
        while (child>0) {
            int parent = (child - 1) / 2;//父元素的下表；公式
            if (offered > array[parent]) {
                array[child] = array[parent];
            } else break;
            child=parent;
        }
        array[child]=offered;
    }

    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
        MaxHeap one=new MaxHeap(array);
        System.out.println(Arrays.toString(one.array));
        int a=one.poll();
        System.out.println(a);
        System.out.println(Arrays.toString(one.array));
    }
}
