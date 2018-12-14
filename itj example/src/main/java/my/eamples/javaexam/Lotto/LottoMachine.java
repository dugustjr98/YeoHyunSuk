package my.eamples.javaexam.Lotto;

import java.util.*;
public class LottoMachine {
    private List<LottoBall> balls;
    public void setLottoBalls(List<LottoBall> balls){
        this.balls = balls;
    }
    public void mix(){
        Collections.shuffle(balls);
    }
    public List<LottoBall> getLottoBalls(int count){
        List<LottoBall> list =new ArrayList<>();
        for(int i =0;i<count;i++){
            list.add(balls.get(i));
        }
        return list;
    }

}
