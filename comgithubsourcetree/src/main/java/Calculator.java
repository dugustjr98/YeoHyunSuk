public class Calculator {


    public int add(int a,int b){
        return a+b;
    }
    public int minus(int a,int b){
        if(a>b){
            return a-b;
        }else{
            return b-a;
        }
    }
    public int multi(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
}
