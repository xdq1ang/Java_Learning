package ErrorException;

public class Test1 {
    public static void main(String[] args){
        B b = new B();
        try{
            b.test();
        }catch(Exception e){
           e.printStackTrace();
        }
    }
}
class B{
    int i;
    public void test() throws Exception{
        B b = null;
        System.out.println(b.i);
    }
}