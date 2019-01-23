package my.examples.javaexam;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest02 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("hello"); // index 0
        list.add("world"); // index 1
        list.add("!!!"); // index 2

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
