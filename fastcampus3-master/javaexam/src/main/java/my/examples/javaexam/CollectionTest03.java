package my.examples.javaexam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionTest03 {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("001", "둘리");
        map.put("002", "도우너");
        map.put("003", "또치");

        System.out.println(map.get("002"));
        System.out.println(map.get("004"));

        // 모든 key, value들을 출력하시오.
        Set<String> keys = map.keySet();
        Iterator<String> keyIter = keys.iterator();
        while(keyIter.hasNext()){
            String key = keyIter.next();
            System.out.println(key + " : " + map.get(key));
        }
    }
}
