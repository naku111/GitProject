package day07;

import java.io.*;
import java.io.BufferedInputStream;
import java.util.HashMap;

public class Buffered_Test {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> linemap=new HashMap<>();
        BufferedReader bufferedreader = new BufferedReader(new FileReader("F:\\IdeaProject\\first\\src\\first_package\\super\\src\\day07\\test.txt"));
        BufferedWriter bufferedwriter=new BufferedWriter(new FileWriter("F:\\IdeaProject\\first\\src\\first_package\\super\\src\\day07\\out.txt"));
        String line=null;

        while ((line=bufferedreader.readLine())!=null){
            String[] split=line.split("\\.");
            linemap.put(split[0],split[1]);
        }
        bufferedreader.close();

        for (int i = 1; i <=linemap.size() ; i++) {
            String value=linemap.get(""+i);
            bufferedwriter.write(i+"."+value);
            bufferedwriter.newLine();

        }
        bufferedwriter.close();
    }
}
