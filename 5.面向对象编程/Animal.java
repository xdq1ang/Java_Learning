public class Animal {
    String name;
    int eye;
    int legs;
    public void eat(String food){  //方法加入参数
        System.out.println("吃的是："+food);
    }
    public void move(String moveType){
        System.out.println("移动方式是："+moveType);
    }
}
