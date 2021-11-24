package Threadsynchronizationanddeadlock;


public class Test {
    public static void main(String[] args){
        Acounnt a = new Acounnt();
        User u_weixin = new User(a,30);
        User u_zhifubao = new User(a,3000);
        Thread weixin = new Thread(u_weixin,"weixin");
        Thread zhifubao = new Thread(u_zhifubao,"zhifubao");
        weixin.start();
        zhifubao.start();

    }
}
class Acounnt{
    public static int money = 3000;
    public synchronized void drawing(int m,Acounnt a){//在方法上加上同步锁，锁的是对象，不同的对象是不同的锁
        String name = Thread.currentThread().getName();
        if(name.equals("weixin")){
            try {
                a.wait();//挂起微信，等支付宝操作完在继续
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (money<m){
            System.out.println(name+"操作，账户金额不足");
        }else {
            System.out.println(name + "操作：账户原有余额：" + money);
            System.out.println(name + "操作：取款金额：" + m);
            money = money - m;
            System.out.println(name + "操作：账户取款后余额：" + money);
        }
        if(name.equals("zhifubao")){
            a.notify();//唤醒等待资源优先级最高的线程
        }
    }
    public void drawing3(int m){
        synchronized(this){//表示当前代码块加了同步锁
            String name = Thread.currentThread().getName();
            if (money<m){
                System.out.println(name+"操作，账户金额不足");
            }else {
                System.out.println(name + "操作：账户原有余额：" + money);
                System.out.println(name + "操作：取款金额：" + m);
                money = money - m;
                System.out.println(name + "操作：账户取款后余额：" + money);
            }

        }
    }
}

class User implements Runnable{
    Acounnt acount;
    int money;
    public User(Acounnt acounnt,int money){
        this.acount=acounnt;
        this.money=money;
    }
    @Override
    public void run(){
        acount.drawing(money,acount);
    }
}
