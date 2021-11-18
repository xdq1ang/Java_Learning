public class Test4 {
    public static void main(String[] args){
        new Person4();
        new Person4();
        //创建匿名类内部类
        Person4 p = new Person4(){
            {//代码块替代构造方法
                this.name="ffff";
            }
            @Override
            public void showNmae() {
                System.out.println("this method was changed !");
            }
        };
        p.showNmae();
    }
}
