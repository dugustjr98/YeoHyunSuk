package my.eamples.javaexam;

public class Exam06 {
    public static void main(String[] args) {

        Integer int2 = new Integer(5);
        Object int3 = int2;


        ObjectBox objectBox = new ObjectBox();

        Integer int1= new Integer(5);
       // Double int1=new Double(50.5);

        objectBox.set(int1);
        Integer obj = (Integer)objectBox.get();
        System.out.println((int1.toString()));

    }
}


//ObjectBox클래스 만들