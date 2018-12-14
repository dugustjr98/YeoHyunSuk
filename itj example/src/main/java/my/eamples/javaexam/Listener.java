package my.eamples.javaexam;

public interface Listener {
    public default void info(){
        System.out.println("Listener입니다.");
    } // 구현할 떄 default 를 사용한다. 자바 1.8부터 구현가능

    public void listen(); // 메소드를 선언만 한다. abstract가 없다.(생략가능한것)
}
