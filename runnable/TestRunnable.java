package runnable;
/*
* 通过实现Runnable接口实现多线程
*
*
* */

public class TestRunnable implements  Runnable{
    int count = 0 ;
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            count++;
            System.out.println(Thread.currentThread().getName()+":这是多线程的代码"+count);
        }

    }
}
