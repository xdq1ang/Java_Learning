package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Buffer2 {
    public static void main(String[] args) {
        try {
            Buffer2.testBufferedReader();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Buffer2.testBufferedWriter();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Buffer2.copy();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    /*
     * 缓冲字符输入流
     * BufferedReader
     * */
    public static void testBufferedReader() throws Exception{
        FileReader r = new FileReader("io/ioTestFile.txt");
        BufferedReader br = new BufferedReader(r);
        char[] c = new char[100];
        int len=0;
        while((len=br.read(c))!=-1){
            System.out.println(new String(c,0,len));

        }
        br.close();
        r.close();
    }
    /*
     * 缓冲字符输出流
     * BufferedWriter
     * */
    public static void testBufferedWriter() throws Exception{
        FileWriter fw = new FileWriter("io/tbw.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String s ="xdqiang";
        bw.write(s);
        bw.close();
        fw.close();
    }
    public static void copy() throws Exception{
        FileReader fr= new FileReader("io/tbw.txt");
        BufferedReader br = new BufferedReader(fr);
        int len = 0;
        char[] c = new char[100];
        FileWriter fw = new FileWriter("io/tbwCopy.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        while((len=br.read(c))!=-1){
            bw.write(new String(c,0,len));
        }
        bw.flush();
        br.close();
        fr.close();
        bw.close();
        br.close();
    }
}


