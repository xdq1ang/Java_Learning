public class Person4{
    String name;
    static int age;
    public Person4(){
        this.name="zhangsan";
        System.out.println("执行的是构造函数");
    }
    public void showNmae(){
        System.out.println(this.name);
    }


    //非静态的代码块（每次new都会执行）
    {
        System.out.println("执行的时非静态代码块");
        age=15;
    }
    //静态代码块（在第一次new时执行，之后不再执行）
    static{
        age=1;
        System.out.println("执行的时静态代码块");
    }
}
