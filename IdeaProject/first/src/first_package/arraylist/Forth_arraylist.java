package first_package.arraylist;
import java.util.ArrayList;

public class Forth_arraylist {
    public static void main(String[] args) {
// 创建集合对象
        ArrayList<String> list = new ArrayList<String>();
// 添加字符串到集合中
        list.add("张三丰");
        list.add("宋远桥");

        list.add("张无忌");
        list.add("殷梨亭");
// 调用方法
        printArrayList(list);
    }
    public static void printArrayList(ArrayList<String> list) {
// 拼接左括号
        System.out.print("{");
// 遍历集合
        for (int i = 0; i < list.size(); i++) {
// 获取元素
            String s = list.get(i);
// 拼接@符号
            if (i != (list.size()-1)) {
                System.out.print(s + "@");
            } else {
// 拼接右括号
                System.out.print(s + "}");
            }
        }
    }
}
