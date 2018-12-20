package BusinessExam;

import java.util.ArrayList;
import java.util.Scanner;

public class BusinessCardFormat {
    BusinessCardUI businessCardUI = new BusinessCardUI();
    BusinessCardDAO businessCardDAO = new BusinessCardDAO();
    private String v ;

    public void doit() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1.명함 추가  2.명함 삭제  3.명함 찾기  4. 명함 수정  5.명함파일저장  6.명함파일불러오기  7.전체명함 출력  8.종료");
            v = scanner.nextLine();

            switch (v) {
                case "1":
                    while (true) {
                        businessCardDAO.addCard(businessCardUI.inputCard());
                        if (businessCardUI.inputContinue().equals("n")) {
                            break;
                        }
                    }
                    break;
                case "2": {
                    int id;
                    System.out.println("id값을 입력하시오 : ");
                    id = scanner.nextInt();
                    businessCardDAO.deleteCard(id);
                    break;
                }
                case "3": {
                    System.out.println("무엇으로 검색하시겠습니까? (n/p/c/id)");
                    String find = scanner.nextLine();
                    if (find.equals("n")) {
                        System.out.println("이름이 무엇입니까? : ");
                        String name = scanner.nextLine();
                        for(BusinessCard businessCard:businessCardDAO.businessCardData.getBusinessCardList()){
                            System.out.println(businessCardDAO.findnameCard(name));
                            break;
                        }
                        break;
                    } else if (find.equals("p")) {
                        System.out.println("번호가 무엇입니까? : ");
                        String phone = scanner.nextLine();
                        for(BusinessCard businessCard:businessCardDAO.businessCardData.getBusinessCardList()) {
                            System.out.println(businessCardDAO.findphoneCard(phone));
                            break;
                        }
                        break;
                    } else if (find.equals("c")) {
                        System.out.println("회사명이 무엇입니까? : ");
                        String corporation = scanner.nextLine();
                        for(BusinessCard businessCard:businessCardDAO.businessCardData.getBusinessCardList()) {
                            System.out.println(businessCardDAO.findCorCard(corporation));
                            break;
                        }
                        break;
                    } else if (find.equals("id")){
                        System.out.println("id값이 무엇입니까? : ");
                        int id = scanner.nextInt();
                        System.out.println(businessCardDAO.businessCardData.get(id));
                        break;
                    }
                    else {
                        System.out.println("잘못 입력하셨습니다.");
                        break;
                    }
                }
                case "4":{
                    System.out.println("무슨 id 를 수정하시겠습니까? : ");
                    BusinessCard businessCardEdit = new BusinessCard();
                    //scanner.nextLine();
                    int m = scanner.nextInt();
                    for(BusinessCard businessCard:businessCardDAO.businessCardData.getBusinessCardList())
                    {
                        if(businessCard.getId()==m)
                        {
                            businessCardEdit = businessCard;
                            scanner.nextLine();
                            break;
                        }
                    }
                    //scanner.nextLine();
                    System.out.println("어떤 값을 수정하시겠습니까? : (n/p/c)");
                    String value = scanner.nextLine();
                    //scanner.nextLine();

                    switch(value){
                        case "n":{
                            System.out.println("어떻게 수정하시겠습니까 ? ");
                            String editValue=scanner.nextLine();
                            businessCardEdit.setName(editValue);
                            break;
                        }
                        case "p":{
                            System.out.println("어떻게 수정하시겠습니까 ? ");
                            String editValue=scanner.nextLine();
                            businessCardEdit.setPhone(editValue);
                            break;
                        }
                        case "c": {
                            System.out.println("어떻게 수정하시겠습니까 ? ");
                            String editValue=scanner.nextLine();
                            businessCardEdit.setCorporationName(editValue);
                            break;
                        }
                    }
                    System.out.println(businessCardEdit);
                    break;
                }
                case "5": {
                    businessCardDAO.saveCard();
                    System.out.println("파일이 저장되었습니다");
                    break;
                }
                case "6": {
                    businessCardDAO.loadCard();
                    System.out.println("파일이 로드되었습니다.");
                    break;
                }
                case "7":{
                    for(BusinessCard businessCard:businessCardDAO.businessCardData.getBusinessCardList())
                    {
                        System.out.println(businessCard);
                    }
                }

            }
            if(v.equals("8"))
                break;
        }
    }
}
