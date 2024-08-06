package Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo2 {
    public static void main(String[] args) throws IOException {
        //获取xml文件路径
        String path = JsoupDemo1.class.getClassLoader().getResource("a.xml").getPath();
        //解析xml文件，加载文档进内存，获取dom树
        Document document = Jsoup.parse(new File(path),"gbk");

        Elements elements = document.select("name");//根据标签筛选
        System.out.println(elements);
        System.out.println("--------------------------");

        Elements select = document.select("#1");//根据id筛选
        System.out.println(select);
        System.out.println("--------------------------");

        Elements select1 = document.select("user[number='1']");//特定属性值的标签
        System.out.println(select1);
        System.out.println("--------------------------");

        Elements select2 = document.select("user[number='1'] > age");//标签下的子标签
        System.out.println(select2);
        System.out.println("--------------------------");

    }

}
