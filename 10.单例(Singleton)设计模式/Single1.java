public class Single1 {
    private Single1(){

    }
    private static Single1 s1=null;//类变量为所有对象共享
    public static Single1 getInstance(){
        if (s1==null){
            s1=new Single1();

        }

        return s1;

    } 
}
