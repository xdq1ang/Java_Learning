public class Person2 {
    public String name;
    public int age;
    public int sex;

    public void study(){
        System.out.println("studying");
    }

    public void showAge(){
        System.out.println("age is :"+age);
    }
    
    public int addAge(int i){
        age+=i;
        return age;
    }
    
}
