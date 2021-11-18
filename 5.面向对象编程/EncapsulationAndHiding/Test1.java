package EncapsulationAndHiding;
//import EncapsulationAndHiding.Person;
//使用同一个包下的类，可以不导入包直接使用
public class Test1 {
    public static void main(String[] args){
        Person1 p=new Person1();
        p.setAge(-10);
        p.printAge();
    }
}