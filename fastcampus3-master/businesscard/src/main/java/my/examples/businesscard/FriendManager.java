package my.examples.businesscard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 메모리에 친구를 관리하고 싶다.
 */
public class FriendManager {
    private List<Friend> friendList;
    public FriendManager(){
        friendList = new ArrayList<>();
    }

    // 친구추가
    public void add(Friend friend){
        friendList.add(friend);
    }

    // 이름에 해당하는 친구정보들을 반환
    public List<Friend> getList(String name){
        List<Friend> newList = new ArrayList<>();
        for(Friend friend: friendList){
            if(friend.getName().contains(name)){
                newList.add(friend);
            }
        }
        return newList;
    }
    // 전화번호에 해당하는 친구를 삭제
    public int del(String phone){
        int deleteCount = 0;
        Iterator<Friend> iterator = friendList.iterator();
        while(iterator.hasNext()){
            Friend friend = iterator.next();
            if(friend.getPhone().equals(phone)){
                iterator.remove();
                deleteCount++;
            }
        }

        return deleteCount;
    }
    // 친구의 수를 반환

    public int count(){

        return friendList.size();
    }
}
