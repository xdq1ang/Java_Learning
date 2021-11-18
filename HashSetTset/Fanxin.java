package HashSetTset;

import java.util.HashSet;
import java.util.Set;
public class Fanxin {
    public static void main(String[] args){
        Set<String> set = new HashSet<String>();
        set.add("1");
        set.add("b");
        for (Object obj:set){
            System.out.println(obj);
        }
    }
}
