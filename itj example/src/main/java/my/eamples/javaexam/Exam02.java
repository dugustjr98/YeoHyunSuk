package my.eamples.javaexam;

public class Exam02 {
    public static void main(String[] args) {
Bus b1 = new Bus();
Bus b2=b1;


//        Car c1 = new Car();
        // Car는 추상클래스기 떄문에 인스턴스로 만들 수 없다.
    Bus bus = new Bus();
    bus.run();
    bus.안내방송();

    Car bus2 = new Bus();
    bus2.run();
//   ((Bus) bus2).안내방송();
        SportsCar s1 = new SportsCar();
        s1.run();

        Car s2 = new SportsCar();//  Car의 메소드만 쓸 수 있지만 스포츠카의 메소드가 사용된다.
        s2.run();

    }
}
