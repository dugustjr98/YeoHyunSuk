package my.eamples.javaexam.fw;

public abstract class Action {

//   추상 메소드라고 하고 메소드를 선언만 한다.
//    abstract  리턴타입 메소드명 (파라미터들)
    void init(){
        System.out.println("init!!");
    };
    abstract void service();
    void destroy(){};

    public void run(){
        init();
        service();
        destroy();
    }
}
