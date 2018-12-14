package my.eamples.javaexam;

import java.util.Collection;
import java.util.HashSet;        //메모리에 안올라감
import java.util.Iterator;
import java.util.Set;


public class CollectionTest01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hello ");
        set.add("!!!");
        set.add("!!!");// false 를 리턴함

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
