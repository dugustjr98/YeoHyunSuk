package my.examples.javaexam;

import my.examples.javaexam.fw.Action;
import my.examples.javaexam.my.MyAction;

public class Exam03 {
    public static void main(String[] args){
        Action action = new MyAction();
        action.run();
    }
}

// 추상 클래스 Action , Action을 상속받는 MyAction 클래스를 작성한다.