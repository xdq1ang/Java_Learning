package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ConversionStream {
    public static void main(String[] args) {
        //所有文件都是有格式的
        //对于我们来说，txt和java文件一般有三种编码
        // ISO8859-1,西欧编码，纯英文不适合汉字
        //GBK和UTF-8(更适合)，这两种是适用于中文和英文
        //转换流可以将字节和字符相互转换
        try {
            ConversionStream.testInputStreamReader();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            ConversionStream.testOutputStreamWriter();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void testInputStreamReader() throws Exception {
        FileInputStream fs = new FileInputStream("io/tbw.txt");
        //把字节流转换为字符流
        InputStreamReader in = new InputStreamReader(fs, "UTF-8");
        char[] c = new char[100];
        int len = 0;
        while ((len = in.read(c)) != -1) {
            System.out.println(new String(c, 0, len));

        }
        in.close();
        fs.close();
    }

    public static void testOutputStreamWriter() throws Exception{
            FileOutputStream fos =new FileOutputStream("io/osw.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
            String s1 = "dqwdwqd哈哈哈哈";
            osw.write(s1);
            osw.flush();
            osw.close();
            fos.close();


        }

}
