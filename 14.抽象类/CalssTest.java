public class CalssTest {
    public static void main(String[] args){
        Dog dog1 = new Dog();
        Fish fish1 = new Fish();
        dog1.move();
        fish1.move();
        Manager m1 = new Manager("xdqiang","fafasd",5000.0); 
        CommonEmployee c1 = new CommonEmployee("sss", "123456", 4545);
        System.out.println("name is "+m1.name);
        System.out.println("id is "+m1.id);
        System.out.println("salary is "+m1.salary);
        c1.work();
    }
}
