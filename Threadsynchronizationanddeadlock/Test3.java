package Threadsynchronizationanddeadlock;
/*
* 生产者和消费者问题
*
* */

public class Test3 {
    public static void main(String[] args) {
        Clerk c = new Clerk();
        //生产者
        //消费时不生产，生产时不消费
        new Thread(new Runnable(){
            @Override
            public void run() {
                synchronized(c){
                    while(true){//无限生产
                        if(c.productNum==0){//如果产品是0，开始生产
                            System.out.println("商品数为0，开始生产");
                            while(c.productNum<4){
                                c.productNum++;
                                System.out.println("库存为："+c.productNum);
                            }
                            System.out.println("商品数为"+c.productNum+"结束生产");
                            c.notify();//唤醒消费者
                        }else{
                            try {
                                c.wait();//生产者等待
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                }
            }
        } ,"生产者").start();
        //消费者
        //消费时不生产，生产时不消费
        new Thread(new Runnable(){
            @Override
            public void run() {
                synchronized(c){
                    while(true){//无限消费
                        if(c.productNum==4){//如果产品是4，开始消费
                            System.out.println("商品数为4，开始消费");
                            while(c.productNum>0){
                                c.productNum--;
                                System.out.println("库存为："+c.productNum);
                            }
                            System.out.println("商品数为"+c.productNum+"结束消费");
                            c.notify();//唤醒生产者
                        }else{
                            try {
                                c.wait();//消费者等待
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                }
            }
        } ,"生产者").start();

    }
}
class Clerk{
    public static int productNum=0;
}
