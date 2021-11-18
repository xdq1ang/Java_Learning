package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Buffer {
    public static void main(String[] args) {
        try {
            Buffer.testBufferedInputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Buffer.testBufferedOutputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    //缓冲字节输入流
    public static void testBufferedInputStream() throws Exception{
        //文件字节流输入对象
        FileInputStream in = new FileInputStream("io/ioTestFile.txt");
        //把文件字节输入流输入到缓冲字节输入流对象
        BufferedInputStream br = new BufferedInputStream(in);
        byte[] b = new byte[10];
        int len=0;
        while((len=br.read(b))!=-1){
            System.out.println(new String(b,0,len));

        }
        //关闭顺序要对称
        br.close();
        in.close();

    }
    public static void testBufferedOutputStream() throws Exception{
        FileOutputStream out = new FileOutputStream("io/testFile.txt");
        BufferedOutputStream bo = new BufferedOutputStream(out);
        String s = "hello world11111";
        bo.write(s.getBytes());
        bo.flush();
        bo.close();
        out.close();
    }
}
