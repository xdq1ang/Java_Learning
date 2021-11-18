package generic;

import java.util.ArrayList;
import java.util.List;
public class Wildcard {
    public static void main(String[] args){
        Dd dd= new Dd();
        List<String> li=new ArrayList<String>();
        dd.test(li);
        List<A1> la = new ArrayList<A1>();
        List<B1> lb = new ArrayList<B1>();
        List<C1> lc = new ArrayList<C1>();
        List<D1> ld = new ArrayList<D1>();
        De de = new De();
        de.test(lc);
        de.test(ld);
    }
}
class Dd{
    //？通配符
    public void test(List<?> list){//test方法需要一个list集合的参数，不确定list集合到底是存储的什么类型的数据

    }
}

class A1{}

class B1 extends A1{}

class C1 extends B1{}

class D1 extends C1{}

class De{
    public void test(List<? extends C1> li){//li元素范围是C1及其子类
        System.out.println(li);
    }
}