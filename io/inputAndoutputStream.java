package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;


public class inputAndoutputStream {
    //文件字节输入流
    public static void main(String[] args){
        try {
            FileInputStream in = new FileInputStream("io/ioTestFile.txt");
            byte[] b = new byte[200];//设置一个byte数组接受读取内容
            int len;//设置读取数据的长度
            while((len=in.read(b))!=-1){
                System.out.println(new String(b,0,len));
            }
            in.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        testFileoutputStream();
    }
    //文件字节输出流
    public static void testFileoutputStream(){
        try {
            FileOutputStream out = new FileOutputStream("io/outputTest.txt");
            String str = "fadfgrthrhw";//写入内容
            out.write(str.getBytes());//把String转成bytes，写入内存
            out.flush();//把内存的数据写入硬盘
            out.close();//关闭流
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
