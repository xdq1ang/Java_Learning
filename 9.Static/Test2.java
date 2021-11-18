public class Test2 {
    public static void main(String[] args){
        Chinese.country = "china";//通过类初始化
        Chinese c = new Chinese();
        c.name = "xdqiang";
        c.age = 12;
        Chinese c1 = new Chinese();
        c1.name = "qqqq";
        c1.age = 11;
        System.out.println(Chinese.country);//通过类访问  
        Chinese.test(); 
    }
}
