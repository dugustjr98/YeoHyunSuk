package my.eamples.javaexam;

public class ObjectBox {
    private Object obj;  //필드

    public void set(Object obj){
        this.obj=obj;
    }

    public Object get(){
        return obj;
    }
}

//Object클래스는 모든 클래스의 촤상위 클래스
//아무것도 상속받지 않으면 자동으로 Object를 상속받는다.
//public class ObjectBox = public class ObjectBox extends Object
