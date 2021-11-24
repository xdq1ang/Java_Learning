package thread;

public class Test {
    public static void main(String[] args) {
        Thread t0 = new TestThrerad();//用父类接收子类实例（多态）
        t0.start();//启动线程
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("----------------------");
        /*
        main()方法中代码与run()代码并行执行。

        输出：
        ----------------------
        多线程运行的代码
        ----------------------
        ----------------------
        这是多线程的逻辑代码0
        这是多线程的逻辑代码1
        这是多线程的逻辑代码2
        这是多线程的逻辑代码3
        这是多线程的逻辑代码4

        */
    }
}
