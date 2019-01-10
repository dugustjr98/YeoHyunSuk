import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a,b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        scanner.nextLine();
        b = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" 무엇을 사용하시겠습니까? ");
        String str= "";
        str= scanner.nextLine();
        switch (str){
            case "+":{
                System.out.println(calculator.add(a,b));
            }
            case "-":{
                System.out.println(calculator.minus(a,b));
            }
            case "*":{
                System.out.println(calculator.multi(a,b));
            }
            case "/":{
                System.out.println(calculator.div(a,b));
            }
        }
    }
}
