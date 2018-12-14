package my.eamples.javaexam;

/*
Car 는 추상클래스다.
실제 인스턴스는 될 수 없지만, 일반화시키는 목적으로 사용된다.
ex) Bus 는 Car다.

*/
public abstract class Car {
    public void run(){
        System.out.println("전륜 구동하다 ");
    }

}
