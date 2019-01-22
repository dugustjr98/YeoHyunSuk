package my.examples.javaexam;

/*
Car 는 추상클래스다.
실제 인스턴스는 될 수 없지만, 일반화시키는 목적으로 사용된다.
ex> Bus는 Car다.
    SportsCar 는 Car의 종류다.
 */
public abstract class Car {
    public void run(){
        System.out.println("전륜구동하다.");
    }
}
