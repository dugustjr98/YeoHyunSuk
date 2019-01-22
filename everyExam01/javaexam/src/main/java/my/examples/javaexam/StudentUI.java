package my.examples.javaexam;

import java.util.Scanner;

public class StudentUI {

    public Student inputStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요.");
        String name = scanner.nextLine();
        System.out.println("국어 점수를 입력하세요.");
        int kor = scanner.nextInt();
        System.out.println("영어 점수를 입력하세요.");
        int eng = scanner.nextInt();
        System.out.println("수학 점수를 입력하세요.");
        int math = scanner.nextInt();

        Student student = new Student(name, kor, eng, math);
        return student;
    }

    public String inputContinue(){
        System.out.println("계속 입력하시겠습니까?");
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        return result;
    }
}
