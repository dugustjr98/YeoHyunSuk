package students.file;

import java.util.*;

public class StudentsExam {
    public static void main(String[] args) {

        List<Student> list = new ArrayList();
        String str = new String();

        Scanner scanner = new Scanner(System.in);
        int sum1=0;
        int sum2=0;
        int sum3=0;
        float avg1 = 0f;
        float avg2 = 0f;
        float avg3 = 0f;



do {

    Student student = new Student();
    System.out.println("이름을 입력하세요 : ");
    student.setName(scanner.next());
    System.out.println("수학점수를 입력하시오 : ");
    student.setMath(scanner.nextInt());
    System.out.println("영어점수를 입력하시오 : ");
    student.setEng(scanner.nextInt());
    System.out.println("국어점수를 입력하시오 : ");
    student.setKor(scanner.nextInt());

    list.add(student);
    System.out.println("계속 하시겠습니까 ? (y/n)");
    str = scanner.next();
}while(str.equals("y"));

    for(Student stud:list) {
        sum1 += stud.getMath();
        sum2 += stud.getEng();
        sum3 += stud.getKor();
    System.out.println("이름: "+stud.getName()+" 수학:"+stud.getMath()+" 영어:"+stud.getEng()+" 국어:"+stud.getKor());
    }

    avg1 = (float)sum1 / list.size();
    avg2 = (float)sum2 / list.size();
    avg3 = (float)sum3 / list.size();
        System.out.println("총점:     수학: " +sum1+" 영어: "+sum2+" 국어:"+sum3);
        System.out.println("평균:     수학: " +avg1+" 영어: "+avg2+" 국어:"+avg3);

}

}
