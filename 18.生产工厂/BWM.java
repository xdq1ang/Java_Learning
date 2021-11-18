/**
 * BWM的产品接口
 */

public interface BWM {
    //产品信息
    void showInfo(); 
}

/**
 * 构建具体车类
 */
class BWM3 implements BWM{
    @Override
    public void showInfo(){
        System.out.println("this is BWM3");
    }
}

class BWM5 implements BWM{
    @Override
    public void showInfo(){
        System.out.println("this is BWM5");
    }
}

class BWM7 implements BWM{
    @Override
    public void showInfo(){
        System.out.println("this is BWM7");
    }
}