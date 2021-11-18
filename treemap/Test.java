package treemap;

import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args){
        Map<Integer,String> map = new TreeMap<Integer,String>();
        map.put(4,"a");
        map.put(3,"a");
        map.put(2,"a");
        System.out.println(map);
        Map<String,String> map1 = new TreeMap<String,String>();
        map1.put("b","a");
        map1.put("c","a");
        map1.put("a","a");
        System.out.println(map1);
    }
}

