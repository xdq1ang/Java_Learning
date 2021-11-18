package EncapsulationAndHiding;
public class Person1 {
    public int age;
    
    public void printAge(){
        System.out.println("年龄是："+age);
    }
    public void setAge(int a){
        if (a<=150 && a>0){
            age=a;
        }else{
            System.out.println("输入的年龄不合法");
        }
    }
}