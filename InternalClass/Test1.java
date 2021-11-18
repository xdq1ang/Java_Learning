package InternalClass;

/*
* 现在A想同时获得B和C的方法，并重写
*
* */

public class Test1 {
    public static void main(String[] args) {
        new A().testb();
        new A().testc();
    }
}


class A{
    public void testb(){
        new InnerB().testB();
    }
    public void testc(){
        new InnerC().testC();
    }
    class InnerB extends B{
        @Override
        public void testB(){
            System.out.println("this is override of B");
        }
    }
    class InnerC extends C{
        @Override
        public void testC(){
            System.out.println("this is override of C");
        }
    }
}
class B{
    public void testB(){
        System.out.println("this is a method of B");
    }
}
class C{
    public void testC(){
        System.out.println("this is a method of C");
    }
}

