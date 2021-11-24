package runnable;

public class Test1 {
    public static void main(String[] args) {
        TestRunnableMethod r0 = new TestRunnableMethod();
        TestRunnableMethod r1 = new TestRunnableMethod();
        Thread t0 = new Thread(r0);
        Thread t1 = new Thread(r1);

        t0.start();
        t1.start();
        System.out.println("线程是否存活："+t1.isAlive());
        //获取线程名称（如果创建时没有指定名称则会初始化一个默认名称）
        System.out.println("t0线程名称是："+t0.getName());
        System.out.println(t1.getName());
        //设置线程名称
        t0.setName("线程t0");
        System.out.println("t0线程的名称是："+t0.getName());
        //线程优先级【1：10】：哪个线程有较大的概率被执行（默认的优先级是5）
        System.out.println("t0线程的优先级是："+t0.getPriority());
        t0.setPriority(10);
        t1.setPriority(10);
        System.out.println("t0线程设置优先级后："+t0.getPriority());
        //join()方法
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        try {
            t0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        System.out.println("线程是否存活："+t1.isAlive());


    }
}
