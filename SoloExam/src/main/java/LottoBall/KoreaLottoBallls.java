package LottoBall;
import java.util.*;
public class KoreaLottoBallls implements BallsFactory {
    @Override
    public List<LottoBall> createBall() {
        List<LottoBall> list = new ArrayList<>();
        for(int i =1; i<=45;i++){
            list.add(new LottoBall(i));
        }

        return list;
    }
}
