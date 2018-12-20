package FriendExam;

public class Data {
    private int value;

    public Data(int value){
        this.value=value;
    }
    //카피생성자라고 불림 그대로 카피해서 생성자에 넣어 주겠다.
    public Data(Data d){
        this.value=d.getValue();
    }
    public int getValue(){
        return value;
    }
    public Data cloneData(){
        Data data = new Data(this.value);
        return data;
    }
}
//불변클래스에 대해 생각해보기
