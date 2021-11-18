package constructor;
public class Test{
    public static void main(String[] args){
        Person p = new Person(10,"xdqiang");
        System.out.println("年龄是："+p.getAge());
        p.reAge(20);
        System.out.println("更改后年龄是："+p.getAge());
        System.out.println("name是："+p.getName());
        p.reName("qqqqq");
        System.out.println("更改后name是："+p.getName());
    }
}
class Person {
    private int age;
    private String name;
    //构造器名和类名相同，访问权限描述符和类相同
    public Person(int age0,String name0){
        age=age0;
        name=name0;
    }
    public void reName(String name0){
        name=name0;
    }
    public String getName(){
        return name;
    }
    public void reAge(int age0){
        age=age0;
    }
    public int getAge(){
        return age;
    }
}
