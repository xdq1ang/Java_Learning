package io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaders {
    public static void main(String[] args) {
        FileReaders.testFileReader("io/ioTestFile.txt");//不能从静态方法中调用非静态
    }
    //文件字符输入流
    public static void testFileReader(String inPath){
        try {
            FileReader fr = new FileReader(inPath);
            char[] c = new char[10];//字符流操作的是字符char
            int len=0;
            while((len=fr.read(c))!=-1){
                System.out.println(new String(c,0,len));
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
