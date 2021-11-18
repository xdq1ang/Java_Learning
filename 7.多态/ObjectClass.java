public class ObjectClass {

    public void test(Object obj){

    }
    public static void main(String[] args){
        ObjectClass Ob=new ObjectClass();
        Person0 p= new Person0();
        Ob.test(p);
        
        Student0 s1 = new Student0();
        Student0 s2 = new Student0();
        System.out.println(s2.equals(s1));
    }
}
