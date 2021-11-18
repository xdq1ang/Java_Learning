package collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("b");
        list.add("ab");
        list.add("bc");
        list.add("bd");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);//按照字典字母升序排序
        System.out.println(list);
        Collections.swap(list,0,2);
        Collections.max(list);
        Collections.min(list);
        Collections.frequency(list,"a");//求a出现的次数
        Collections.replaceAll(list,"a","A");//把a替换成A



        Student stu1 = new Student(10,"xdq");
        Student stu2 = new Student(12,"zzz");
        Student stu3 = new Student(2,"a");
        List<Student> stuList = new ArrayList<Student>();
        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);
        for (Student stu:stuList){
            System.out.println(stu.name);
        }
        Collections.sort(stuList,new Student());
        for (Student stu:stuList){
            System.out.println(stu.name);
        }
        //还可以根据comparator指定的方法进行求最大值
        Student stuMax=Collections.max(stuList,new Student());
    }
}
class Student implements Comparator<Student> {//实现一个比较器接口
    int age;
    String name;
    public Student(){

    }
    public Student(int age,String name){
        this.age=age;
        this.name=name;
    }
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.age>o2.age){
            return 1;
        }else if(o1.age<o2.age){
            return -1;
        }else{
            return 0;
        }
    }
}