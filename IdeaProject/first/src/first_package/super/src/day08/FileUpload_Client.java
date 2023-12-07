package day08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class FileUpload_Client {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D:\\test.jpg"));
        Socket localhost = new Socket("localhost", 6666);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(localhost.getOutputStream());
        byte[] b=new byte[1024*8];
        int len;
        while ((len=bufferedInputStream.read(b))!=-1){
            bufferedOutputStream.write(b,0,len);
            bufferedOutputStream.flush();
        }
        System.out.println("文件发送完毕");
        bufferedInputStream.close();
        bufferedOutputStream.close();
        localhost.close();
    }
}
