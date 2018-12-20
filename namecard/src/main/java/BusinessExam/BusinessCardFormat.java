package BusinessExam;

import java.util.Scanner;

public class BusinessCardFormat {
    BusinessCardUI businessCardUI = new BusinessCardUI();
    BusinessCardDAO businessCardDAO = new BusinessCardDAO();
    private String v ;

    public void doit() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1.명함 추가  2.명함 삭제  3.명함 찾기  4.명함파일저장  5.명함파일불러오기  6.전체명함 출력  7.종료");
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
                case "4": {
                    businessCardDAO.saveCard();
                    System.out.println("파일이 저장되었습니다");
                    break;
                }
                case "5": {
                    businessCardDAO.loadCard();
                    System.out.println("파일이 로드되었습니다.");
                    break;
                }
                case "6":{
                    for(BusinessCard businessCard:businessCardDAO.businessCardData.getBusinessCardList())
                    {
                        System.out.println(businessCard);
                    }
                }
            }
            if(v.equals("7"))
                break;
        }
    }
}
