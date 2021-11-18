package treeset;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Set;
import java.util.Iterator;
public class Test {
    public static void main(String[] args){
        Set<Integer> set = new TreeSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(41);
        set.add(41);
        System.out.println(set);
        //迭代器
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //for each
        for(Integer i:set){
            System.out.println(i);
        }
        Person p1=new Person("xdqiang",23);
        Person p2=new Person("zhangsan",18);
        Person p3=new Person("LI",21);
        Person p4=new Person("wu",19);
        Set<Person> personSet = new TreeSet<Person>(new Person());
        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);
        personSet.add(p4);
        System.out.println(personSet);
        for (Person p:personSet){
            System.out.println(p.name+p.age);
        }


    }
}

class Person implements Comparator<Person> {//把person对象存入TreeSet中
    int age;
    String name;
    public Person(){

    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.age>o2.age){
            return 1;
        }else if(o1.age<o2.age){
            return -1;
        }else{
            return 0;
        }
    }
}
