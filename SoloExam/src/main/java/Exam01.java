public class Exam01 {
    public static void main(String[] args) {
    Box box = new Box();
    Item item1= new Item();

   // box.add(new Item());
    //box.get();
    item1.x = 100;
    item1.y = 200;
    box.add(item1);
   Item i = box.get();

    System.out.println(item1.x);
    System.out.println(item1.y);
    }
}
