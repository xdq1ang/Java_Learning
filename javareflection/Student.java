package javareflection;

public class Student extends Person implements Move, Study{
    public Student(){

    }
    public Student(String school){
        this.school=school;

    }
    private Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String school;
    private String privateFields;
    public void showInfo(){
        System.out.println("学校是："+school);

    }

    @Override
    public void moveType() {
        System.out.println("骑自行车上学");

    }

    @Override
    public void studyInfo() {
        System.out.println("学习的是中学知识");

    }
    private void test(String name){
        System.out.println("这是私有方法test(String name)");

    }
    public String getSchool(){
        return this.school;
    }
    public void setInfo(String name,String school){
        this.name = name;
        this.school =  school;
        System.out.println("这是setInfo(String name,String school)方法");

    }
    public void setInfo(int age){
        System.out.println("这是setInfo(int age)方法");
    }
}
