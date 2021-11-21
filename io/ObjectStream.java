package io;

import java.io.Serializable;

/*
* 可以序列化和反序列化的对象
* 注意：对象的序列化与反序列化使用的类要严格一致（包名，类名，类结构等等）
*
* */
public class ObjectStream implements Serializable {//实现Serializable接口
    //一个表示序列化版本标识符的静态变量
    //用来表明类的不同版本之间的兼容性
    public static final long serialVersionUID=1L;
    String name;
    int age;
}
