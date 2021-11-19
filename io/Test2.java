package io;
/*
* 数据流：基本数据类型读写
* 用数据输出流写到文件中的基本数据类型是乱码的，
* 不能直接辨认。需要数据的输入流来读取
* */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test2 {
    public static void main(String[] args) {
        try {
            Test2.testDataOutputStream();
            Test2.testDataInputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void testDataOutputStream() throws Exception{
        DataOutputStream out = new DataOutputStream(new FileOutputStream("io/testDataOutputStream.txt"));
        //用数据集输出流写到文件中的基本数据类型是乱码的，不能直接辨认。需要数据的输入流来读取
        //out.writeBoolean(true);
        //out.writeDouble(1.35d);
        out.writeInt(100);
        out.flush();
        out.close();
    }
    public static void testDataInputStream() throws Exception{
        DataInputStream in = new DataInputStream(new FileInputStream("io/testDataOutputStream.txt"));
        System.out.println(in.readInt());
    }
}
