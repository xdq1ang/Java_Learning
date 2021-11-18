package enumerationclass;

public class Test {
    public static void main(String[] args){
        //获取一个Season的对象
        Season spring = Season.SPRING;//相当于调用了枚举的构造
        spring.showInfo();
        spring.test();
        Season spring1 = Season.SPRING;
        //spring和spring1是同一个对象。（枚举类中的每个枚举都是单例模式）
        System.out.println(spring.equals(spring1));

    }
}


//枚举类
enum Season implements ITest{
    //相当于调用了Season的构造方法
    SPRING("春天","春暖花开"),
    SUMMER("夏天","炎炎夏日"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","寒风零零");
    //属性私有化
    private final String name;
    private final String desc;
    //构造函数私有化
    private Season(String name,String desc){
        this.name=name;
        this.desc=desc;
    }

    public void showInfo(){
        System.out.println(this.name+":"+this.desc);
    }

    @Override
    public void test() {
        System.out.println("这是枚举类实现的接口");
    }
}

interface ITest{
    void test();
}