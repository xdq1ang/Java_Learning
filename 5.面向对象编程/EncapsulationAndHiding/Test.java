package EncapsulationAndHiding;
//import EncapsulationAndHiding.Person;
//使用同一个包下的类，可以不导入包直接使用
public class Test {
    public static void main(String[] args){
        Person p=new Person();
        p.age=10;
        p.printAge();
    }
}
