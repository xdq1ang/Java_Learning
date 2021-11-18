package hashmap;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Test {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        System.out.println(map.get("a"));
        map.remove("b");
        System.out.println(map.size());
        System.out.println(map.containsKey("a"));
        System.out.println(map.containsValue(2));
        map.put("d",30);
        map.put("e",31);
        map.put("f",32);
        for (String obj:map.keySet()){
            System.out.println(map.get(obj));
        }
        Set<Map.Entry<String,Integer>> entrys = map.entrySet();
        for (Map.Entry<String,Integer> en:entrys){
            System.out.println("key:"+en.getKey()+", value:"+en.getValue());
        }
    }


}
