package FriendExam;

import org.junit.Before;
import org.junit.Test;

public class FriendTest {
    FriendManager friendManager;

    @Before
    public void init(){
        friendManager = new FriendManager();
        Friend f1 = new Friend("홍길동");
        f1.setPhone("010-0000-0000");
        friendManager.addFriend(f1);

        Friend f2 = new Friend("둘리");
        f2.setPhone("010-0000-1111");
        friendManager.addFriend(f2);

        Friend f3 = new Friend("도우너");
        f3.setPhone("010-0000-222");
        friendManager.addFriend(f3);
    }

    @Test
    public void addFriend() throws Exception{
        int size = friendManager.friendNum();
        Friend f = new Friend("마이콜");
        f.setPhone("010-0000-3333");
        friendManager.addFriend(f);
        int size2 = friendManager.friendNum();
        if(size2 == (size + 1)){
            System.out.println("성공");
        }else{
            System.out.println("-_-;");
        }
    }
    @Test
    public void deleteFriend() throws Exception{
        boolean deleteCount = friendManager.deleteFriend();
        if(deleteCount == true){
            System.out.println("성공!");
        }else{
            System.out.println("-_-;");
        }
    }
}
