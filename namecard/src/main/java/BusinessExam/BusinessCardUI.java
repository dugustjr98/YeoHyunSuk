package BusinessExam;

import java.util.Scanner;

public class BusinessCardUI {

    public BusinessCard inputCard(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요.");
        String name = scanner.nextLine();
        System.out.println("전화번호를 입력하세요. : ");
        String phone = scanner.nextLine();
        System.out.println("회사 주소를 입력하세요. : ");
        String corporationName = scanner.nextLine();


        BusinessCard businessCard = new BusinessCard(name,phone,corporationName);
        return businessCard;
    }

    public String inputContinue(){
        System.out.println("계속 입력하시겠습니까?");
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        return result;
    }
}
