package my.examples.javaexam.fw;

public abstract class Action {

    // 추상 메소드. 메소드를 선언만한다.
    // abstract 리턴타입 메소드명(파라미터들);
    void init(){
        System.out.println("init!!");
    }
    protected abstract void service();

    void destroy(){
        System.out.println("destroy!!");
    }

    public final void run(){
        init();
        service();
        destroy();
    }
}
