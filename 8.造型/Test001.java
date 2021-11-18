public class Test001 {
    public static void main(String[] args){
        Person02 P1=new Person02();
        Student2 S1=new Student2();
        Person02 P2=S1;//向上转型，自动数据类型转换
        Student2 S2=(Student2)P1;
        System.out.println(S1.school);
    }
    
}
