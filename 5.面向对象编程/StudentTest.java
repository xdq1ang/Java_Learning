public class StudentTest {
    public static void main(String[] args){
        Student stu1=new Student();
        stu1.name="xdqiang";
        stu1.age=55;
        stu1.interest="sleep";
        stu1.course="PE";
        stu1.showInfo();
        StudentTest getarea_Test=new StudentTest();
        int area=getarea_Test.getArea(2,3);
        System.out.println(area);
    }

    public int getArea(int x,int y){
        return x*y;

    }
}
