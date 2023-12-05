package day06;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Properties_02 {
    public static void main(String[] args) {

        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("read.txt"));
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        Set<String> strings = properties.stringPropertyNames();
        for (String a:strings)
        {
            System.out.println(a+"->"+properties.getProperty(a));
        }

    }
}
