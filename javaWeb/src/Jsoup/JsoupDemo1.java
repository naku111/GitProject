package Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

//1. Jsoup：工具类，可以解析html或xml文档，返回Document
//        * parse：解析html或xml文档，返回Document
//        * parse(File in, String charsetName)：解析xml或html文件的。
//        * parse(String html)：解析xml或html字符串
//        * parse(URL url, int timeoutMillis)：通过网络路径获取指定的html或xml的文档对象
//2. Document：文档对象。代表内存中的dom树
//        * 获取Element对象
//        * getElementById(String id)：根据id属性值获取唯一的element对象
//        * getElementsByTag(String tagName)：根据标签名称获取元素对象集合
//        * getElementsByAttribute(String key)：根据属性名称获取元素对象集合
//        * getElementsByAttributeValue(String key, String value)：根据对应的属性名和属性值获取元素对象集合
//3. Elements：元素Element对象的集合。可以当做 ArrayList<Element>来使用
//4. Element：元素对象
//        1. 获取子元素对象
//        * getElementById(String id)：根据id属性值获取唯一的element对象
//        * getElementsByTag(String tagName)：根据标签名称获取元素对象集合
//        * getElementsByAttribute(String key)：根据属性名称获取元素对象集合
//        * getElementsByAttributeValue(String key, String value)：根据对应的属性名和属性值获取元素对象集合
//
//        2. 获取属性值
//        * String attr(String key)：根据属性名称获取属性值
//        3. 获取文本内容
//        * String text():获取文本内容
//        * String html():获取标签体的所有内容(包括字标签的字符串内容)
//5. Node：节点对象
//        * 是Document和Element的父类
public class JsoupDemo1 {
    public static void main(String[] args) throws IOException {
        //获取xml文件路径
        String path = JsoupDemo1.class.getClassLoader().getResource("a.xml").getPath();
        //解析xml文件，加载文档进内存，获取dom树
        Document document = Jsoup.parse(new File(path),"gbk");
        //获取元素
        //获取标签为name的对象
        Elements names = document.getElementsByTag("name");
        //Elements可以当做 ArrayList<Element>来使用
        Element element = names.get(0);//获取第一个name的对象
        String name = element.text();
        System.out.println(name);
        System.out.println(names.size());
    }
}
