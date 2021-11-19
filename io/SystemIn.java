package io;
/*
* 标准输入输出流
*
* */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SystemIn {
    public static void main(String[] args) {
        try {
            SystemIn.testSystemIn();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public static void testSystemIn() throws Exception{
        //创建输入转换流对象
        //System.in是InputStream对象
        InputStreamReader is = new InputStreamReader(System.in);
        //把输入流放到缓冲流中
        BufferedReader br = new BufferedReader(is);
        //定义一个临时接收数据的字符串
        String str ="";
        while((str=br.readLine())!=null){
            System.out.println(str);
        }
        br.close();
        is.close();
    }
}
