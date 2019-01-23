package my.examples.javaexam;

public class ObjectBox {
    private Object obj; // 필드

    public void set(Number obj){
        this.obj = obj;
    }

    public Object get(){
        return obj;
    }
}

// 아무것도 상속받지 않으면 자동으로 Object를 상속받는다.
// public class ObjectBox
// public class ObjectBox extends Object
// Object obj = new ObjectBox(); ( O )