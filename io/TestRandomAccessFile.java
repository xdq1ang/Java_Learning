package io;

import java.io.RandomAccessFile;

/*
* 程序可以跳到文件的任意地方来读取（写）文件
* */
public class TestRandomAccessFile {
    public static void main(String[] args) {
        try {
            TestRandomAccessFile.testRandomAccessFileRead();
            TestRandomAccessFile.testRandomAccessFileWrite();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void testRandomAccessFileRead() throws Exception{
        //TestRandomAccessFile  参数1：读写的文件路径。参数2：访问模式
        /*访问模式：
        * r:只读
        * rw:打开以便读取和写入
        * rwd:打开以便读取和写入；同步文件内容的更新
        * rws：打开以便读取和写入；同步文件内容和元数据的更新
        * */
        RandomAccessFile ra = new RandomAccessFile("io/TestRandomAccessFile.txt","r");
        ra.seek(2);//设置读取文件内容的起始点
        byte[] b = new byte[1024];
        int len=0;
        while((len=ra.read(b))!=-1){
            System.out.println(new String(b,0,len));

        }
        ra.close();
    }
    public static void testRandomAccessFileWrite() throws Exception{
        RandomAccessFile ra = new RandomAccessFile("io/TestRandomAccessFile.txt","rw");
        ra.seek(0);//设置写的起始点。0代表从开头表示写。ra.length()表示文件追加
        ra.write("你好".getBytes());
        ra.close();
    }
}
