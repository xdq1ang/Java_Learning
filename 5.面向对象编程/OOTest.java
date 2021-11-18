public class OOTest {
    public static void main(String[] args){
        //实例化前面定义的类
        //和变量声明类似
        // int i=0
        //变量类型 变量名 = new **(**)
        Person01 person = new Person01();
        person.name="张三";
        person.age=25;
        person.showName();
        int age1=person.getAge();
        System.out.println("age is :"+age1);
        Person1 person2= new Person1();
        //person2.age=12; //会找不到这个属性
        person2.name="xdiang";
        System.out.println(Person1.sex);
    }
}
