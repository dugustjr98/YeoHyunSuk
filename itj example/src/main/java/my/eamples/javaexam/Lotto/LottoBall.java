package my.eamples.javaexam.Lotto;

public class LottoBall {
    private int number;//필드

    public LottoBall(int number) {
        this.number=number;
    }

    //public void LottoBall(int number){
      //  this.number = number;
    //}
    public int getNumber(){
        return number;
    }//-> 이런 메소드 getter메소드 ,number프로퍼티
}
