package io;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        File f = new File("io\\testFile.txt");
        if (!f.exists()){
            try{
                f.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        System.out.println(f.exists());

        File f2 = new File("io\\path\\test");
        if(!f2.exists()){
            f2.mkdirs();//一次可创建多层
            //f2.mkdir();//一次只能创建一层
        }

        File f11 = new File("io");
        String[] f1 = f11.list();
        for(String str : f1 ){
            System.out.println(str);
        }

        System.out.println("******************");
        File[] f3 = f11.listFiles();
        for(File ff : f3 ){
            System.out.println(ff);
        }


    }
}
