package my.examples.javaexam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentManager {
    List<Student> studentList;

    public StudentManager(){
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public Iterator<Student> iterator(){
        return studentList.iterator();
    }

    public int getKorTotal(){
        int korTotal = 0;
        for(Student student : studentList){
            korTotal += student.getKor();
        }
        return korTotal;
    }

    public int getMathTotal(){
        int mathTotal = 0;
        for(Student student : studentList){
            mathTotal += student.getMath();
        }
        return mathTotal;
    }

    public int getEngTotal(){
        int mathTotal = 0;
        for(Student student : studentList){
            mathTotal += student.getEng();
        }
        return mathTotal;
    }

    public double getKorAvg(){
        return getKorTotal() / (double)studentList.size();
    }

    public double getEngAvg(){
        return getEngTotal() / (double)studentList.size();
    }

    public double getMathAvg(){
        return getMathTotal() / (double)studentList.size();
    }
}
