package day06;

import java.util.Properties;
import java.util.Set;

public class Properties_01 {
    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.setProperty("filename", "a.txt");
        properties.setProperty("length", "209385038");
        properties.setProperty("location", "D:\\a.txt");
// 打印属性集对象

        System.out.println(properties);
        System.out.println("===========");
        System.out.println(properties.getProperty("filename"));
        System.out.println(properties.getProperty("length"));
        System.out.println(properties.getProperty("location"));
        System.out.println("===========");
        Set<String> strings = properties.stringPropertyNames();
        for (String a:
             strings) {
            System.out.println(a+"->"+properties.getProperty(a));
        }
    }
}
