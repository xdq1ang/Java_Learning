//向上转型：
//向上转型之后不能再访问子类新添加的属性和方法

public class Test1 {
    public static void main(String[] args){
        Person0 P= new Person0();
        Student0 stu=new Student0();
        System.out.println(P.name);
        //System.out.println(P.school);
        System.out.println(stu.school);
    }
}
