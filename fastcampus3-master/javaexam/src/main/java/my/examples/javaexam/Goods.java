package my.examples.javaexam;

public class Goods implements Comparable<Goods>{
    private int id;
    private String name;
    private int price;


    // 기본 생성자
    public Goods() {
    }

    public Goods(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // id, name, price 값이 모두 같으면 값이 같은 객체로 판단한다.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Goods goods = (Goods) o;

        if (id != goods.id) return false;
        if (price != goods.price) return false;
        return name != null ? name.equals(goods.name) : goods.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Goods o) {
        return price - o.price;
    }

}


/*

    Goods g1 = new Goods();
    Set<Goods> set = new HashSet<>();
    set.add(g1);
    set.add(g2);
    ...


add(g1)을 할 때 add()메소드 내부에서는 g1이 가지고 있는 hashCode()라는
메소드를 호출하여 hashCode를 구한다.

hashCode에 해당하는 버켓이 있는지 찾는다. 없으면 버켓을 만든다.

버켓은 리스트형인데, 이곳에 g1을 저장한다.

add(g2)를 하면 add()메소드에서는 g2의 hashCode를 구한다. 만약
g2와 g1의 hashCode가 같다면 같은 버켓을 사용한다.

해당 버켓에서 g2와 같은 값을 가지고 있는 객체가 있는지 순차적으로 equals
메소드로 비교하면서 찾는다.
 */


/*
    List에서 원소 2개를 꺼낸다.
    각 원소의 이름을 a, b라고 한다면
    List에서는 다음과 같이 꺼낸다.

    Comparable a = (Comparable)list.get(0);
    Comparable b = (Comparable)list.get(1);

    a.compareTo(b) 로 서로의 값을 비교한다. 그럴려면 compareTo라는
    메소드를 가져야 한다.
 */
