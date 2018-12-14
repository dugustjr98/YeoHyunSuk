package LottoBall;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LottoMachine{
    List<LottoBall> list ;
    public void setList(List<LottoBall> list){
        this.list = list;

    }
    public void mix(){
        Collections.shuffle(list);
    }
    public List<LottoBall> getList(int count){
       List<LottoBall> result = new ArrayList<>();
       for(int i = 0; i<count;i++)
       {
           result.add(list.get(i));
       }
       return result;
    }
}
