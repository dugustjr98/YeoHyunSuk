package my.examples.javaexam;

import java.util.ArrayList;
import java.util.List;

public class KoreaLottoBallFactory implements LottoBallFactory{
    @Override
    public List<LottoBall> createLottoBalls() {
        List<LottoBall> balls = new ArrayList<>();
        for(int i = 1; i <= 45; i++){
            balls.add(new LottoBall(i));
        }
        return balls;
    }
}
