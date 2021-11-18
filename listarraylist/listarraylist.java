package listarraylist;

import java.util.ArrayList;
import java.util.List;
public class listarraylist<L> {
    public static void main(String[] args){
    List<String> l = new ArrayList<String>();
    l.add("1");
    l.add("3");
    l.add("d");
    System.out.println(l);
    System.out.println(l.get(1));//取指定位置的元素
    l.add(1,"555");//在指定位置添加元素
    System.out.println(l);
    List<String> l1 = new ArrayList<String>();
    l1.add("fwf");
    l.addAll(4,l1);
    System.out.println(l);
    System.out.println(l.indexOf("d"));
    }



}
