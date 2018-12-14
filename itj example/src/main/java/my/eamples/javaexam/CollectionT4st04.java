package my.eamples.javaexam;

import java.util.*;

public class CollectionT4st04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
       // Random random = new Random();
        int num1 = 0;
        int num2 = 0;

       // num1 = random.nextInt(45);
   //num2 = random.nextInt(45);
//Math.random() 0.0 <= x <1.0 실수
        for (int i = 1; i < 46; i++) {
            list.add(i); // = list.add(new Integer(i));

        }
        /*for(int n = 0;n<1000;n++)
        {
           num1= (int)(Math.random()*45);
           num2= (int)(Math.random()*45);
           if(num1!=num2){
               Integer tmp = list.get(num1);
               list.set(num1,list.get(num2));
               list.set(num2,tmp);
           }
            /*tmp = list.get(num1);
            list.add(num1,list.get(num2));
            list.add(num2,tmp);

        }*/
// 이것을 줄여서 Collections.shuffle(list); 쓰면 간편함.
        Collections.shuffle(list);
        for(int j=0;j<6;j++) {

            System.out.print(list.get(j)+" ");
        }



    }
}
