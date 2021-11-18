package package1;
public class DataSwapTest {
    public static void swap(DataSwap ds1){
        ds1.a=6;
        System.out.println("在Swap方法中ds1.a的值为："+ds1.a);
    }
    public static void main(String[] args){
        DataSwap ds=new DataSwap();
        System.out.println("调用swap方法之前，ds.a的值为："+ds.a);
        swap(ds);
        System.out.println("调用swap方法之后，ds.a的值为："+ds.a);
    }
}
