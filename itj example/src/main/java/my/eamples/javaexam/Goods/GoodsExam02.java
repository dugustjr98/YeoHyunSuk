package my.eamples.javaexam.Goods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GoodsExam02 {
    public static void main(String[] args) {
        Goods g1 = new Goods(1,"java",1000);
        Goods g2 = new Goods(1,"java",1000);
        Goods g3 = new Goods(2,"jaa",4000);
        Goods g4 = new Goods(3,"jaffa",5000);

        List<Goods> list = new ArrayList<>();
        list.add(g1);
        list.add(g2);
        list.add(g3);
        list.add(g4);

        System.out.println("---------------------------");
        Collections.sort(list);
        for(Goods goods :list){
            System.out.println(goods);
        }
        System.out.println("---------------------------");
        //람다 표기법 이름없는 객체를 생성하는 방법
        //람다 인터페이스
        //람다 식

        Collections.sort(list,new NameComparator());
        for(Goods goods :list){
            System.out.println(goods);
        }

    }


}
class NameComparator implements Comparator<Goods> {
    @Override
    public int compare(Goods o1, Goods o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
/* 기준을 정해주는 법을 배움*/
