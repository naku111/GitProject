package day08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class FileUpload_Sever {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6666);
        while (true){
            Socket accept = serverSocket.accept();
            //建立与客户端连接
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(accept.getInputStream());
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(System.currentTimeMillis() + "copy.jpg"));

                        byte[] b = new byte[1024 * 8];
                        int len = 0;
                        while ((len = bufferedInputStream.read(b)) != -1) {
                            bufferedOutputStream.write(b, 0, len);
                        }
                        bufferedInputStream.close();
                        bufferedOutputStream.close();
                        accept.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
