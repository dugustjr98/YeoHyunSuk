package LottoBall;

import java.util.ArrayList;
import java.util.List;

public class LottoExam01 {
    public static void main(String[] args) {

        LottoMachine lottoMachine = new LottoMachine();
        KoreaLottoBallls koreaLottoBallls = new KoreaLottoBallls();
        List<LottoBall> list1 = new ArrayList<>();
        list1 = koreaLottoBallls.createBall();

        lottoMachine.setList(list1);
        lottoMachine.mix();
        List<LottoBall> result = lottoMachine.getList(7);
       for(LottoBall lottoBall:result){
           System.out.println(lottoBall.getNumber());
       }


    }
}
