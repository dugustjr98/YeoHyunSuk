package my.examples.javaexam;

public class Exam05 {
    public static void main(String[] args){
        Box box = new Box();
        Item item1 = new Item();
        item1.x = 100;
        item1.y = 200;
        box.add(item1);
        Item i = box.get();
        System.out.println(i.x);
        System.out.println(i.y);
    }
}

// i 가 참조하는 것은 무엇인가? 그 이유를 설명하시오.
// 결과가 왜 이렇게 나오는가?