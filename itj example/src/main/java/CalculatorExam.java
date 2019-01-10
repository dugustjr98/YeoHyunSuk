import java.util.Scanner;

public class CalculatorExam {
    public static void main(String[] args) {
        int a,b,c;
        String operator = "";
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();
        scanner.nextLine();
        b=scanner.nextInt();
        scanner.nextLine();


        switch (operator){
            case "+" :{
                c=a+b;
            }
            case "-" :{
                c=a-b;
            }
            case "*":{
                c=a*b;
            }
            case "/":{
                c=a/b;
            }

        }
    }
}
