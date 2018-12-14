package my.eamples.javaexam;

public class GenericBox<T> {
    private T obj;
    public void set(T obj){
        this.obj = obj;
    }
    public T get(){
        return obj;
    }
}

// T = Generic Type     타입이 결정되어 있지 않음
