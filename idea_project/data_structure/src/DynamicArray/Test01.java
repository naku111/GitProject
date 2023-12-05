package DynamicArray;

public class Test01 {
    public static void main(String[] args) {
        DynamicArray01 dynamicArray01 = new DynamicArray01();
        dynamicArray01.addLast(1);
        dynamicArray01.addLast(2);
        dynamicArray01.addLast(3);
        dynamicArray01.addLast(4);
        dynamicArray01.add(1,2);

        dynamicArray01.forEach01((element)->{
            System.out.println(element);
        });

        System.out.println("===========");
        for (Integer a: dynamicArray01)//每次自动调用hasnext和next函数
        {
            System.out.println(a);
        }

        System.out.println("===========");
        int remove=dynamicArray01.remove(0);
        for (Integer a: dynamicArray01)//每次自动调用hasnext和next函数
        {
            System.out.println(a);
        }
        System.out.println("被删除的元素为："+remove);


    }
}
