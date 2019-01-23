package my.examples.businesscard;

import java.util.List;

public class FriendMain {
    public static void main(String[] args){
        FriendUI ui = new FriendUI();
        FriendManager friendManager = new FriendManager();
        while(true){
            int menu = ui.printMenuAndInputValue();
            if(menu == 1){
                Friend friend = ui.getFriend();
                friendManager.add(friend);
            }else if(menu == 2){
                String name = ui.inputName();
                List<Friend> list = friendManager.getList(name);
                ui.printFriends(list);
            }else if(menu == 3){
                String phone = ui.inputPhone();
                int count = friendManager.del(phone);
                ui.printDeleteFriendReport(count);
            }else if(menu == 4){
                System.out.println("다음에 봐요.");
                break;
            }else{
                System.out.println("뭐냐!");
            }

            System.out.println("-------------------------");
        }
    }
}
