package my.examples.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box {
    private List<String> list;

    public Box(){
        list = new ArrayList<>();
    }

    public void methodA(){
        synchronized (list) {
            for (int i = 1; i < 1000; i++) {
                list.add(i + "");
            }
        }
    } // methodA

    public void methodB(){
        synchronized (list) {
            for (int i = 1; i < 1000; i++) {
                try {
                    list.remove(0);
                } catch (Exception ignore) {
                }
            }
        }
    } // methodA

    public void methodC(){
        synchronized (list) {
            for (int x = 0; x < 1000; x++) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    System.out.println(list.get(i));
                }
            }

        }
    } // methodA
}
