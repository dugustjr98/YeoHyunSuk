package my.examples.javaexam;

public class Exam02 {
    public static void main(String[] args){
        Bus b1 = new Bus();
        Bus b2 = b1;

        int i1 = 5;
        int i2 = i1;

// Car는 추상클래스기 때문에 인스턴스로 만들 수 없다.
//        Car c1 = new Car();
        Bus bus = new Bus();
        bus.run();
        bus.안내방송();

        Car bus2 = new Bus();
        bus2.run();
//        bus2.안내방송();

        SportsCar s1 = new SportsCar();
        s1.run();

        Car s2 = new SportsCar();
        s2.run();

    }
}

// Car , Bus, SportsCar 클래스를 만든다.

