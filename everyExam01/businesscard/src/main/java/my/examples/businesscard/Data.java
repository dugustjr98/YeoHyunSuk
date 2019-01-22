package my.examples.businesscard;

/*
Data d1 = new Data(100);
Data d2 = new Data(d1);
System.out.println(d2.getValue());
 */
public class Data {
    private int value;

    public Data(int value){
        this.value = value;
    }

    public Data(Data d){
        this.value = d.getValue();
    }

    public int getValue() {
        return value;
    }

    public Data cloneData(){
        Data data = new Data(this.value);
        return data;
    }
}
