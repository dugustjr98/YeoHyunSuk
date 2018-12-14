package my.eamples.javaexam;

//Item 을 한개 저장하고 , Item 을 꺼내고 싶다.
//Item을 한개 가질 수 있는 상자
//Box가 태어날 때 부터 Item을 가지고 태어나는 것은 아니다.

public class Box {
    private Item item; // null을 가진다. 참조하는게 없다.

    public void add(Item item){
        this.item = item;
        int tmp = this.item.x;
        this.item.x = this.item.y;
        this.item.y = tmp;
    }

    public Item get(){
        return item;
    }
}
