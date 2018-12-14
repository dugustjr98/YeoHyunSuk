public class Box {
   private Item item ;
   private int tmp;
   public void add(Item item){
       this.item=item;
       tmp = item.x;
       item.x=item.y;
       item.y=tmp;
   }
    public Item get(){
       return item;
   }
}
