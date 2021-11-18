package generic;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List list = new ArrayList();
        list.add("dddd");
        list.add(1);
        list.add(true);
        System.out.println(list);

        List<String> list1 = new ArrayList<String>();
        list1.add("dddd");
        list1.add("1");
        list1.add("fff");
        System.out.println(list1);
    }
}
