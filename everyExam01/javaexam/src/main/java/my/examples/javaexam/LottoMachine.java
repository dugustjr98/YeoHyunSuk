package my.examples.javaexam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoMachine {
    private List<LottoBall> balls;

    public void setLottoBalls(List<LottoBall> balls){
        this.balls = balls;
    }

    public void mix(){
        Collections.shuffle(balls);
    }

    public List<LottoBall> getLottoBalls(int count){
        List<LottoBall> result = new ArrayList<>();
        for(int i = 0; i < count; i++){
            result.add(balls.get(i));
        }
        return result;
    }
}
