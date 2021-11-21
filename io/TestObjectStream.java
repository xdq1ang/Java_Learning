package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObjectStream {
    public static void main(String[] args) {
        try {
            TestObjectStream.testSerialize();
            TestObjectStream.testDeserialize();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public static void testSerialize() throws Exception{//对象的序列化
        //定于镀锡的输出流，把对象的序列化之后的流放到指定的文件中
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("io/ObjectStream.txt"));
        ObjectStream p = new ObjectStream();
        p.name="xdqiang";
        p.age=12;
        out.writeObject(p);
        out.flush();
        out.close();


    }
    public static void testDeserialize() throws Exception{//对象的反序列化
        //从指定文件中读取序列化后的流
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("io/ObjectStream.txt"));
        Object obj=in.readObject();
        ObjectStream p = (ObjectStream)obj;
        System.out.println(p.name);
        System.out.println(p.age);
        in.close();


    }
}
