package my.examples.businesscard;

import java.util.List;
import java.util.Scanner;

public class FriendUI {
    public int printMenuAndInputValue(){
        System.out.println("1. 친구등록");
        System.out.println("2. 이름조회");
        System.out.println("3. 전화번호로 삭제");
        System.out.println("4. 종료");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        return value;
    }

    public Friend getFriend(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하시오.");
        String name = scanner.nextLine();
        System.out.println("전화번호를 입력하시오.");
        String phone = scanner.nextLine();
        Friend friend = new Friend(name);
        friend.setPhone(phone);
        return friend;
    }

    public String inputName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요.");
        String name = scanner.nextLine();
        return name;
    }

    public String inputPhone(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("전화번호를 입력하세요.");
        String phone = scanner.nextLine();
        return phone;
    }

    public void printFriends(List<Friend> friends){
        System.out.println("이름       전화번호");
        for(Friend friend : friends){
            System.out.println(friend.getName() + "   " + friend.getPhone());
        }

    }

    public void printDeleteFriendReport(int count){
        System.out.println(count + " 수의 친구정보를 삭제!!");
    }
}
