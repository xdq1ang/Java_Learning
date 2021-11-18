public class Single{
    private Single(){//构造函数私有化

    }
    private static Single single = new Single();
    public static Single getInstance(){
        return single;
    }
}