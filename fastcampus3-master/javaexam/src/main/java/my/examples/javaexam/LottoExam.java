package my.examples.javaexam;

import java.util.ArrayList;
import java.util.List;

public class LottoExam {
    public static void main(String[] args){
        // 45개의 볼을 list에 넣는다.
        LottoBallFactory factory =
                new KoreaLottoBallFactory();
        List<LottoBall> balls = factory.createLottoBalls();

        LottoMachine lottoMachine = new LottoMachine();
        lottoMachine.setLottoBalls(balls);
        lottoMachine.mix();
        List<LottoBall> result = lottoMachine.getLottoBalls(6);

        for(LottoBall ball : result){
            System.out.println(ball.getNumber());
        }
    }
}
