package HashSetTset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class HashSetTest {
    public static void main(String[] args){
        Set set = new HashSet();
        set.add(1);
        set.add("a");
        System.out.println(set);
        set.remove(1);
        System.out.println(set);
        System.out.println(set.contains("a"));
        set.clear();
        System.out.println(set);
        set.add("afa");
        set.add(454);
        set.add("fff");
        set.add("j");
        //使用迭代器遍历
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //使用for each 迭代
        for(Object obj:set){//取出set每个元素赋值给obj,直到循环到set的所有值
            System.out.println(obj);
        }
        System.out.println(set.size());
    }
}
