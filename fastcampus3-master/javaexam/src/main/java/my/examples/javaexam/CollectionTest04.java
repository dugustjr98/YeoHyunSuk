package my.examples.javaexam;

import java.util.*;

public class CollectionTest04 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 45; i++){
            //list.add(new Integer(i));
            list.add(i);
        }

        Collections.shuffle(list); // static 메소드

        for(int i = 0; i < 6; i++){
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();
    }
}
