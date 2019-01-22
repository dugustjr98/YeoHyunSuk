package my.examples.javaexam;

import java.util.Iterator;

public class StudentExam {
    public static void main(String[] args){
        StudentUI studentUI = new StudentUI();
        StudentManager studentManager = new StudentManager();
        while(true){
            Student student = studentUI.inputStudent();
            studentManager.addStudent(student);
            String result = studentUI.inputContinue();
            if("Y".equals(result.toUpperCase())){
                continue;
            }else{
                break;
            }
        }

        Iterator<Student> iterator =
                studentManager.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            System.out.print(student.getName());
            System.out.print("\t");
            System.out.print(student.getKor());
            System.out.print("\t");
            System.out.print(student.getEng());
            System.out.print("\t");
            System.out.println(student.getMath());
        }

        System.out.print(studentManager.getKorTotal());
        System.out.print("\t");
        System.out.print(studentManager.getEngTotal());
        System.out.print("\t");
        System.out.println(studentManager.getMathTotal());

        System.out.print(studentManager.getKorAvg());
        System.out.print("\t");
        System.out.print(studentManager.getEngAvg());
        System.out.print("\t");
        System.out.println(studentManager.getMathAvg());
    }
}
