package my.examples.javaexam;

public class Exam07 {
    public static void main(String[] args){
        GenericBox<Integer> box = new GenericBox<>();
        box.set(new Integer(5));
        Integer int1 = box.get();
        System.out.println(int1.toString());
    }
}
// GenericBox 클래스를 만들어주세요.