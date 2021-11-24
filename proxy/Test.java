package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        ItestDemo test = new TestDemoImpl();//可以用接口接收对象（多态）
        /*
        * 注意：
        * 一个对象如果想要通过Proxy.newProxyInstance方法代理
        * 这个对象的类必须一定有相应的接口
        * 如本类中的ItestDemo接口和TestDemoImpl
        *
        * */

        test.test1();
        test.test2();
        System.out.println("-----------代理后---------------");
        /*
        * 需求：
        * 在执行test1和test2方法时加入一些东西
        * 在执行方法前打印  开始执行
        * 在执行方法后打印  执行完毕
        * */
        InvocationHandler handler = new ProxyDemo(test);
        //参数一：代理对象的类加载器（handler）
        //参数二：被代理的对象的接口（test）
        //参数三：代理对象（handler）
        //返回值：成功被代理的对象(object需要强转类型)
        ItestDemo t = (ItestDemo) Proxy.newProxyInstance(handler.getClass().getClassLoader(),test.getClass().getInterfaces(),handler);
        t.test1();
        System.out.println("------------------------------");
        t.test2();
    }
}
