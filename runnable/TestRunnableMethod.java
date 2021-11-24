package runnable;

public class TestRunnableMethod implements Runnable {
    int count=0;
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"Runnable多线程运行的代码");
        for(int i = 0 ; i<5 ; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i%2==0){
                Thread.yield();//线程让步
            }
            count++;
            System.out.println(Thread.currentThread().getName()+"这是Runnable多线程的逻辑代码"+count);
        }
    }
}
