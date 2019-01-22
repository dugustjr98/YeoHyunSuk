package my.examples.javaexam;

public interface Listener {
    public default  void info(){
        System.out.println("Listener입니다.");
    }
    public void listen(); // 메소드를 선언만한다. abstract가 없다.
}
