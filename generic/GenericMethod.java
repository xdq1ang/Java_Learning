package generic;

public class GenericMethod {
    //泛型类
    Cc<String> c = new Cc<String>();
    //泛型方法在调用前：没有固定的数据类
    //泛型方法在调用时：传入的参数是什么数据类型，就会把泛型改成什么数据类型
    Integer i = c.test1(1);
}

class Cc<E>{
    private E e;
    public <T> void test(T s){//无返回值
        T t= s;
    }
    public <T> T test1(T s){//有返回值
        return s;
    }
    public <T> void test2(T...strs){//可变参数
        for (T s:strs){
            System.out.println(s);
        }
    }
    public E test3(){//可以在成员方法使用类定义的泛型
        return this.e;
    }
//    public static E test4(){   不能在静态方法上使用类泛型，只能使用静态方法自己的泛型
//
//    }
    public static <T> void test4(T t){//静态方法使用自己的泛型

    }
}