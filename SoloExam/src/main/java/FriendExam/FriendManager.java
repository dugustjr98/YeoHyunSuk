package FriendExam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FriendManager {
    private List<Friend> friendList;
    public FriendManager(){
        friendList = new ArrayList<>();
    }

    //친구 추가하는 기능
    //이름에 해당하는 친구정보들을 반환
    //전화번호에 해당하는 친구를 삭제
    //친구의 수를 반환
    public void addFriend(Friend friend){
        friendList.add(friend);
    }


    public List<Friend> find(){
        List<Friend> list = new ArrayList<>();
        String str ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("찾을 내용을 입력하세요. : ");
        Iterator<Friend> iterator = friendList.iterator();
        str = scanner.nextLine();
        if(iterator.hasNext()){
           for(Friend friend:friendList)
           {
               if(friend.getName().contains(str)){
                   list.add(friend);

               }else if(friend.getPhone().contains(str))
               {
                   list.add(friend);
               }
           }
           if(list.size()==0)
           {
               System.out.println("없습니다.");
           }
        }
        return list;
    }
    public boolean deleteFriend(){
        boolean flag =false;
        String phone;
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        phone = scanner.nextLine();
        for(Friend friend:friendList)
        {
            if(friend.getPhone() == phone)
            {
                flag = true;
                friendList.remove(friend);
                break;
            }
        }
        return flag;
    }

    //for(int i; i<friendList.size();i++){ Friend friend = new Friend(); } 이거랑 for each문이랑 같음
    public int friendNum(){
        return friendList.size();
    }

    @Override
    public String toString() {
        return "FriendManager{" +
                "friendList=" + friendList +
                '}';
    }
}
