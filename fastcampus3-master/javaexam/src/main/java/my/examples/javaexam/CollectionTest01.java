package my.examples.javaexam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionTest01 {
    public static void main(String[] args){
        Set<String> set =
                new HashSet<>();
        set.add("hello");
        set.add("!!!");
        set.add("!!!"); // false를 리턴한다.

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
