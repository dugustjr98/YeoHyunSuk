package StudentEqToHc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentExam01{
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        Student student1 = new Student("kim",100,80,70);
        Student student2 = new Student("kim",100,80,70);
        Student student3 = new Student("yeo",90,100,90);
        Student student4 = new Student("park",70,90,100);
        Student student5 = new Student("avc",50,60,80);

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        if(student1.equals(student2)){
            System.out.println("1번학생과 2번학생이 같습니다.");
        }else{
            System.out.println("1번학생과 2번학생이 다릅니다.");
        }
        if(student1.equals(student3)){
            System.out.println("1번학생과 3번학생이 같습니다.");
        }else{
            System.out.println("1번학생과 3번학생이 다릅니다.");
        }
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println("------------------------------");
        Collections.sort(list);
        for(Student student:list){
            System.out.println(student);
        }
        System.out.println("------------------------------");
        Collections.sort(list,new KorComparator());
        for(Student student:list){
            System.out.println(student);
        }
        System.out.println("------------------------------");
        Collections.sort(list,new EngComparator());
        for(Student student:list){
            System.out.println(student);
        }
        System.out.println("------------------------------");
        Collections.sort(list,new MathComparator());
        for(Student student:list){
            System.out.println(student);
        }


    }
}
class KorComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getKor()-o2.getKor();
    }
}
class EngComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getEng()-o2.getEng();
    }
}
class MathComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMath()-o2.getMath();
    }
}
