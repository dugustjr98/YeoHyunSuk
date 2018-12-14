package my.eamples.javaexam;

public class Exam05 {
    public static void main(String[] args) {
        Box box = new Box();
        Item item1 = new Item();
        item1.x = 100;
        item1.y = 200;
        box.add(item1);
        Item i =box.get();
        System.out.println(i.x);
        System.out.println(i.y);
    }
}
//Box 클래스
//i가 참조하는 것은 무엇이냐
