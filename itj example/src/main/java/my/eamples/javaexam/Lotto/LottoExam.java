package my.eamples.javaexam.Lotto;
import java.util.*;
public class LottoExam {
    public static void main(String[] args) {


            List<LottoBall> balls = new ArrayList<>();
            for(int i=1;i<=45;i++){
                balls.add(new LottoBall(i));
            }
        LottoMachine lottoMachine = new LottoMachine();
            lottoMachine.setLottoBalls(balls);
            lottoMachine.mix();
            List<LottoBall> result = lottoMachine.getLottoBalls(6);

            for(LottoBall ball:result){
                System.out.println(ball.getNumber());
            }

    }
}
