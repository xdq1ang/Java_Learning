package io;


import java.io.*;

/*
* 把控制台输入的内容写入到txt中
*
* */
public class SystemIn2 {
    public static void main(String[] args) {
        try {
            SystemIn2.toTxt();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static  void toTxt() throws Exception{
        //转换输入流
        InputStreamReader isr = new InputStreamReader(System.in);
        //字符缓冲流
        BufferedReader bis = new BufferedReader(isr);
        //BufferedWriter bw = new BufferedWriter(new FileWriter("io/toTxt.txt"));
        FileWriter fw=new FileWriter("io/toTxt.txt");
        String s="";
        while((s=bis.readLine())!=null){
            if(s.equals("over")){
                break;
            }
            fw.write(s);
        }
        fw.flush();
        bis.close();
        isr.close();
        fw.close();
    }
}
