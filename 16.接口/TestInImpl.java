public class TestInImpl implements TestIn,TestIn1 {
    @Override
    public void test(){
        System.out.println("test is running");
    }
    @Override
    public void test1(){
        System.out.println("test1 is running");
    }
}
