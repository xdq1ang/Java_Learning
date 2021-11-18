package io;

import java.io.File;
public class Practice {
    public static void main(String[] args) {
        File f = new File("D:\\JAVA_learning");
        new PathSearch().pathSearch(f);

    }
}
class PathSearch{
    public boolean pathSearch(File root){
        if(root.isFile()){
            System.out.println("这是一个文件"+root.getName());
            return true;
        }else if(root.isDirectory()){
            File[] list = root.listFiles();
            for (File ff : list){
                pathSearch(ff);
            }
        }

        return true;
    }
}