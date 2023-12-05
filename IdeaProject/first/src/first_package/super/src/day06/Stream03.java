package day06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream03 {
    public static void main(String[] args) throws IOException {
        //图片复制
        FileInputStream fis = new FileInputStream("D:\\test.jpg");
        FileOutputStream fos = new FileOutputStream("test_copy.jpg");
        byte[] b = new byte[1024];
        int len;
        while ((len = fis.read(b))!=-1) {
            fos.write(b, 0 , len);
        }
        fos.close();
        fis.close();
    }

}
