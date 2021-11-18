package annotation;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        TestB tb = new TestB();
        tb.test1();
        @SuppressWarnings("rawtypes")
        List list = new ArrayList();
    }
}


class TestA{
    public void test(){

    }
}
class TestB extends TestA{
    @Override
    public void test(){//重写方法

    }
    @Deprecated//过时
    public void test1(){

    }
}