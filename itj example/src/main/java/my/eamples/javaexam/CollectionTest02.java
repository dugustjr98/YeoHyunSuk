package my.eamples.javaexam;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");//0번째
        list.add("world");//1번째
        list.add("!!!");  //2번째

        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}
