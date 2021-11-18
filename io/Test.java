package io;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File f1 = new File("D:\\JAVA_learning\\io\\ioTestFile.txt");//一定是双斜杠，单斜杠是转义符。还可以这样："D:/JAVA_learning/io/ioTestFile.txt"
        File f2 = new File("D:\\JAVA_learning\\io","ioTestFile.txt");
        File f3 = new File("D:\\JAVA_learning"+File.separator+"io\\ioTestFile.txt");
        File f4 = new File("D:\\JAVA_learning\\io\\");
        File f5 = new File("ioTestFile.txt");
        System.out.println("文件名"+f1.getName());//获取文件名
        System.out.println("文件夹名"+f4.getName());//获取当前文件夹名
        System.out.println("获取路径（根据输入路径）"+f5.getPath());//获取当前路径(读取的时候填的是绝对，则输出绝对。填的是相对路径则输出相对路径)
        System.out.println("绝对路径"+f1.getAbsoluteFile());//获取绝对路径
        System.out.println("输出f1"+f1);//效果等同于getPath()
        System.out.println("父级路径"+f5.getParent());//返回父路径，为null因为读取时输入的时相对路径。
        f1.renameTo(new File("D:\\JAVA_learning\\io\\ioTestFile.txt"));
        File f6 = new File("D:\\JAVA_learning\\io\\ioTestFile.txt");
        System.out.println(f6.exists());//判断文件是否存在
        File f7 = new File("D:\\JAVA_learning\\io\\ioTestFile.txt");
        System.out.println("判断是否可写"+f7.canWrite());
        System.out.println("判断是否可读"+f7.canRead());
        System.out.println("判断是否是文件"+f7.isFile());
        System.out.println("判断是否是目录"+f7.isDirectory());
        System.out.println("最后修改时间"+f7.lastModified());
        System.out.println("返回文件的长度（字节数）"+f7.length());


    }
}
