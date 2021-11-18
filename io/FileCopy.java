package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCopy{
    public static void main(String[] args){
        new Copy().ReadAndWrite("io/ioTestFile.txt","io/path/test/copiedFile.txt");
    }
}


interface ReadFile{
    String ReadFile(String path);
}
interface WriteFile{
    void WriteFile(String data,String path);
}

class Copy implements ReadFile,WriteFile {

    @Override
    public String ReadFile(String path) {
        try {
            FileInputStream in = new FileInputStream(path);
            byte[] b = new byte[500];
            int len=0;
            String data = new String();
            while((len=in.read(b))!=-1){
                data=new String(b,0,len);
                in.close();
                System.out.println("读取完成");
                return data;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "null";
    }

    @Override
    public void WriteFile(String data,String path) {
        try {
            FileOutputStream out = new FileOutputStream(path);
            out.write(data.getBytes());
            out.flush();
            out.close();
            System.out.println("写入完成");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void ReadAndWrite(String read_path,String write_path){
        String data=this.ReadFile(read_path);
        this.WriteFile(data,write_path);
        System.out.println("复制完成");
    }
}
