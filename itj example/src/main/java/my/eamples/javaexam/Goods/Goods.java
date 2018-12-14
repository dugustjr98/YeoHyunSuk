package my.eamples.javaexam.Goods;

public class Goods implements Comparable<Goods>{
    private int id;
    private String name;
    private int price;

    //기본생성자
    public Goods() {
    }

    public Goods(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }
    //id,name,price 값이 같으면 같다고 값이 같은 객체로 판단한다.

    // this 는 자기자신의 인스턴스를 참조한다.( 인스턴스가 없으면 쓸수 없고 static은 인스턴스가 없어도 사용가능하다.그래서 static메소드안에서는 this를 못쓴다.)
    //getClass() 는 현재 클래스정보를 리턴해줌 클래스정보는 메모리에 한번만 올라감
    @Override //골뱅이는 에노테이션 설정같은 것들 사용할 때 씀
    public boolean equals(Object o) {
        if(this ==o) return true;
        if(o==null||getClass()!=o.getClass()) return false;

        Goods goods = (Goods)o;

        if(id!=goods.id) return false;
        if(price!=goods.price) return false;
        return (name!=null)?(name.equals(goods.name)):(goods.name==null);
    }

    //인스턴스가 다르면 다른 값을 리턴한다. 소수에 특정 값을 곱한다. 되도록 유일한 값을 리턴하도록 만든다.
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }
    /*
    Goods g1 = new Goods();
    Set <Goods> set = new HashSet<>();
    set.add(g1);
    set.add(g2);
    ...

add(g1)을 할 때 add()메소드 내부에서는 g1이 가지고 있는 hashCode()라는 메소드를 호출하여 hashCode를 구한다.

hashcode 에 해당하는 버켓이 있는지 찾는다. 없으면 버켓을 만든다.
버켓도 객체임(리스트 형태 순서를 기억함)
버켓에 g1을 저장한다.

add(g2)를 하면 add()메소드에서는 g2의 hashCode를 구한다. 만약 g2와 g1의 hashCode가 같다면 같은 버켓을 사용한다.
해당 버켓에서 g2와 같은 값을 가지고 있는 객체가 있는지 순차적으로 equals메소드로 비교하면서 찾는다.
이론적으론 버켓이 모두달라야 속도가 빠르다. 버켓의 수와 원소의 수가 같으면 제일 빠르다. (이론적으로)

*/

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
    /*
    List에서 원소 2개를 꺼낸다.
    각 원소의 이름을 a,b라고 한다면

    a.compareTo(b)로 서로의 값을 비교한다. 그러려면 compareTo()라는 메소드를 가져야한다.

    Comparable a = (Comparable)list.get(0);
    Comparabli b = (Comparable)list.get(1);

    기준을 정하는건 객체를 만든 사람이 정하는것
    */
}
