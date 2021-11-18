public abstract class Template {
    public abstract void code();
    public final void getTime(){
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("code 执行时间 is"+(end - start));
    }    
}

class TestTmp extends Template{
    @Override
    public void code(){
        long sum = 0;
        for(int i = 0;i<=60000000;i++){
            sum =sum+i;
        }
    }
}
