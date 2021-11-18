/**
 * 汽车生产接口
 */

public interface BWMFactory {
    BWM productBWM();
}

/**
 * 实现具体车型的生产工厂
 */
class BWM3Factory implements BWMFactory{
    @Override
    public BWM productBWM(){
        System.out.println("生产BWM3");
        return new BWM3();
    }
}
class BWM5Factory implements BWMFactory{
    @Override
    public BWM productBWM(){
        System.out.println("生产BWM5");
        return new BWM5();
    }
}
class BWM7Factory implements BWMFactory{
    @Override
    public BWM productBWM(){
        System.out.println("生产BWM7");
        return new BWM7();
    }
}