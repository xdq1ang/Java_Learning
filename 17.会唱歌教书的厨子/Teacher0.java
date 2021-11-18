public class Teacher0 extends Person5 implements Cooking,Sing {
    public Teacher0(int age , String name, int sex){
        this.age=age;
        this.name=name;
        this.sex=sex;
    }
    @Override
    public void showInfo(){
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.sex);
    }
    @Override
    public void fry(){
        System.out.println("Fry now");
    }
    @Override
    public void singing(){
        System.out.println("singing now");
    }
    
}
