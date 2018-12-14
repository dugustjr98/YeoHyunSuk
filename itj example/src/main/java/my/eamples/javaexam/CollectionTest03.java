package my.eamples.javaexam;

import java.util.HashMap;
import java.util.*;


public class CollectionTest03 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
    map.put("001","둘리");
        map.put("002","도우너");
        map.put("003","또");
        System.out.println(map.get("002"));

        //모든 key들을 출력하시오.

        System.out.println(map.keySet());
        //모든 key 와 value 를 출력하시오
        Set<String> keys = map.keySet();
        Iterator<String> keyIter = keys.iterator();
        while(keyIter.hasNext()){
            String key = keyIter.next();
            System.out.println(key + " : " +map.get(key));
        }

    }
}
