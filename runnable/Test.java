package runnable;

public class Test {
    public static void main(String[] args) {
        TestRunnable T = new TestRunnable();
        Thread t0 = new Thread(T,"t0");
        t0.start();
        Thread t1 = new Thread(T,"t1");//给线程命名
        t1.start();

        //t1和t2是处理的是T这个共享资源
        System.out.println("这是主函数的代码");
        System.out.println("这是主函数的代码");
        System.out.println("这是主函数的代码");
        System.out.println("这是主函数的代码");
        System.out.println("这是主函数的代码");
        System.out.println("这是主函数的代码");
    }
}
