public class Person2Test {
    public static void main(String[] args){
        Person2 p2=new Person2();
        p2.name="xdqiang";
        p2.age=19;
        p2.sex=0;
        p2.showAge();
        System.out.println("age after add 2:"+p2.addAge(2));
        p2.study();


    }
    
}
